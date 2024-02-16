import java.util.Arrays;

public class MissingNum {
    public static void main(String[] args) {
        // int[] arr = {3,0,1};
        int[] gArr = {4,3,2,7,8,2,3,1};
        findMissingNum(gArr);
        System.out.println(Arrays.toString(gArr));
        for(int i = 0; i < gArr.length; i++) {
            if(gArr[i] != i) {
                System.out.println(i);
            }
        }
    }

    static void findMissingNum(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i];
            if(nums[i] < nums.length && nums[i] != nums[correct]) {
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

