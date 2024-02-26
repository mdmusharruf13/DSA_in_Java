import java.util.ArrayList;

class Subseq {
    static void subseq(String str, String subStr, ArrayList<String> list) {
        if (str.length() == 0) {
            if (subStr == "") {
                return;
            }
            System.out.println(subStr);
            list.add(subStr);
            return;
        }
        char ch = str.charAt(0);
        subseq(str.substring(1), subStr + ch, list);
        subseq(str.substring(1), subStr, list);
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        subseq("abc", "", list);
        System.out.println(list);
    }
}