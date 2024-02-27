public class CLL {
    private Node head;
    private Node tail;

    private class Node {
        private int data;
        private Node next;

        private Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void insertFirst(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            tail = node;
            return;
        }
        node.next = head;
        head = node;
        tail.next = head;
    }

    public void insertLast(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void deleteFirst() {
        if (head == null) {
            return;
        }
        if (head.next == null) {
            head = null;
            tail = null;
            return;
        }
        head = head.next;
        tail.next = head;

    }

    public void deleteLast() {
        if (head == null) {
            return;
        }
        if (head.next == null) {
            head = null;
            tail = null;
        }

        Node node = head;
        while (node.next != tail) {
            node = node.next;
        }
        node.next = head;
        tail = node;
    }

    public void display() {
        Node node = head;
        if (head != null) {
            do {
                System.out.print(node.data + " -> ");
                if (node.next != null) {
                    node = node.next;
                }
            } while (node != head);
        }
        System.out.println("End");
    }

    public static void main(String[] args) {
        CLL list = new CLL();

        list.insertLast(29);
        list.insertLast(30);
        list.insertLast(31);
        list.insertLast(32);
        list.insertLast(33);
        list.display();

        list.deleteFirst();
        list.display();

        list.deleteLast();
        list.display();

        list.insertFirst(10);
        list.insertFirst(15);
        list.insertFirst(25);
        list.display();
    }
}
