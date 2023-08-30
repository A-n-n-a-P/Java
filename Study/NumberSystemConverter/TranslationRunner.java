package com.Anna.course_project.basic.OOP;

import java.util.Scanner;
import java.lang.StringBuffer;

public class TranslationRunner {
    public static void main(String[] args) {
          Menu();
    }

    public static void ForTranslateNumber() {
        Scanner in = new Scanner(System.in);
        System.out.println("\n*** Если в вашем числе содержатся буквы, вводите их ТОЛЬКО заглавными ***\n");
        System.out.print("Целая часть числа: ");
        StringBuffer integerPart = new StringBuffer(in.nextLine());
        System.out.print("Дробная часть числа: .");
        StringBuffer fractionalPart = new StringBuffer(in.nextLine());
        System.out.print("Система счисления введенного числа: ");
        int notationNumber = in.nextInt();
        System.out.print("Система счисления для перевода: ");
        int notationNumberTo = in.nextInt();
        NumberCheck(integerPart, fractionalPart, notationNumber);
        NumberInput num = new NumberInput(integerPart, fractionalPart, notationNumber);
        num.OutputNumber();
        double result = num.MagicToTen();
        num.MagicFromTen(result, notationNumberTo);
    }

    public static void ForCalculator (int item) {
        Scanner in = new Scanner(System.in);
        System.out.println("\n--- Введите первое число ---");
        System.out.println("\n*** Если в вашем числе содержатся буквы, вводите их ТОЛЬКО заглавными ***\n");
        System.out.print("Целая часть числа: ");
        StringBuffer integerPart1 = new StringBuffer(in.nextLine());
        System.out.print("Дробная часть числа: .");
        StringBuffer fractionalPart1 = new StringBuffer(in.nextLine());
        System.out.print("Система счисления введенного числа: ");
        int notationNumber1 = in.nextInt();
        NumberCheck(integerPart1, fractionalPart1, notationNumber1);
        NumberInput num1 = new NumberInput(integerPart1, fractionalPart1, notationNumber1);
        num1.OutputNumber();

        System.out.println("\n--- Введите второе число ---");
        System.out.print("Целая часть числа: ");
        Scanner scanner = new Scanner(System.in);
        StringBuffer integerPart2 = new StringBuffer(scanner.nextLine());
        System.out.print("Дробная часть числа: .");
        StringBuffer fractionalPart2 = new StringBuffer(scanner.nextLine());
        System.out.print("Система счисления введенного числа: ");
        int notationNumber2 = scanner.nextInt();
        NumberCheck(integerPart2, fractionalPart2, notationNumber2);
        NumberInput num2 = new NumberInput(integerPart2, fractionalPart2, notationNumber2);
        num2.OutputNumber();

        System.out.print("\nСистема счисления результата: ");
        int notationNumberTo = in.nextInt();

        switch (item) {
            case 1: {
                NumberInput num3 = new NumberInput();
                double num1toten = num1.MagicToTen();
                double num2toten = num2.MagicToTen();
                double summ = num3.CalculatorSumma(num1toten, num2toten);
                num3.MagicFromTen(summ, notationNumberTo);
            } break;
            case 2: {
                NumberInput num4 = new NumberInput();
                double num1toten = num1.MagicToTen();
                double num2toten = num2.MagicToTen();
                double sub = num4.CalculatorSubtraction(num1toten, num2toten);
                num4.MagicFromTen(sub, notationNumberTo);
            } break;
            case 3: {
                NumberInput num5 = new NumberInput();
                double num1toten = num1.MagicToTen();
                double num2toten = num2.MagicToTen();
                double mul = num5.CalculatorMultiplication(num1toten, num2toten);
                num5.MagicFromTen(mul, notationNumberTo);
            } break;
        }

    }

    public static void NumberCheck(StringBuffer integerPart, StringBuffer fractionalPart, int notationNumber) {
        for (int i = 0; i < integerPart.length(); i++) {
            if((integerPart.charAt(i) - '0' >= notationNumber) || (((int)integerPart.charAt(i) - '7') >= notationNumber)) {
                System.out.println("!ОШИБКА\t\tЦелая часть числа содержит цифру/букву, не входящую в СС");
                Menu();
            }
        }
        for (int i = 0; i < fractionalPart.length() - 1; i++) {
            if((fractionalPart.charAt(i) - '0' >= notationNumber) || (((int)fractionalPart.charAt(i) - '7') >= notationNumber)) {
                System.out.println("!ОШИБКА\t\tДробная часть числа содержит цифру/букву, не входящую в СС");
                Menu();
            }
        }
    }

    public static void Menu() {
        Scanner in = new Scanner(System.in);
        System.out.println("\t\t******* Меню *******");
        String[] menu = {"\t\t1. Перевод",
                "\t\t2. Калькулятор"
        };
        for (int i = 0; i < menu.length; i++) {
            System.out.println(menu[i]);
        }
        System.out.print("\nВведите номер пункта: ");
        int number = in.nextInt();

        switch (number) {
            case 1: {ForTranslateNumber();} break;
            case 2: {
                System.out.println("\t\t******* Калькулятор *******");
                String[] calculator = {"\t\t1) Сложение",
                        "\t\t2) Вычитание",
                        "\t\t3) Умножение"};
                for (int i = 0; i < calculator.length; i++) {
                    System.out.println(calculator[i]);
                }
                System.out.print("\nВведите номер пункта: ");
                int item = in.nextInt();

                ForCalculator(item);
            }
        }
    }
}