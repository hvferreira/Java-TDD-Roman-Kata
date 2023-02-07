package org.example;

public class RomanNumConvert {

    private final String FAIL = "-1"; // out limites
    private final int LOWER = 1; //lower numb to convert
    private final int UPPER = 3999; // higher numb to convert

    public String numConverterRoman(int num) {

        if (num < LOWER || num > UPPER)
            return FAIL;
        return romanGenerator(num);
    }


    private String romanGenerator(int num) {

        String[] oneNine = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        //                       1     2     3      4    5    6      7       8      9
        String[] tenNinety = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        //                        10    20    30     40    50   60     70     80     90
        String[] hundredNineHundred = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        //                                100    200   300   400   500   600   700    800     900
        String[] thousandThreeThousand = {"", "M", "MM", "MMM"};
        //                                   1000  2000   3000

        return thousandThreeThousand[num / 1000] + hundredNineHundred[(num % 1000) / 100] + tenNinety[(num % 100) / 10] + oneNine[num % 10];//1999
        //                          ->      1    <-                       ->      9    <-                ->      9    <-        ->      9    <-
    }

}
