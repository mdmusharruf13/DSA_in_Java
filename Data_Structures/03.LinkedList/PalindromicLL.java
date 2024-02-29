public class PalindromicLL {
    Node head;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    void insertNode(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    void printNodes() {
        if (head == null) {
            System.out.println("list is empty...");
            return;
        }

        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println(" null ");
    }

    public static void main(String args[]) {
        PalindromicLL list = new PalindromicLL();

        list.insertNode("a");
        list.insertNode("b");
        list.insertNode("c");
        list.insertNode("d");

        list.printNodes();
    }
}
