public class Integers_to_Roman_Numbers {
    
    public static void main(String[] args) {

        
        int number = 789;

        System.out.println(intToRoman(number));

    }

    public static String intToRoman(int number) {

        String roman = "";

        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        while (number > 0) {

            for (int i = 0; i < values.length; i++) {
                if (number >= values[i]) {
                    roman += symbols[i];
                    number -= values[i];
                    break;
                }
            }

        }

        return roman;

    }

}
