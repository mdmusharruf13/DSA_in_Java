import java.util.*;

public class J03_RemoveEle {
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
            System.out.println(arr[i]);
        }
        
        System.out.println("enter element to delete : ");
        int pos = -1;
        int ele = sc.nextInt(); 
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == ele) {
                pos = i;
                break;
            }
        }
        if(pos == -1) {
            System.out.println("element not found");
            sc.close();
            return;
        }
        
        for(int i = pos; i < arr.length-1; i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = 0;
        
        System.out.println("Array elements are : ");
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) break;
            System.out.println(arr[i]);
        }
        sc.close();
    }
}