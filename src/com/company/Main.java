package com.company;

import java.util.Scanner;

import static com.company.RomNum.arrayRom;

public class Main {
    public static String[] list;

    public static int result;
    public static int firstNum;
    public static int secondNum;
    public static int arrayNum;

    public static void main(String[] args) {
        System.out.println("Арабо - Римский калькулятор.\nВведите математическое выражение в одну строку через пробел: ");
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine().toUpperCase();
        list = line.split(" ");

        for (int s = 0; s < list.length; s++) {
            arrayNum = s;
        }

        if (arrayNum < 2){
            System.out.println("строка не является математической операцией.");
            System.exit(1);
        } else if (arrayNum > 2) {
            System.out.println("использовать только 2 числа");
            System.exit(1);
        }

        for (int s = 0; s < arrayRom.length; s++) {
            if (arrayRom[s].equals(list[0])) {
                RomNum.main(list);
                System.exit(1);
            }
        }
        ArabNum.main(list);

        sc.close();
    }

    public static void operator(int firstNum, int secondNum) {
        if (list[1].equals("+")) {
            result = firstNum + secondNum;
        } else if (list[1].equals("-")) {
            result = firstNum - secondNum;
        } else if (list[1].equals("*")) {
            result = firstNum * secondNum;
        } else if (list[1].equals("/")) {
            result = firstNum / secondNum;
        } else {
            System.out.println("использовать только знаки операций: +, -, /, *.");
            System.exit(1);
        }
    }
}
