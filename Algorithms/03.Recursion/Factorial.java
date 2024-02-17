class Factorial {
    static int getFactorial(int num) {
        if(num == 1) {
            return 1;
        }
        return num * getFactorial(num-1);
    }

    public static void main(String[] args) {
        // int num = 5;
        // int num = 6;
        int num = 4;
        int factorial = getFactorial(num);
        System.out.println("factorial of "+ num+" is "+ factorial);
    }
}