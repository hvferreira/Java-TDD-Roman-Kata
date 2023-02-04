package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumConvertTest {

    RomanNumConvert romanNum = new RomanNumConvert();

    @ParameterizedTest
    @CsvFileSource(resources = "/romanPass.csv", numLinesToSkip = 1)
    void numToRomanPass(int num, String roman) {
        assertEquals(roman, romanNum.numConverterRoman(num));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/romanFail.csv", numLinesToSkip = 1)
    void numToRomanFail(int num, String roman) {
        assertEquals(roman, romanNum.numConverterRoman(num));
    }
}