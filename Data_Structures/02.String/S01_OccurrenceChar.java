import java.util.Scanner;

public class S01_OccurrenceChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter string : ");
        String str = sc.nextLine();
        System.out.println("enter character : ");
        char c = sc.next().charAt(0);
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == c) {
                count++;
            }
        }

        System.out.println("occurrence of character '"+c+"' in string '"+str+"' is "+count);
        sc.close();
    }
}
