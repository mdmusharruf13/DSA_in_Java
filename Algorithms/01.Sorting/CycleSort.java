import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        int[] arr = {5,1,3,4,2,9,6,8,7};

        System.out.println("before sorting : "+Arrays.toString(arr));

        new CycleSort().cycleSort(arr);

        System.out.println("after sorting : "+Arrays.toString(arr));
    }

    void cycleSort(int[] nums) {
        int i = 0;
        while(i < nums.length) {
            int correct = nums[i]-1;
            if(nums[i] != nums[correct]) {
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }
            else {
                i++;
            }
        }
    }
}
