// Ques is find the smallest letter greater than the target AND
// array that is sorted and non-decreasing AND element should be greater than not equal
// the case where there is element greater than target element than return the first index
// example if target == 'z' and letters ==[a,b], the answer is 'a'



package piyush;

public class SIMILAR_TO_CEILING {
    public static void main(String[] args) {
       int[] arr={'a','b','c','g', 'l','z'};
       int  target = 'a';
      int ans =  search(arr,target);
        System.out.println(ans);
    }

    static int search(int[] arr,int target){
        int start =0;
        int end = arr.length - 1;
        int mid= start +(end-start)/2;

        while(start<=end){
                    if(target>mid){
                start = mid+1;
            }
            else if(target<mid){
                end=mid-1;
            }
        }

        return mid;
    }
}
