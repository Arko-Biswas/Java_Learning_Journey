// Write an efficient program to test if two given String is a rotation of each other or not, 
// e.g. if the given String is "XYZ" and "ZXY" then your function should return true, 
// but if the input is "XYZ" and "YXZ" then return false.


public class String_Palindrome {
    public static void main(String[] args) {
        String s = "Madam";
        output(s);   
    }

    public static void output(String s) {
        s = s.toLowerCase();
        if(s.equals(reverse(s))){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }

    public static String reverse(String s) {

        s = s.toLowerCase();

        String[] reverseString = s.split("");
        String returnReverse = "";

        for(int i = reverseString.length - 1; i >= 0; i--) {

            returnReverse += reverseString[i];

        }
        return returnReverse;
    }
}
