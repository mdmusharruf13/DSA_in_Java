class RemoveDuplicate {
    static boolean[] arr = new boolean[26];
    static void removeDuplicate(String str, int index, String newStr) {
        if(index == str.length()) {
            System.out.println(newStr);
            return;
        }
        char currentChar = str.charAt(index);
        if(arr[currentChar - 'a']) {
            removeDuplicate(str, index+1, newStr);
        }
        else {
            arr[currentChar - 'a'] = true;
            newStr += currentChar;
            removeDuplicate(str, index+1, newStr);
        }
    }

    public static void main(String[] args) {
        // String str = "aabcceadb";
        String str = "aabbccddeee";
        removeDuplicate(str, 0, "");
    }
}