// finding the maximum value from the given arr list


package piyush;
import java.util.Arrays ;
public class max_item {
    public static void main(String[] args) {
        int[] arr = {25 , 65 ,8 , 67 };
        System.out.println( max(arr) ) ;
    }

    static int max(int[] arr){
       int max_value = arr[0];
        for (int j : arr) {
            if (j > max_value) {
                max_value = j;
            }
        }
       return max_value;
    }
}
