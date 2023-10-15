//finding the occurence of the element in the word

package piyush;
import java.util.Scanner;
public class counting_occurens_of_same_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       int  number;
        number = input.nextInt();
        int count =0;
        while( number>0){
             int rem =number %10 ;
            if (rem==3){
                count++;
            }
            number = number/10 ;
        }
        System.out.println(count);
    }

}
