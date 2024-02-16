public class Ceiling {
    public static void main(String[] args) {
        int arr[] = {2,3,5,9,14,16,18};
        // int target = 14;
        // int target = 15;
        // int target = 9;
        int target = 4;

        int ceiling = getCeiling(arr, target);
        System.out.println("ceiling number is : "+ ceiling);
    }
    static int getCeiling(int[] nums, int target) {
        int start = 0; 
        int end = nums.length-1;

        while(end >= start) {
            int mid = start + (end-start) / 2;
            if(target > nums[mid]) {
                start = mid + 1;
            }
            else if (target < nums[mid]) {
                end = mid - 1;
            }
            else {
                return nums[mid];
            }
        }
        return nums[start];
    }
}
