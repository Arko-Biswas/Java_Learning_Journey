public class Isomorphic_String {
    
    public static void main(String[] args){

        String first = "yza";
        String second = "bcd";

        System.out.println(isomorphic(first, second));

    }

    public static boolean isomorphic(String first, String second){

        int firstStringFirstChar;
        int firstStringSecondChar;

        int secondStringFirstChar;
        int secondStringSecondChar;

        boolean result = false;
        boolean flag = false;

        if(first.length()!= second.length()){
            return result;
        }
        else{
            
            for(int i=0; i<first.length()-1; i++){


                firstStringFirstChar = first.charAt(i);
                firstStringSecondChar = first.charAt(i+1);

                secondStringFirstChar = second.charAt(i);
                secondStringSecondChar = second.charAt(i+1);

                if((firstStringFirstChar - firstStringSecondChar) == (secondStringFirstChar - secondStringSecondChar)){

                    flag = true;

                }
                else{
                    flag = false;
                    break;
                }

            }

        }
        if(flag){
            result = true;
        }
        return result;


    }

}
