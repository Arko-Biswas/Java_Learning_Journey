import java.util.Scanner;

public class Count_duplicate_words_in_sentence {
    public static void main(String[] args) throws Exception {


        Scanner input = new Scanner(System.in);
        String inputString = input.nextLine();

        
        inputString = inputString.toLowerCase();
        String[] wordCount = inputString.split(" ");
        for(int i=0; i<wordCount.length; i++){

            int count = 1;

            for(int j=i+1; j<wordCount.length; j++){

                if(wordCount[i].equals(wordCount[j])){
                    count++;
                }
            }

            if(count > 1 && !wordCount[i].equals("")){

                System.out.println();
                System.out.println(wordCount[i]+" = "+count);
                String empty = wordCount[i];
                for(int k=0;k<wordCount.length;k++){
                    if(wordCount[k].equals(empty)){
                        wordCount[k] = "";
                    }
                }
                
            }

        }
    }
}
