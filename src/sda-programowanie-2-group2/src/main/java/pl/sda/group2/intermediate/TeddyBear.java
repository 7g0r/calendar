package pl.sda.group2.intermediate;

class TeddyBear extends Animal {
    @Override
    public void eat() {
        throw new IDontEatException();
    }
}
