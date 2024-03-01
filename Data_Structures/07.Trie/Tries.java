class Tries {
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

    static boolean search(String str) {
        Node node = root;

        for (int i = 0; i < str.length(); i++) {
            int idx = str.charAt(i) - 'a';

            if (node.children[idx] == null) {
                return false;
            }

            node = node.children[idx];
        }

        return node.eow == true;
    }

    public static void main(String[] args) {
        String[] words = { "the", "a", "there", "their", "any", "thee" };

        for (String word : words) {
            insert(word);
            System.out.println("inserted: " + word);
        }

        System.out.println(search("mush"));
        System.out.println(search("there"));

    }
}