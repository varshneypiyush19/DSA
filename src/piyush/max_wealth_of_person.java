package piyush;

public class max_wealth_of_person {
    public static void main(String[] args){
        int[][] arr = {
                {1,2,3},
                {1,3,4},
                {2,5,8},
        };
        int num =search(arr);
        System.out.println(num);
    }
    static int search(int[][] arr){
        int ans = Integer.MIN_VALUE;
        for(int i=0 ;i<arr.length;i++){
            int sum=0;
            for(int j=0 ;j<arr[i].length;j++){
                sum += arr[i][j];
            }
            if(sum>ans){
                ans=sum;
            }

        }
        return ans;
    }
}
