class SumOfNum {
    static int getSum(int num) {
        if(num == 1) {
            return 1;
        }
        return num + getSum(num-1);
    }

    public static void main(String[] args) {
        // int num = 5;
        int num = 3;
        int result = getSum(num);
        System.out.println("sum of "+ num+" is "+ result);
    }
}