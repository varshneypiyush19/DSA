//writing the fibonacci series

package piyush;
import java.util.Scanner;
public class fibonaci {
    public static void main (String[]args) {
        Scanner input = new Scanner(System.in);
        int fib = input.nextInt();
        int a = 0;
        int b = 1;
         for(int i = 2;i <= fib ;i++){
             int temp = b;
                  b = a+b;
                  a = temp;
         }
        System.out.println("the value of fibonaci is " + b );
    }
}
