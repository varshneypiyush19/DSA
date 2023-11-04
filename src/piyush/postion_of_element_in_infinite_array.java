// arr.length >= 3
//0<i<arr.length-1 such that
//arr[0]<arr[1]......arr[i-1]<arr[i]
//arr[i]>arr[i+1}>....>arr[arr.length-1]
// i.e.  arr[0]<arr[1]......arr[i-1]<arr[i]>arr[i+1}>....>arr[arr.length-1]






package piyush;

public class postion_of_element_in_infinite_array {
    public static void main(String[] args) {
       int[] arr = {1,2,3,4,5,6,7,3,2,1};
       int ans = peak(arr);
        System.out.println(ans);
    }

    static int peak(int[]arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid = start + (end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end=mid;
                }
            else if(arr[mid]<arr[mid+1]){
                start=mid+1;
                }
        }
        return arr[start];
    }
}
