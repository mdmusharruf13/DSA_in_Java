import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter size of array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("enter array elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("array before sorting : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        
        BubbleSort obj = new BubbleSort();
        obj.bubbleSort(arr);
        
        System.out.println("array after sorting : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("array after sorting [sortedArr]: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        sc.close();
    }

    public int[] bubbleSort(int nums[]) {
        for(int i = 0; i < nums.length-1; i++) {
            for(int j = 0; j < nums.length-i-1; j++){
                if(nums[j] > nums[j+1]) {
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        return nums;
    }
}