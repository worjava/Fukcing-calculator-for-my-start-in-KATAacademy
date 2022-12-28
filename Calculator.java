public class CalcKulaTop {


    public static String calculator(String input) throws Exception {

        String R[] = new String[]{"0", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI",
                "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX", "XXI", "XXII", "XXIII", "XXIV",
                "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI",
                "XXXVII", "XXXVIII", "XXXIX", "XL", "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII",
                "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX", "LXI", "LXII",
                "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX", "LXXI", "LXXII", "LXXIII", "LXXIV",
                "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX", "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV",
                "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC", "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII",
                "XCVIII", "XCIX", "C"};

        String[] s2 = input.split("[/*+-]");

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
        if(roman1 == true && roman2 == true) {
            int result = 0;
            if (input.contains("+")) {
                result = x + y;
            } else if (input.contains("-")) {
                result = x - y;
            } else if (input.contains("*")) {
                result = x * y;
            } else {
                result = x / y;
            }


            //����������� �������� ��������� � �������
            String romanResult = R[result];
            return romanResult;
        }else if(roman1 == false && roman2 == false){
            int result = 0;
            x = Integer.parseInt(s2[0]);
            y = Integer.parseInt(s2[1]);
            if (input.contains("+")) {
                result = x + y;
            } else if (input.contains("-")) {
                result = x - y;
            } else if (input.contains("*")) {
                result = x * y;
            } else {
                result = x / y;
            }





            if (x > 10 || y > 10) {
                throw new Exception("����� ������ ������");
            }

            return String.valueOf(result);


        } else {
            throw new Exception("��� ����� ������ ���� � ����� �������");
        }


    }

}

class Test1 {
    public static void main(String[] args) throws Exception {
        System.out.println(calculator("I*II"));

    }