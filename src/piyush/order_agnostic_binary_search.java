package piyush;

public class order_agnostic_binary_search {
    public static void main(String[] args) {
//        int[] arr = new int[]{1, 3, 6, 8, 9, 23, 45, 67, 99};
        int[] arr = {99, 67, 23, 8, 6, 4, 3, -5, -6};
        int target = 23;
        int ans = binary_search(arr, target);
        System.out.println(ans);
    }

    static int binary_search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            boolean isasc = arr[start] < arr[end];

            int mid = start + (end - start) / 2;
                if (target == arr[mid]) {
                return mid;
            }
            if (isasc) {
                if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            else {
                if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }

        }
        return -1;
    }
}