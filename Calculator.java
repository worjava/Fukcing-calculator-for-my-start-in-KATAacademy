package CALCULATOR;

import java.util.Scanner;

import static CALCULATOR.Test25.calculator;
import static CALCULATOR.Test25.inpu;

public class Test25 {
    static Scanner sc = new Scanner(System.in);

    static String inpu = sc.nextLine();

    public static String calculator(String inpu) throws Exception {

        String R[] = new String[]{"0", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI",
                "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX", "XXI", "XXII", "XXIII", "XXIV",
                "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI",
                "XXXVII", "XXXVIII", "XXXIX", "XL", "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII",
                "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX", "LXI", "LXII",
                "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX", "LXXI", "LXXII", "LXXIII", "LXXIV",
                "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX", "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV",
                "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC", "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII",
                "XCVIII", "XCIX", "C"};

        String[] s2 = inpu.replaceAll(" ", "").split("[/*+-]");

        if (s2.length > 2) throw new Exception("формат математической операции не удовлетворяет заданию");
        else if (s2.length <= 1) {
            throw new Exception("строка не является математичесой операции");
        }

        int x = 0;
        int y = 0;

        boolean roman1 = false;
        boolean roman2 = false;

        for (int i = 0; i < R.length; i++) {
            if (s2[0].equals(R[i])) {
                roman1 = true;
                x = i;
            }


            if (s2[1].equals(R[i])) {
                roman2 = true;
                y = i;
            }
        }

        if (roman1 == true && roman2 == true) {
            int result = 0;
            if (inpu.contains("+")) {
                result = x + y;
            } else if (inpu.contains("-")) {
                result = x - y;
            } else if (inpu.contains("*")) {
                result = x * y;
            } else if (inpu.contains("/"))
                result = x / y;
            else {


            }
            if (result < 0) throw new Exception("в римской системе нет отрицательных чисел");
            else if (x > 10 ||  y > 10) {
                throw new Exception("Число больше 10");
            }
            String romanResult = R[result];

            return romanResult;


        } else if (roman1 == false && roman2 == false) {
            int result = 0;
            boolean good = true;

            try {
                x = Integer.parseInt(s2[0]);
                y = Integer.parseInt(s2[1]);
            } catch (Exception d) {
                System.out.println("Введи правильный формат счислений согласно заданнию");
           throw new Exception("введи еще раз");
            }


            if (inpu.contains("+")) {
                result = x + y;
            } else if (inpu.contains("-")) {
                result = x - y;
            } else if (inpu.contains("*")) {
                result = x * y;

            } else {
                result = x / y;
            }


            if (x > 10 ||  y > 10) {
                throw new Exception("Chislo bolshe desyati");
            }

            return String.valueOf(result);


        } else {
            throw new Exception("используются одновременно разные системы счисления ");
        }


    }

}

class Test10 {
    public static void main(String[] args) throws Exception {
        System.out.println(calculator(inpu));

    }
}
