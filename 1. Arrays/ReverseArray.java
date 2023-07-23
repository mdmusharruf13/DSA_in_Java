import java.util.Scanner;

public class ReverseArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=1; i<=size; i++){
            arr[i-1] = i*size;
        }
        System.out.println("Before reverse the array : ");
        for(int i : arr){
            System.out.println(i+" ");
        }

        for(int i=0, j=size-1; i<size/2; i++, j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        System.out.println("After reverse the array : ");
        for(int i : arr){
            System.out.println(i+" ");
        }
        System.out.println();
    }
}
