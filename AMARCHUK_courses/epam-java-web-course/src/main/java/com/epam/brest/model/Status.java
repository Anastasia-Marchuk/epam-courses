package com.epam.brest.model;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public interface Status {

    List<BigDecimal> userData = new ArrayList<BigDecimal>();
    List<String> messages = new ArrayList<>(Arrays.asList("Please enter weight:","Please enter distance:"));

    Status handle();

    StatusType getType();

}
