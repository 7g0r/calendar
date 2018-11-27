package pl.sda.group2.intermediate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TeddyBearTest {
    @Test
    void shouldThrowExceptionWhenTeddyBearEat() {
        //given
        Animal animal = new TeddyBear();

        //then
//        assertThrows(IDontEatException.class, () -> animal.eat());
        assertThrows(IDontEatException.class, animal::eat);
    }

}