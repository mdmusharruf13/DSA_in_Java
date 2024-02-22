// find nth node from last and delete
class FindAndDeleteLL {
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

        Node tempNode = head;
        while (tempNode.next != null) {
            tempNode = tempNode.next;
        }
        tempNode.next = newNode;
    }

    int getLength(Node node) {
        if (node == null) {
            return 0;
        }
        if (node.next == null) {
            return 1;
        }
        int length = 0;
        while (node != null) {
            node = node.next;
            length++;
        }
        return length;
    }

    void deleteNthNode(int nthNode) {
        if (head == null) {
            System.out.println("list is empty...");
            return;
        }

        int length = getLength(head);
        if (nthNode > length) {
            System.out.println("deletion not possible");
            return;
        }

        if (nthNode == length) {
            System.out.println(head.data + " is deleted");
            head = head.next;
            return;
        }

        int position = length - nthNode;
        Node currNode = head;
        while (currNode.next != null) {
            if (position > 1) {
                currNode = currNode.next;
                position--;
            } else {
                break;
            }
        }
        System.out.println(currNode.next.data + " is deleted");
        currNode.next = currNode.next.next;
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
        System.out.println(" null");
    }

    public static void main(String[] args) {

        FindAndDeleteLL list = new FindAndDeleteLL();

        list.insertNode("a");
        list.insertNode("b");
        list.insertNode("c");
        list.insertNode("d");
        list.insertNode("e");
        list.insertNode("f");

        list.printNodes();
        list.deleteNthNode(4);
        list.printNodes();
        list.deleteNthNode(2);
        list.printNodes();
        list.deleteNthNode(4);
        list.printNodes();
        list.deleteNthNode(4);
        list.printNodes();
    }
}