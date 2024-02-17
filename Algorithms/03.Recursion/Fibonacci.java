class Fibonacci {
    static void generateFibonacci(int n1, int n2, int nth) {
        if(nth == 0) {
            return;
        }
        System.out.println(n2);
        generateFibonacci(n2, n1+n2, nth-1);
    }

    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 1;
        int nth = 8;
        System.out.println(n1);
        generateFibonacci(n1, n2, nth);
    }
}