//integer array named nums sorted in asscending order(with distinct value)
//prior to being passed to your function ,nums is rotated at an unknown index 'k'
//(0<=k<num.length) suck that the resulting array is (nums[k],num[k+1],....,nums[n-1],nums[0],nums[1],...,nums[k-1])
//example [0,1,2,4,5,6,7] rotated at pivot index 3
// becomes [4,5,6,7,0,1,2]



package piyush;

public class serach_in_rotated_array {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(countRotations(arr));
    }

    private static int countRotations(int[] arr) {
        int pivot = findPivot(arr);
        return pivot + 1;
    }

    // use this for non duplicates
    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
    // use this when arr contains duplicates
//    static int findPivotWithDuplicates(int[] arr) {
//        int start = 0;
//        int end = arr.length - 1;
//        while (start <= end) {
//            int mid = start + (end - start) / 2;
//            // 4 cases over here
//            if (mid < end && arr[mid] > arr[mid + 1]) {
//                return mid;
//            }
//            if (mid > start && arr[mid] < arr[mid - 1]) {
//                return mid-1;
//            }
//
//            // if elements at middle, start, end are equal then just skip the duplicates
//            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
//                // skip the duplicates
//                // NOTE: what if these elements at start and end were the pivot??
//                // check if start is pivot
//                if (arr[start] > arr[start + 1]) {
//                    return start;
//                }
//                start++;
//
//                // check whether end is pivot
//                if (arr[end] < arr[end - 1]) {
//                    return end - 1;
//                }
//                end--;
//            }
//            // left side is sorted, so pivot should be in right
//            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
//                start = mid + 1;
//            } else {
//                end = mid - 1;
//            }
//        }
//        return -1;
//    }
}