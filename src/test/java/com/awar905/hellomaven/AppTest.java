package com.awar905.hellomaven;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.awar905.hellomaven.Psr;

/**
 * Unit test for simple App.
 */
public class AppTest {

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    /**
     * Test transformation of integer to Psr.Move with null handling
     */
    @Test
    public void intToPsrMove() {
      assertTrue(Psr.intToMove(0).isPresent());
      assertTrue(Psr.intToMove(1).isPresent());
      assertTrue(Psr.intToMove(2).isPresent());
      assertTrue(!Psr.intToMove(3).isPresent());
    }
}
