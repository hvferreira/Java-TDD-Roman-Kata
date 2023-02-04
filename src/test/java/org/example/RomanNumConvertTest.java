package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumConvertTest {

    RomanNumConvert aux = new RomanNumConvert();

    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv", numLinesToSkip = 1)
    void numToRoman(int num, String roman) {
        assertEquals(roman, aux.numConverterRoman(num));
    }

}