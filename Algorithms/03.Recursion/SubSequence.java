class SubSequence {
    static void printSubSequence(String str, int index, String newStr) {
        
        if(index == str.length()) {
            System.out.println(newStr);
            return;
        }

        char currentChar = str.charAt(index);

        printSubSequence(str, index+1, newStr+currentChar);

        printSubSequence(str, index+1, newStr);
    }

    public static void main(String[] args) {
        String str = "abc";
        printSubSequence(str, 0, "");
    }
}