package com.company;

import static com.company.Main.*;

public class RomNum {
    public static String[] arrayRom = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
            "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
            "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
            "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
            "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
            "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
            "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};
    public static String[] arrayArab = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};

    public static String firstRomNum;
    public static String secondRomNum;

    public static void main(String[] args) {

        firstRomNum = list[0];
        for (int s = 0; s < arrayArab.length; s++) {
            if (arrayArab[s].equals(list[2])) {
                System.out.println("используются одновременно разные системы счисления.");
                System.exit(1);
            }
        }
        secondRomNum = list[2];

        for (int s = 0; s < arrayRom.length; s++) {
            if (arrayRom[s].equals(firstRomNum)) {
                firstNum = s + 1;
            }
            for (int c = 0; c < arrayRom.length; c++) {
                if (arrayRom[c].equals(secondRomNum)) {
                    secondNum = c + 1;
                }
            }
        }

        if ((firstNum < 1 || firstNum > 10) || (secondNum < 1 || secondNum > 10)) {
            System.out.println("введенные числа должны быть больше 1 или меньше 10.");
            System.exit(1);
        }

        operator(firstNum, secondNum);
        if (result <= 0) {
            System.out.println("в римской системе нет отрицательных чисел и чисел меньше единицы.");
            System.exit(1);
        }
        System.out.println(arrayRom[result - 1]);
        System.exit(1);
    }
}
