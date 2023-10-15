// swapping of two index number


package piyush;

import java.util.Arrays;

public class swap {
    public static void main(String[] args) {
        int[] arr = {26 , 42 ,85 ,45 ,67 };
        swaping( arr , 2,  0);

        System.out.println(Arrays.toString(arr));
    }

    static void swaping(int[]arr , int x , int y ) {
        int temp =  arr[x] ;
        arr[x] = arr[y];
        arr[y]=temp;
    }
}