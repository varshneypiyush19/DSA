package piyush;

public class Linear_Search {
    public static void main(String[] args) {
        int[] arr = {23,45,67,89};
        int target = 89;
        linearsearch(arr, target);
    }
static void linearsearch(int[] arr ,int target){
    if(arr.length==0){
        System.out.println("Array is empty");
    }
    for (int i=0;i<arr.length; i++) {
        if (target == arr[i]) {
            System.out.println(i);
        }
                                     }
                                               }
    }