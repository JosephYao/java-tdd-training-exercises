package com.game2048;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestTileTextToDisplay {

    @Test
    public void number_2_is_convert_to_character_A() {
        assertTextEquals("A", 2);
    }

    @Test
    public void number_4_is_convert_to_character_B() {
        assertTextEquals("B", 4);
    }

    @Test
    public void number_8_is_convert_to_character_C() {
        assertTextEquals("C", 8);
    }

    @Test
    public void show_empty_string_when_number_is_0() {
        assertTextEquals("", 0);
    }

    private void assertTextEquals(String expected, int number) {
        Game2048.Tile tile = new Game2048.Tile(number);
        assertEquals(expected, tile.textToDisplay());
    }

}
