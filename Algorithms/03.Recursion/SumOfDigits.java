public class SumOfDigits {
    static int SOD(int n) {
        if (n < 10)
            return n;
        return n % 10 + SOD(n / 10);
    }

    public static void main(String[] args) {
        System.out.println(SOD(1342));
    }
}
