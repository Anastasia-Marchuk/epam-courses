package com.epam.brest.calc;

import java.math.BigDecimal;

public interface Calc {

    BigDecimal handle(BigDecimal weight, BigDecimal pricePerKg, BigDecimal lenght, BigDecimal pricePerKm);
}
