import java.util.Scanner;

public class SimpleArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=1; i<=size; i++){
            arr[i-1] = i*size;
        }
        for(int i : arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}