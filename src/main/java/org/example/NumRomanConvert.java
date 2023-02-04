package org.example;

public class NumRomanConvert {

    private final int FAIL = -1;

    public int romanConverterNum(String roman) {

        return romanToInt(roman);
    }

    private int romanToInt(String str) {

        if (str == null || charToInt(str.charAt(0)) == FAIL)
            return FAIL;

        int num = charToInt(str.charAt(0));
        int pre = 0;
        int curr = 0;

        for (int i = 1; i < str.length(); i++) {
            if (charToInt(str.charAt(i)) == FAIL)
                return FAIL;
            curr = charToInt(str.charAt(i));
            pre = charToInt(str.charAt(i - 1));
            if (curr <= pre) {
                num = num + curr;
            } else {
                num = num - pre * 2 + curr;
            }
        }

        return num;
    }

    private int charToInt(char roman) {

        return switch (roman) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> -1;
        };
    }


}
