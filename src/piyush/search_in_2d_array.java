package piyush;
public class search_in_2d_array {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {6,7,8,9},
                {45,56,67,79},
                       };
        int target= 8;
         array2d(arr,target);
    }

       static void array2d(int[][] arr, int target){
        if(arr.length==0){
            System.out.println("empty");
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0 ; j<arr[i].length ; j++){
                if(arr[i][j]==target){
                    System.out.println(i +" " +j);

                }
            }
        }
    }
}
