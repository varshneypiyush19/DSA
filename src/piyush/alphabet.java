
// identifying whether it is in capital letter or small




package piyush;

import java.util.Scanner;

public class alphabet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch  = in.next().trim().charAt(0);

        if( ch>='a' && ch<='z') {
            System.out.println("Lowercase");
        }
        else if (ch>='A' && ch<='Z') {
            System.out.println("Uppercase");
        }
        else {
            System.out.println("wrong input");
        }
    }
}
