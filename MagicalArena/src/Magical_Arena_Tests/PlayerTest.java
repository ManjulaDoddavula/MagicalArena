package Magical_Arena_Tests;

import Magical_Arena.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PlayerTest {
    @Test
    public void testPlayerInitialization() {
        Player player = new Player(50, 5, 10);
        assertEquals(50, player.getHealth());
        assertEquals(5, player.getStrength());
        assertEquals(10, player.getAttack());
    }

    @Test
    public void testPlayerIsAlive() {
        Player player = new Player(50, 5, 10);
        assertTrue(player.isAlive());
        player.setHealth(0);
        assertFalse(player.isAlive());
    }
}