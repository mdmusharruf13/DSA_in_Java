public class ReverseNum {

    static int len(int n) {
        if (n < 10) {
            return 10;
        }
        return len(n / 10) * 10;
    }

    static int reverse(int n) {
        if (n < 10) {
            return n;
        }
        return (n % 10) * len(n / 10) + reverse(n / 10);
    }

    public static void main(String[] args) {
        System.out.println(reverse(1258));
    }
}
