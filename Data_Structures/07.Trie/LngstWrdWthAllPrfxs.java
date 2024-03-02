public class LngstWrdWthAllPrfxs {
    static class Node {
        Node[] children = new Node[26];
        boolean eow;

        Node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }

    }

    static Node root = new Node();

    static void insert(String str) {
        Node node = root;

        for (int i = 0; i < str.length(); i++) {
            int idx = str.charAt(i) - 'a';

            if (node.children[idx] == null) {
                node.children[idx] = new Node();
            }

            node = node.children[idx];
        }
        node.eow = true;
    }

    static String ans = "";

    static void longestWordWithAllPrefixes(Node node, StringBuilder temp) {
        if (node == null) {
            return;
        }

        for (int i = 0; i < 26; i++) {
            if (node.children[i] != null && node.children[i].eow == true) {
                temp.append((char) (i + 'a'));

                if (temp.length() > ans.length()) {
                    ans = temp.toString();
                }
                longestWordWithAllPrefixes(node.children[i], temp);

                temp.deleteCharAt(temp.length() - 1);
            }
        }
    }

    static int longestWordLength(String str) {
        Node node = root;

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            int idx = str.charAt(i) - 'a';

            if (node.children[idx] != null) {
                if (node.children[idx].eow == true) {
                    count++;
                }
                node = node.children[idx];
            } else {
                return count;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String[] words = { "a", "banana", "app", "appl", "ap", "apply", "apple" };

        for (String word : words) {
            insert(word);
            // System.out.println(word);
        }

        longestWordWithAllPrefixes(root, new StringBuilder(""));
        System.out.println(ans);
    }
}
