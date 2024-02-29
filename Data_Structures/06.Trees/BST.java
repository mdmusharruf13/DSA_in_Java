import java.util.Stack;

public class BST {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int val) {
            this.data = val;
            this.left = null;
            this.right = null;
        }
    }

    static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }

        if (root.data > val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }

        return root;
    }

    static void inorder(Node root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    static boolean search(Node root, int key) {
        if (root == null) {
            return false;
        }

        if (key == root.data) {
            return true;
        } else if (key < root.data) {
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }
    }

    static Node delete(Node root, int val) {
        if (root.data > val) {
            root.left = delete(root.left, val);
        } else if (root.data < val) {
            root.right = delete(root.right, val);
        } else {
            // case 1 node with no childs
            if (root.left == null && root.right == null) {
                return null;
            }

            // case 2 node with one child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // case 3 node with 2 child
            Node IS = inorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, val);
        }
        return root;
    }

    static Node inorderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    static void printInRange(Node root, int X, int Y) {
        if (root == null) {
            return;
        }
        if (root.data >= X && root.data <= Y) {
            printInRange(root.left, X, Y);
            System.out.print(root.data + " ");
            printInRange(root.right, X, Y);
        } else if (root.data >= Y) {
            printInRange(root.left, X, Y);
        } else {
            printInRange(root.right, X, Y);
        }
    }

    static void rootToLeafPath(Node root, Stack<Integer> stack) {
        if (root == null) {
            return;
        }
        stack.push(root.data);
        if (root.left == null && root.right == null) {
            System.out.println(stack);
        } else {
            rootToLeafPath(root.left, stack);
            rootToLeafPath(root.right, stack);
        }
        stack.pop();

    }

    public static void main(String[] args) {
        // int[] values = { 5, 1, 3, 4, 2, 7 };
        int[] values = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
        Node root = null;

        for (int val : values) {
            root = insert(root, val);
        }

        inorder(root);
        System.out.println();

        boolean found = search(root, 4);
        System.out.println(found);

        delete(root, 4);
        inorder(root);
        System.out.println();

        printInRange(root, 4, 10);
        System.out.println();

        System.out.println("paths from root to leaf nodes: ");
        Stack<Integer> stack = new Stack<>();
        rootToLeafPath(root, stack);
    }
}
