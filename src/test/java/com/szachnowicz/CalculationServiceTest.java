package com.szachnowicz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculationServiceTest {
    @Test
    public void calculationUnitTest() {
        // given
        Integer first = 1, second = 2;
        CalculationService calculationService = new CalculationService();
        // when
        Integer restult = calculationService.addNumbers(first, second);
        //then
        assertEquals(3, restult.intValue());
    }
}