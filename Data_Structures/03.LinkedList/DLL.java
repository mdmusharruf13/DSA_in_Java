public class DLL {

    private class Node {
        private int data;
        private Node prev;
        private Node next;

        private Node(int data) {
            this.data = data;
        }
    }

    private Node head;

    public void insert(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            node.next = null;
            node.prev = null;
            return;
        }

        Node tempNode = head;
        while (tempNode.next != null) {
            tempNode = tempNode.next;
        }

        Node lastNode = tempNode;
        tempNode.next = node;
        node.prev = lastNode;
        node.next = null;

    }

    public void display() {
        Node node = head;
        Node last = null;
        while (node != null) {
            System.out.print(node.data + " -> ");
            last = node;
            node = node.next;
        }
        System.out.println("END");

        // System.out.println("node in reverse : ");
        // while (last != null) {
        // System.out.print(last.data + " -> ");
        // last = last.prev;
        // }
        // System.out.println("START");
    }

    public void deleteFirst() {
        if (head == null) {
            return;
        }
        Node last = head;
        head = head.next;
        head.prev = null;
        last = null;
    }

    public void deleteLast() {
        if (head == null) {
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node node = head;
        Node last = null;
        while (node.next != null) {
            last = node;
            node = node.next;
        }
        last.next = null;
    }

    public static void main(String[] args) {
        DLL list = new DLL();

        list.insert(1);
        list.insert(2);
        list.insert(4);
        list.insert(6);
        list.insert(9);
        list.insert(8);
        list.display();

        list.deleteLast();
        list.display();

        list.deleteFirst();
        list.display();
    }

}
