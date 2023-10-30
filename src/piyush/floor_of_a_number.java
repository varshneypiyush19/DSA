// floor means finding the target element , but it doesn't exist then
// the answer will be the greatest from the lower side
// in the arr = {2,3,5,9,14,16,18}; ceiling of 15 =======14


package piyush;

public class floor_of_a_number {
    public static void main (String [] args){
       int [] arr = {2,4,6,9,23,34,56,78,99};
       int target = 10;
     int ans= search(arr,target);
        System.out.println(ans);
    }


    static int search(int[] arr ,int target ){
        int start=0;
        int end = arr.length-1;
        while(start<=end){
        int  mid= start +(end-start)/2;
        if(target<arr[mid]){
            end =mid-1;
        }
        else if(target>mid){
            start=mid+1;
        }
        else{
            return mid;
        }
        }
        return arr[end];
    }
}
