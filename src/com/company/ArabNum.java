package com.company;

import static com.company.Main.*;


public class ArabNum {
    public static void main(String[] args) {
        firstNum = Integer.parseInt(list[0]);
        try {
            secondNum = Integer.parseInt(list[2]);
        } catch (NumberFormatException e) {
            System.out.println("используются одновременно разные системы счисления.");
            System.exit(1);
        }

        if ((firstNum < 1 || firstNum > 10) || (secondNum < 1 || secondNum > 10)) {
            System.out.println("введенные числа должны быть больше 1 или меньше 10.");
            System.exit(1);
        }
        operator(firstNum, secondNum);
        System.out.print(result);
        System.exit(1);
    }
}

