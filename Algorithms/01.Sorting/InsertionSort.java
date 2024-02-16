import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5,3,4,1,2};
        System.out.println("before sort : "+Arrays.toString(arr));
        insertionSort(arr);
        System.out.println("after sort : "+Arrays.toString(arr));
    }

    static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j > 0; j--) {
                if(arr[j-1] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                else if(arr[j-1] < arr[j]) {
                    break;
                }
            }
            
        }
    }
}
