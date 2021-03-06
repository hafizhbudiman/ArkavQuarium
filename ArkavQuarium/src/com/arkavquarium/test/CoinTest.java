package com.arkavquarium.test;

import static org.junit.jupiter.api.Assertions.*;

import com.arkavquarium.Coin;
import com.arkavquarium.Point;

import org.junit.jupiter.api.Test;

class CoinTest {
    @Test
    public void testConstructorCoinEmpty() {
        Coin c = new Coin();
        double expectedX = -1.0;
        double expectedY = -1.0;
        assertEquals(expectedX,c.getX());
        assertEquals(expectedY,c.getY());

    }

    @Test
    public void testConstructorCoinWithParameters() {
        Point p = new Point(2.0,3.0);
        Coin c = new Coin(p,3);
        double expectedX = 2.0;
        double expectedY = 3.0;
        assertEquals(expectedX,c.getX());
        assertEquals(expectedY,c.getY());
    }

}