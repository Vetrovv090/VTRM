import java.util.Scanner;

public class CalculV2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ввод числа A");
        String inputA = sc.next();
        int a = convertToArabic(inputA);

        System.out.println("Ввод операции (+ - * /)");
        char operation = sc.next().charAt(0);

        System.out.println("Ввод числа B");
        String inputB = sc.next();
        int b = convertToArabic(inputB);

        if (operation == '+') {
            int result = a + b;
            System.out.println(a + " + " + b + " = " + convertToRoman(result));
        } else if (operation == '-') {
            int result = a - b;
            System.out.println(a + " - " + b + " = " + convertToRoman(result));
        } else if (operation == '*') {
            int result = a * b;
            System.out.println(a + " * " + b + " = " + convertToRoman(result));
        } else if (operation == '/') {
            int result = a / b;
            System.out.println(a + " / " + b + " = " + convertToRoman(result));
        } else {
            System.out.println("Чумба, эта прога не поддерживает операцию");
        }
    }

    private static int convertToArabic(String romanNumber) {
        int arabicNumber = 0;
        int previousValue = 0;

        for (int i = romanNumber.length() - 1; i >= 0; i--) {
            char romanChar = romanNumber.charAt(i);
            int charValue = romanCharToValue(romanChar);

            if (charValue < previousValue) {
                arabicNumber -= charValue;
            } else {
                arabicNumber += charValue;
            }

            previousValue = charValue;
        }

        return arabicNumber;
    }

    private static String convertToRoman(int arabicNumber) {
        if (arabicNumber <= 0 || arabicNumber > 3999) {
            return "Недопустимое число";
        }

        String[] romanNumerals = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        int[] values = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};

        StringBuilder result = new StringBuilder();

        for (int i = values.length - 1; i >= 0; i--) {
            while (arabicNumber >= values[i]) {
                arabicNumber -= values[i];
                result.append(romanNumerals[i]);
            }
        }

        return result.toString();
    }

    private static int romanCharToValue(char romanChar) {
        switch (romanChar) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}