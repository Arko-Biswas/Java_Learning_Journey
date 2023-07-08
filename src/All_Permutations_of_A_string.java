// Write an efficient program to print all permutations 
// of a given String in Java/C/Python or any programming language 
// of your choice. For example, if given input is "123" then your 
// program should print all 6 permutations e.g. "123", "132", "213", "231", "312" and "321".



public class All_Permutations_of_A_string {
    
    public static void main(String[] args) {
        permutation("india");
        //System.out.println(count);
    }

    public static void permutation(String input){
        permutation("", input);
    }
    //int count = 0;
    public static void permutation(String perm, String word) {
        if (word.isEmpty()) {
            System.err.println(perm + word);
            

        } else {
            for (int i = 0; i < word.length(); i++) {
                permutation(perm + word.charAt(i), word.substring(0, i) 
                                + word.substring(i + 1, word.length()));
            }
            //count++;
        }

    }



}
