import java.util.*;

public class J01_SimpleArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter size of array");
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("enter array elements : ");
        for(int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array elements are : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr);
        }
    }
}