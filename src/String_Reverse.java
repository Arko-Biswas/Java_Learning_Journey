// Write a program to reverse a String in C/Java/Python or choice of your programming language. 
// You can write either the recursive or iterative solution. 
// For example, if a given input is "abcd," then your function should return "dcba".


public class String_Reverse {

    public static void main(String[] args) {
            String s = "india is great";
            System.out.println(reverse(s));
        }

    public static String reverse(String s) {
        
        String[] reverseString = s.split("");
        String returnReverse = "";

        for(int i = reverseString.length - 1; i >= 0; i--) {

            returnReverse += reverseString[i];

        }
        return returnReverse;
    }
    
}
