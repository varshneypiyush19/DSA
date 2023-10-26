// find the digits which contain even number of digits

package piyush;

public class even_number_of_digit {
    public static void main(String[] args) {
       int[] nums ={12,345,27,6,7896};
        System.out.println( evendigits(nums));
    }

    static int evendigits(int[] nums){
        int count=0;
        for(int num :nums){
            if(even(num)){
                count++;
            }
         }
        return count;
          }

 static boolean even(int num) {
int numberofdigits = digits(num);
     return numberofdigits % 2 == 0;
 }

 static int digits(int num){

        int count=0;
        while(num>0){
           count++;
           num=num/10;
        }
        return count;
 }


}

