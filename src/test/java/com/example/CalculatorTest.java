package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.add(2, 3), "Addition should be correct.");
        assertEquals(-1, calculator.add(-2, 1), "Addition with negatives should be correct.");
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        assertEquals(1, calculator.subtract(3, 2), "Subtraction should be correct.");
        assertEquals(-3, calculator.subtract(-2, 1), "Subtraction with negatives should be correct.");
    }

    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();
        assertEquals(6, calculator.multiply(2, 3), "Multiplication should be correct.");
        assertEquals(-2, calculator.multiply(-1, 2), "Multiplication with negatives should be correct.");
    }

    @Test
    public void testDivide() {
        Calculator calculator = new Calculator();
        assertEquals(2.0, calculator.divide(6, 3), "Division should be correct.");
        assertEquals(-1.5, calculator.divide(-3, 2), "Division with negatives should be correct.");
    }

    @Test
    public void testDivideByZero() {
        Calculator calculator = new Calculator();
        assertThrows(ArithmeticException.class, () -> calculator.divide(1, 0), "Division by zero should throw ArithmeticException.");
    }
}
