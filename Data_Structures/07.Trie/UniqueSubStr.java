class UniqueSubStr {
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

    static int countNodes(Node root) {
        if (root == null) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < 26; i++) {
            if (root.children[i] != null) {
                count += countNodes(root.children[i]);
            }
        }

        return count + 1;
    }

    public static void main(String[] args) {
        String str = "ababa";

        for (int i = 0; i < str.length(); i++) {
            insert(str.substring(i));
        }

        System.out.println("unique sub-strings are: " + countNodes(root));

    }
}