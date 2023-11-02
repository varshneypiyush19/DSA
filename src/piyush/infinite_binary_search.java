package piyush;

public class infinite_binary_search {
    public static void main(String[] args) {
        int[] arr={};
       int target =15;
       int ans =search(arr,target);
        System.out.println(ans);
    }

    static int search(int[] arr,int target){
        int ans =0;
        for(int i=0;i)
       int start= 0 + int n;
       int end=;
       while(start<=end){
         int mid = start+(end-start)/2;
           if(target<mid){
               end=mid-1;
           }
           else if(target>mid){
               start=mid-1;
           }
       }

        return ans;
    }
}
