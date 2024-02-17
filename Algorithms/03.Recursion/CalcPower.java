class CalcPower {
    static int calcPower(int num, int power) {
        if(power == 0) {
            return 1;
        }
        if(num == 0) {
            return 0;
        }
        if(power % 2 == 0) {
            return calcPower(num, power/2) * calcPower(num, power/2);
        }
        else {
            return calcPower(num, power/2) * calcPower(num, power/2) * num;
        }
    }

    public static void main(String[] args) {
        int num = 2;
        int power = 5;
        int result = calcPower(num, power);
        System.out.println(num + " power " + power +" is "+ result);
    }
}