// maing a calculator

package piyush;
import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {

while(true) {

    System.out.println("Enter the operation you want to perform : + , - , * , / " );

    Scanner input = new Scanner(System.in);
    char operation = input.next().trim().charAt(0);
    System.out.println("Enter the numbers you want to add , subtract , multiply , divide");
    if(operation == '+' || operation == '-' || operation == '*' || operation == '/') {
        int a = input.nextInt();
        int b = input.nextInt();

                if (operation == '+') {
                   int  result = a + b;
                    System.out.println(result);
                }
                if (operation == '-') {
                   int result = a - b;
                    System.out.println(result);
                }
                if (operation == '*') {
                     int result = a * b;
                    System.out.println(result);
                }
                if (operation == '/') {

                    if(b!=0){
                   float result = (float) a / b ;
                        System.out.println(result);
                    }
                }
    }
     else if (operation=='X' || operation=='x'){
        break;
    }
    else {
        System.out.println("Wrong action taken  again enter the right action");
    }
    System.out.println("Enter X or x to exit");
}
    }
}
