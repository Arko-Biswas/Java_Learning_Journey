public class panagram {
    

    public static void main(String[] args) {

        String sentence = "A quick brown fox jumps over the lazy dog";
        sentence = sentence.toLowerCase();

        System.out.println(isPanagram(sentence));

        }

        public static boolean isPanagram(String sentence) {

            String[] words = sentence.split("");
            for(int l=0;l<words.length;l++){
                System.out.println(words[l]);
            }
            

            char c;
            int ascii;
            boolean result=false;
            for(int i=0;i<26 ;i++){
                ascii = i+97;
                c = (char)ascii;
                String cc = Character.toString(c);
                for(int j=0;j<words.length;j++){
                    if(words[j].equals(cc) || words[j].equals(" ")){
                        result = true;
                        
                    }
                    else{
                        result=false;
                        break;
                    }
                }

            }
            return result;

        }

}
