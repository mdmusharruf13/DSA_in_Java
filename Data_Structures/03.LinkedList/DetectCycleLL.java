// detect is there any cycle in linked list
public class DetectCycleLL {
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

    boolean checkForCycle() {
        if (head == null) {
            return false;
        }
        Node slowNode = head;
        Node fastNode = head;

        while (slowNode != null && fastNode.next != null) {
            slowNode = slowNode.next;
            fastNode = fastNode.next.next;

            if (slowNode == fastNode) {
                return true;
            }
        }

        return false;
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
        DetectCycleLL list = new DetectCycleLL();

        list.insertNode("a");
        list.insertNode("b");
        list.insertNode("c");
        list.insertNode("d");
        list.insertNode("f");

        list.printNodes();

        System.out.println(list.checkForCycle());
    }
}
