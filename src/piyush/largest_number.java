
// finding the largest number

package piyush;
import java.util.Scanner;
public class largest_number {
    public static void main (String[]args){
        Scanner input = new Scanner (System.in);
        int Digi1 = input.nextInt();
        int Digi2 = input.nextInt();
        int Digi3 = input.nextInt();
        int max = Digi1;
        if(Digi2 >max ){
            max=Digi2;
            }
         if (Digi3 >max ){
            max=Digi3;

        }
        System.out.println( max);
    }
}
