
// reversing the number

package piyush;
import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int out =0;
        while(number>0){
          int   rem =number%10;
                number/=10;
            out=  out*10 + rem;
        }

        System.out.println(out);
    }
}
