package pl.sda.group2.intermediate;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

class PolarBearTest {
    @Test
    void shouldBeAliveAfterCreation() {
        //given
        Animal animal = new PolarBear();
        //then
        assertTrue(animal.isAlive());
    }

    @Test
    void shouldBeAliveAfterEating() {
        //given
        Animal animal = new PolarBear();
        //when
        animal.eat();
        //then
        assertTrue(animal.isAlive());
    }
    @Test
    void shouldBeDeadIfEat11DaysBefore() {
        //given
        Animal animal = spy(new PolarBear());
        //when
        LocalDateTime value = LocalDateTime.now().minusDays(11);
        when(animal.getLastEatTime()).thenReturn(value);
        //then
        assertFalse(animal.isAlive());
    }


}