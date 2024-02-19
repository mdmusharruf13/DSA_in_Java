public class LLReverse {
    Node head;
    int size;

    LLReverse() {
        size = 0;
    }

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    void insert(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node tempNode = head;
        while (tempNode.next != null) {
            tempNode = tempNode.next;
        }
        tempNode.next = newNode;
    }

    void reverseNodes() {

        Node nextNode = head.next;
        Node prevNode = head;
        Node currNode = head;

        while (nextNode != null) {
            currNode = nextNode;
            nextNode = nextNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
        }
        head.next = null;
        head = prevNode;
    }

    void printNodes() {
        if (head == null) {
            System.out.println("list is empty...");
            return;
        }

        Node tempNode = head;
        while (tempNode != null) {
            System.out.print(tempNode.data + " -> ");
            tempNode = tempNode.next;
        }
        System.out.println(" null ");
    }

    public static void main(String[] args) {
        LLReverse list = new LLReverse();
        list.insert("a");
        list.insert("b");
        list.insert("c");
        list.insert("d");
        list.insert("e");

        list.printNodes();
        list.reverseNodes();
        list.printNodes();
    }
}
