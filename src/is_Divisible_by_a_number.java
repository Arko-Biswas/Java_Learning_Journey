public class is_Divisible_by_a_number {
    
    public static void main(String[] args){

        int number = 64493100;
        int divisor = 3;

        System.out.println(isDivisible(number, divisor));

    }

    public static boolean isDivisible(int number, int divisor){

        boolean result = false;
        int count = 1;

        while(number >= divisor){

            
            if(number == divisor || number == 0){
                result = true;
                break;
            }
            else{

                number = number - divisor;
                count++;

            }
            
        }
        if(result){
            System.out.println(count);
        }
        return result;

    }

}
