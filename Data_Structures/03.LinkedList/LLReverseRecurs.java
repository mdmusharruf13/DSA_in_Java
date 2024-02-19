public class LLReverseRecurs {
    static Node head;
    int size;

    LLReverseRecurs() {
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

    void recurseivReverse(Node prev, Node nextNode) {
        if (nextNode == null) {
            head = null;
            head = prev;
            return;
        }
        // System.out.println(prev.data + " - " + nextNode.data);
        recurseivReverse(nextNode, nextNode.next);
        nextNode.next = prev;
    }

    void reverseNodes() {
        if (head.next == null) {
            return;
        }

        Node first = head;
        recurseivReverse(head, head.next);
        first.next = null;
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
        LLReverseRecurs list = new LLReverseRecurs();
        list.insert("a");
        list.insert("b");

        list.printNodes();
        list.reverseNodes();
        list.printNodes();

        list.insert("c");
        list.insert("d");
        list.insert("e");
        list.printNodes();
    }
}
