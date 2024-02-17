class FirstLastOccurrence {
    static int firstPos = -1;
    static int lastPos = -1;

    static void findFirstLastOccurrence(String str, char target, int index) {
        if(str.length() == index) {
            System.out.println(firstPos+","+lastPos);
            return;
        }
        char currChar = str.charAt(index);
        if(currChar == target) {
            if(firstPos == -1) {
                firstPos = index;
            }
            else {
                lastPos = index;
            }
        }
        findFirstLastOccurrence(str, target, index+1);
    }

    public static void main(String[] args) {
        String str = "aabccbadbad";
        char target = 'b';
        findFirstLastOccurrence(str, target, 0);
    }
}