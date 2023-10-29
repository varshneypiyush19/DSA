
// ceiling means finding the target element , but it doesn't exist then
// the answer will be the smallest from the greater side
// in the arr = {2,3,5,9,14,16,18}; ceiling of 15 =======16

package piyush;

public class ceiling_of_a_number {
    public static void main(String[] args){
       int[] arr = {2,3,5,9,14,16,18};
       int target = 10;
       int ans =search(arr , target);
       System.out.println(ans);
    }
   static int  search(int[] arr ,int target){
        int start = 0;
        int end = arr.length;
        while(start<=end){
           int  mid = start +(end-start)/2;
           if(target < arr[mid]){
               end = mid - 1 ;
           }
           else if (target > arr[mid]){

               start = mid + 1;
           }
           else{
               return mid ;
           }
        }
        return arr[start];
   }
}