// finding the largest number

package piyush;
import java.util.Scanner;
public class largest_1{
    public static void main (String[]args){
        Scanner input = new Scanner (System.in);
        int Digi1 = input.nextInt();
        int Digi2 = input.nextInt();
        int Digi3 = input.nextInt();

        if(Digi1>Digi2 && Digi1>Digi3){
            System.out.println("this is the largest number :" +  Digi1);
        }
        else  if (Digi2>Digi1 && Digi3<Digi2) {
            System.out.println("this is the largest number :"  + Digi2);
        }
        else{
            System.out.println("this is the largest number :" + Digi3);
        }
    }
}
