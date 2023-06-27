package com.example.homework212;

import com.example.homework212.service.CalculatorService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorServiceTest {
    private CalculatorService calculatorService = new CalculatorService();

    @Test
    public void testPlus() {
        int result = calculatorService.plus(8, 2);
        assertEquals(10, result);
    }

    @Test
    public void testMinus() {
        int result = calculatorService.minus(8, 2);
        assertEquals(6,result);
    }

    @Test
    public void testMultiply() {
        int result = calculatorService.multiply(8, 2);
        assertEquals(16,result);
    }

    @Test
    public void testDivide() {
        int result = calculatorService.divide(8, 2);
        assertEquals(4,result);
    }

    @Test
    public void testDivideByZero() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            calculatorService.divide(8, 0);
        });
    }
}
