public class String_Anagram {
    
    public static boolean isAnagram(String s, String t) {

        if (s.length()!= t.length()) {
            return false;
        }
        s=s.toLowerCase();
        t=t.toLowerCase();

        String ss[] = s.split("");
        String tt[] = t.split("");

        boolean isItAnagram = false;
        for(int i=0; i<ss.length; i++) {

            for(int j=0; j<ss.length; j++) {
                if(ss[i].equals(tt[j])) {
                    isItAnagram = true;
                    ss[i] = "*";
                    tt[j] = "*";
                }
                else isItAnagram = false;
            }
        }
        if(isItAnagram){
            return true;
        }
        return false;

    }

    public static void main(String[] args) {
        String first = "Armyr";
        String second = "Maryt";
        System.out.println(isAnagram(first, second));
    }

}
