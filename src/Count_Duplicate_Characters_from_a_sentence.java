public class Count_Duplicate_Characters_from_a_sentence {
    
    public static void main(String[] args) {
        
        String message = "A Quick Brown Fox Jumps Over A Lazy Dog";

        System.out.println(message);

        String message_lowerCase = message.toLowerCase();

        String[] words = message_lowerCase.split("");

        for(int i=0; i<words.length; i++) {
            int count = 1;

            for(int j=i+1; j<words.length; j++) {
                if(words[i].equals(words[j])) {
                    count++;
                }
            }
            if(count > 1 && !words[i].equals(" ")) {

                String c = words[i];

                for(int k = 0; k<words.length; k++) {
                    if(words[k].equals(c)){
                        words[k] = " ";
                    }               
                }
                System.out.println(c.toLowerCase()+"/"+c.toUpperCase() + " = " + count);
                System.out.println();
            }
        }
    }


}
