public class CountZeroes {
    static int countZero(int n) {
        if (n < 10) {
            return (n == 0) ? 1 : 0;
        }
        return ((n % 10) == 0 ? 1 : 0) + countZero(n / 10);
    }

    public static void main(String[] args) {
        System.out.println(countZero(10020));
    }
}
