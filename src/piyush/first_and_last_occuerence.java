//finding the first and last occurence position of the given element
//if not found print [-1,-1] sorted in asscending order
//time complexicity should be O[logN]



package piyush;

import java.util.Arrays;

public class first_and_last_occuerence{
    public static void main(String[] args){
       int[] arr ={2,5,7,7,7,8,9};
       int target=7;
       int[] sol = search(arr,target);
        System.out.println(Arrays.toString(sol));
    }
 static  int[] search(int[] arr, int target){
        int[] ans = {-1,-1};
        int start = search1(arr, target, true) ;
        int end = search1(arr,target,false);
        ans[0]=start;
        ans[1]=end;
        return ans ;
    }

     static int search1(int[] arr,int target,boolean find_first_index){
        int ans = -1;

        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target<mid){
                end = mid - 1;
            }
            else if (target>mid){
                start = mid + 1;
            }
            else{
                ans = mid;
                if(find_first_index){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }

            }
        }
        return ans;
    }
}
