import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=1; i<=size; i++){
            arr[i-1] = i*size;
        }

        System.out.println("Before rotation the array : ");
        for(int m : arr){
            System.out.println(m);
        }

        // rotating array
        int tmp = arr[0];
        for(int i=1; i<size; i++){
            arr[i-1] = arr[i];
        }
        arr[size-1] = tmp;

        System.out.println("Before rotation the array : ");
        for(int i : arr){
            System.out.println(i+" ");
        }
    }
}
