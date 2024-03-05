package com.epam.brest.calc;

import java.math.BigDecimal;

public class CalcImpl implements Calc {


    @Override
    public BigDecimal handle(BigDecimal weight, BigDecimal pricePerKg, BigDecimal lenght, BigDecimal pricePerKm) {
        if (weight == null || pricePerKg == null || lenght == null || pricePerKm == null){
            throw new IllegalArgumentException("Parameter should not be NULL");
        }
        return weight.multiply(pricePerKg).add(lenght.multiply(pricePerKm));
    }
}
