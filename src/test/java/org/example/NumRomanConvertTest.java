package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class NumRomanConvertTest {


    NumRomanConvert numRoman = new NumRomanConvert();

    @ParameterizedTest
    @CsvFileSource(resources = "/numPass.csv", numLinesToSkip = 1)
        //for cases work
    void numToRomanPass(String roman, int num) {
        assertEquals(num, numRoman.romanConverterNum(roman));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/numFail.csv", numLinesToSkip = 1)
        //for cases out limites
    void numToRomanFail(String roman, int num) {
        assertEquals(num, numRoman.romanConverterNum(roman));
    }


}