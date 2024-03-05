package com.epam.brest.files;

import java.math.BigDecimal;
import java.util.Map;

public interface FileReader {
    Map<Integer, BigDecimal> readData (String filePath) throws Exception;
}
