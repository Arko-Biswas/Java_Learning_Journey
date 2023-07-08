import java.util.*;

public class reoccuring {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = input.nextLine();
        // Convert the string to lowercase
        str = str.toLowerCase();
        // Create a HashMap to store the characters and their frequencies
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : str.toCharArray()) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        // Print the characters that have a frequency greater than 1
        for (char ch : map.keySet()) {
            if (map.get(ch) > 1) {
                System.out.println(ch);
            }
        }
    }
}