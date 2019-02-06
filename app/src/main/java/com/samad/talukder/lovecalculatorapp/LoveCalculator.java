package com.samad.talukder.lovecalculatorapp;

public class LoveCalculator {
    public static int loveCalculationASCIIMethod(String yourName, String yourLoverName) {
        String upper = String.valueOf(yourName).concat(String.valueOf(yourLoverName)).toUpperCase();
        int loveCount = 0;
        for (int i = 0; i < upper.length(); i++) {
            char chr = upper.charAt(i);
            int ascii = (int) chr;
            loveCount += ascii;
        }
        return loveCount;
    }

    public static int loveCalculation(String yourName, String yourLoverName) {
        int i;
        String upper = String.valueOf(yourName).concat(String.valueOf(yourLoverName)).toUpperCase();
        /*int your_name_length = yourName.length();
        int your_love_name_length = yourLoverName.length();*/
        int loveCount = 0;
        for (i = 0; i < upper.length(); i++) {
            String letter1 = upper.substring(i, i + 1);
            if (letter1.equals("L")) {
                loveCount += 2;
            }
            if (letter1.equals("O")) {
                loveCount += 2;
            }
            if (letter1.equals("V")) {
                loveCount += 2;
            }
            if (letter1.equals("E")) {
                loveCount += 2;
            }
            if (letter1.equals("Y")) {
                loveCount += 3;
            }
            if (letter1.equals("O")) {
                loveCount++;
            }
            if (letter1.equals("U")) {
                loveCount += 3;
            }
        }
        for (i = 0; i < upper.length(); i++) {
            String letter1 = upper.substring(i, i + 1);
            if (letter1.equals("L")) {
                loveCount += 2;
            }
            if (letter1.equals("O")) {
                loveCount += 2;
            }
            if (letter1.equals("V")) {
                loveCount += 2;
            }
            if (letter1.equals("E")) {
                loveCount += 2;
            }
            if (letter1.equals("Y")) {
                loveCount += 3;
            }
            if (letter1.equals("O")) {
                loveCount++;
            }
            if (letter1.equals("U")) {
                loveCount += 3;
            }
        }
        int result = 0;
        if (loveCount > 0) {
            result = 5 - (upper.length() / 2);
        }
        if (loveCount > 2) {
            result = 10 - (upper.length() / 2);
        }
        if (loveCount > 4) {
            result = 20 - (upper.length() / 2);
        }
        if (loveCount > 6) {
            result = 30 - (upper.length() / 2);
        }
        if (loveCount > 8) {
            result = 40 - (upper.length() / 2);
        }
        if (loveCount > 10) {
            result = 50 - (upper.length() / 2);
        }
        if (loveCount > 12) {
            result = 60 - (upper.length() / 2);
        }
        if (loveCount > 14) {
            result = 70 - (upper.length() / 2);
        }
        if (loveCount > 16) {
            result = 80 - (upper.length() / 2);
        }
        if (loveCount > 18) {
            result = 90 - (upper.length() / 2);
        }
        if (loveCount > 20) {
            result = 100 - (upper.length() / 2);
        }
        if (loveCount > 22) {
            result = 110 - (upper.length() / 2);
        }
        if (result < 0) {
            result = 0;
        }
        if (result > 99) {
            return 99;
        }
        return result;
    }
}
