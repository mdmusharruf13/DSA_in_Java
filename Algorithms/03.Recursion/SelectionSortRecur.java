import java.util.Arrays;

class SelectionSortRecur {
    static void selectionSort(int[] arr, int r, int c, int maxIdx) {
        if (r == arr.length) {
            return;
        }
        if (c < arr.length) {
            if (arr[maxIdx] > arr[c]) {
                maxIdx = c;
            }
            selectionSort(arr, r, c + 1, maxIdx);
        } else {
            int temp = arr[r];
            arr[r] = arr[maxIdx];
            arr[maxIdx] = temp;

            selectionSort(arr, r + 1, r + 1, r + 1);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 5, 3, 4, 1, 2 };
        selectionSort(arr, 0, 0, 0);
        System.out.println(Arrays.toString(arr));
    }
}
