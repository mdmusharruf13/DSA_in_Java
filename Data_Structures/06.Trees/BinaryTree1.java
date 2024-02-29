import java.util.Scanner;

public class BinaryTree1 {
    class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    static Node root;

    void insert() {
        System.out.println("Enter the root node: ");
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        root = new Node(value);
        insert(sc, root);
    }

    void insert(Scanner sc, Node node) {
        System.out.println("Do you want to enter left of : " + node.value);
        boolean left = sc.nextBoolean();
        if (left) {
            System.out.println("enter value to insert: ");
            int value = sc.nextInt();
            node.left = new Node(value);
            insert(sc, node.left);
        }
        System.out.println("Do you want to enter right of : " + node.value);
        boolean right = sc.nextBoolean();
        if (right) {
            System.out.println("enter value to insert: ");
            int value = sc.nextInt();
            node.right = new Node(value);
            insert(sc, node.right);
        }
    }

    void displayPreorder() {
        displayPreorder(root);
        System.out.println();
    }

    void displayPreorder(Node node) {
        if (node == null) {
            return;
        }

        System.out.print(node.value + " ");
        displayPreorder(node.left);
        displayPreorder(node.right);
    }

    void displayInorder() {
        displayInorder(root);
        System.out.println();
    }

    void displayInorder(Node node) {
        if (node == null) {
            return;
        }

        displayInorder(node.left);
        System.out.print(node.value + " ");
        displayInorder(node.right);
    }

    void displayPostorder() {
        displayPostorder(root);
        System.out.println();
    }

    void displayPostorder(Node node) {
        if (node == null) {
            return;
        }

        displayPostorder(node.left);
        displayPostorder(node.right);
        System.out.print(node.value + " ");
    }

    public static void main(String[] args) {
        BinaryTree1 tree = new BinaryTree1();

        tree.insert();
        tree.displayPostorder();
        tree.displayInorder();
        tree.displayPreorder();
    }

}
