package com.Anna.course_project.basic.OOP;

public class NumberInput {
    private StringBuffer integerPart;
    private StringBuffer fractionalPart;
    private int notationNumber;

    public NumberInput(StringBuffer integerPart, StringBuffer fractionalPart, int notationNumber) {
        this.integerPart = integerPart;
        this.fractionalPart = fractionalPart;
        this.notationNumber = notationNumber;
    }

    public NumberInput() {}

    public StringBuffer getIntegerPart() {
        return integerPart;
    }

    public StringBuffer getFractionalPart() {
        return fractionalPart;
    }

    public void OutputNumber() {
        System.out.println("\nВаше число: " + getIntegerPart() + "." + getFractionalPart());
    }

    public double MagicToTen() {
        int interResultIntPart;
        int interResultIntPartC;
        int resultIntPart = 0;
        int resultIntPartC = 0;
        int summParts = 0;
        double summPartsF = 0.0;
        double interResultFracPart;
        double resultFracPart = 0;
        double resultFracPartC = 0;

        integerPart = integerPart.reverse();

        for (int i = 0; i < integerPart.length(); i++) {
            if(integerPart.charAt(i) >= 'A' && integerPart.charAt(i) <= 'Z') {
                interResultIntPartC = ((int)((integerPart.charAt(i) - '7') * (Math.pow(notationNumber, i))));
                resultIntPartC = resultIntPartC + interResultIntPartC;
                //System.out.println("interResultIntPart " + interResultIntPart);
            }
            else {
                interResultIntPart = ((int)((integerPart.charAt(i) - '0') * (Math.pow(notationNumber, i))));
                resultIntPart = resultIntPart + interResultIntPart;
            }
            summParts = resultIntPart + resultIntPartC;
        }

        int power = -1;
        for (int i = 0; i < fractionalPart.length(); i++) {
            if(fractionalPart.charAt(i) >= 'A' && fractionalPart.charAt(i) <= 'Z') {
                interResultFracPart = ((fractionalPart.charAt(i) - '7') * (Math.pow(notationNumber, power)));
                resultFracPartC = resultFracPartC + interResultFracPart;
                power--;
            }
            else {
                interResultFracPart = ((fractionalPart.charAt(i) - '0') * (Math.pow(notationNumber, power)));
                resultFracPart = resultFracPart + interResultFracPart;
                power--;
            }
            summPartsF = resultFracPart + resultFracPartC;

        }
        double result = summParts + summPartsF;
        //String.valueOf(result);
        // String result = String.valueOf(resultIntPart + resultFracPart);
        System.out.println("Результат перевода в 10 СС: " + result);
        return result;
    }

    public void MagicFromTen(double result, int notationNumberTo) {
        StringBuffer resultIPFromTen = new StringBuffer();
        int intPart = (int)result;
        for (int i = 0; (intPart / notationNumberTo) >= 0; i++) {
            resultIPFromTen = resultIPFromTen.append(intPart % notationNumberTo);
            intPart /= notationNumberTo;
            if(intPart == 0) {
                break;
            };
        }
        double fracPart = result - (int)result;
        StringBuffer resultFPFromTen = new StringBuffer();

        for (int i = 0; i < 6; i++) {
            int intP = (int)(fracPart * notationNumberTo);
            double allnum = fracPart * notationNumberTo;
            resultFPFromTen.append(intP);
            fracPart = allnum - ((int)(fracPart * notationNumberTo));
        }
        resultIPFromTen = resultIPFromTen.reverse();
        System.out.println("Результат перевода числа в " + notationNumberTo + " СС: " + resultIPFromTen + "." + resultFPFromTen);
    }

    public double CalculatorSumma(double result1, double result2) {
        double resultsumm = result1 + result2;
        //String.valueOf(resultsumm);
        System.out.println("Сумма в 10 СС: " + resultsumm);
        return resultsumm;
    }

    public double CalculatorSubtraction(double result1, double result2) {
        double resultsub;
        if(result1 < result2) {
            resultsub = result2 - result1;
            System.out.println("Разность в 10 СС: " + (-resultsub));
        }
        else {
            resultsub = result1 - result2;
            System.out.println("Разность в 10 СС: " + resultsub);}
        //String.valueOf(resultsub);

        return resultsub;
    }

    public double CalculatorMultiplication(double result1, double result2) {
        double resultmult = result1 * result2;
        //String.valueOf(resultmult);
        System.out.println("Произведение в 10 СС: " + resultmult);
        return resultmult;
    }

}
