// Write an efficient Java/c/Python function that takes 
// two strings as arguments and removes the characters 
// from the first string, which are present in the second 
// string. For example, if the first String "India is great" 
// and the second String is "in" then the output should be "da s great"


public class Remove_characters_from_Sentence {
    
    public static void main(String[] args) {
        String str1 = "India is great";
        String str2 = "in";
        str1 = str1.toLowerCase();
        
        System.out.println(replaceFunction(str1, str2));
    }

    public static String replaceFunction(String str1, String str2) {

        String[] str = str2.split("");
        for(int i = 0; i < str.length; i++){
            str1 = str1.replace(str[i], "");
        }
        return str1;
    }
}
