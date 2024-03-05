package com.epam.brest.calc;

import org.junit.jupiter.api.Assertions;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class CalcImplTest {


    Calc calc = new CalcImpl();

    @org.junit.jupiter.api.Test
    void testHandle() {
        BigDecimal weight = new BigDecimal("10");
        BigDecimal weightPrice = new BigDecimal("10");
        BigDecimal lenght = new BigDecimal("10");
        BigDecimal lenghtPrice = new BigDecimal("10");

        assertNotNull(calc);
        assertEquals(new BigDecimal(200), calc.handle(weight, weightPrice, lenght, lenghtPrice));
    }

    @org.junit.jupiter.api.Test
    void testHandlewithNull() {


        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            calc.handle(null, null, null, null);
        });

    }
}