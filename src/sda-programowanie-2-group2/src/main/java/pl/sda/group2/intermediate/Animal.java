package pl.sda.group2.intermediate;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

abstract class Animal {
    private int weight;
    private LocalDateTime lastEatTime;

    public Animal() {
        lastEatTime = LocalDateTime.now();
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public LocalDateTime getLastEatTime() {
        return lastEatTime;
    }

    public boolean isAlive() {
        LocalDateTime tenDaysBeforeNow = LocalDateTime.now().minus(10, ChronoUnit.DAYS);
        return getLastEatTime().isAfter(tenDaysBeforeNow);
    }

    public void eat() {
        this.lastEatTime = LocalDateTime.now();
    }

    void display() {
        System.out.println("Jestem niedziedziem " +
                getClass().getSimpleName() + " waze " + getWeight() + " kg.");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
