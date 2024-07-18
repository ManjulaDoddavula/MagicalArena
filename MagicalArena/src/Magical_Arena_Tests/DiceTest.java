package Magical_Arena_Tests;

import Magical_Arena.Dice;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DiceTest {
    @Test
    public void testDiceRoll() {
        Dice dice = new Dice();
        for (int i = 0; i < 100; i++) {
            int roll = dice.roll();
            assertTrue(roll >= 1 && roll <= 6);
        }
    }
}