import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter size of array");
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("enter array elements : ");
        for(int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Before sorting :");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        selectionSort(arr);

        System.out.println("After sorting : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        sc.close();
    }

    public static int[] selectionSort(int nums[]) {

        for(int i = 0; i < nums.length-1; i++) {
            int min = i;
            for(int j = i+1; j < nums.length; j++) {
                if(nums[j] < nums[min]) {
                    min = j;
                }
            }
            if(min != i) {
                int temp = nums[i];
                nums[i] = nums[min];
                nums[min] = temp;
            }
        }
        return nums;
    }
}
