public class Reverse_words_in_sentences {
    
    public static void main(String[] args){

        String sentence = "A Quick brown Fox jumps over the lazy dog";

        System.out.println(reverseSentence(sentence));

    }

    public static String reverseSentence(String sentence){

        String reverseSentence = "";
        String[] words = sentence.split(" ");
        for(int i = words.length - 1; i >= 0; i--){
            if(i != 0){
                reverseSentence += words[i] + " ";
            }
            else{
                reverseSentence += words[i];
            }
        }
        return reverseSentence;

    }

}
