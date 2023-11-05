package com.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class UnitTest 
{
    private calculator calc;
    private double delta = 1e-6;

    @Before
    public void start() {
        calc = new calculator();
    }

    @Test
    public void add_pos() {
        double a = 10.15, b = 21.94;
        double expected = 32.09;
        assertEquals(expected, calc.addition(a, b), delta);
    }

    @Test 
    public void add_neg() {
        double a = 10.14, b = 9.36;
        double expected = 109;
        assertNotEquals(expected, calc.addition(a, b), delta);
    }

    @Test
    public void sub_pos() {
        double a = 99.61, b = 74.49;
        double expected = 25.12;
        assertEquals(expected, calc.subtraction(a, b), delta);
    }

    @Test 
    public void sub_neg() {
        double a = 56.45, b = 78.97;
        double expected = 12.48;
        assertNotEquals(expected, calc.subtraction(a, b), delta);
    }

    @Test
    public void mult_pos() {
        double a = 55.20, b = 45.97;
        double expected = 2537.544;
        assertEquals(expected, calc.multiplication(a, b), delta);
    }

    @Test 
    public void mult_neg() {
        double a = 3.4, b = 7.5;
        double expected = 21.99;
        assertNotEquals(expected, calc.multiplication(a, b), delta);
    }

    @Test
    public void div_pos() {
        double a = 545.48, b = 12.4;
        double expected = 43.990322581;
        assertEquals(expected, calc.division(a, b), delta);
    }

    @Test 
    public void div_neg() {
        double a = 45.16, b = 46.45;
        double expected = 1.26;
        assertNotEquals(expected, calc.division(a, b), delta);
    }
}
