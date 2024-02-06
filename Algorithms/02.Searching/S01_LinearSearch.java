import java.util.Scanner;

public class S01_LinearSearch {
    public static void main(String[] args) {

        int arr[] = {1,2,4,9,15,24,55,68,80};
        int target = 68;
        int res = binarySearch(arr, target);
        System.out.println("position is : "+res);
    }
    static int binarySearch(int nums[], int target) {

        int start = 0;
        int end = nums.length-1;

        while(end >= start) {
            int mid = start + (end-start) / 2;

            if (target > nums[mid]) {
                start = mid + 1;
            }
            else if(target < nums[mid]) {
                end = mid - 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
