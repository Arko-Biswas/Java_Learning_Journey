import java.util.*;

public class K_Anagram {
    
    public static void main(String[] args) {

        String str = "anagrammmm";
        String s2 = "grammmmar";

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        System.out.println(map);

        for (int i = 0; i < s2.length(); i++) {
            char ch = s2.charAt(i);
            if (map.getOrDefault(ch, 0) > 0) {
                map.put(ch, map.get(ch) - 1);
            }
        }

        int count = 0;
        for (char ch : map.keySet()) {
            count += map.get(ch);
            System.out.println(map.get(ch));
        }
        System.out.println(map);




    }

}
