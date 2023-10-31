// Ques is find the smallest letter greater than the target AND
// array that is sorted and non-decreasing AND element should be greater than not equal
// the case where there is element greater than target element than return the first index
// example if target == 'z' and letters ==[a,b], the answer is 'a'



package piyush;

public class SIMILAR_TO_CEILING {
    public static void main(String[] args) {
       int[] arr={'a','b','c','g', 'l','x'};
       int  target = 'z';
      char ans = (char) search(arr,target);
        System.out.println(ans);
    }

    static int search(int[] arr,int target){
        int start =0;
        int end = arr.length - 1;

        while(start<=end){
            int mid= start +(end-start)/2;
                    if(target>arr[mid]){
                start = mid+1;
            }
            else if (target<arr[mid]) {
                end=mid-1;
            }
        }
        return arr[start%arr.length];
    }
}
