public class LLDelete {
    static Node head;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    void addFront(String data) {
        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    void addLast(String data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }

        Node tempNode = head;
        while(tempNode.next != null) {
            tempNode = tempNode.next;
        }
        tempNode.next = newNode;
    }

    void deleteFront() {
        if(head == null) {
            System.out.println("list is empty...");
            return;
        }
        
        head = head.next;
    }
    
    void deleteLast() {
        if(head == null) {
            System.out.println("list is empty...");
            return;
        }

        if(head.next == null) {
            head = null;
            return;
        }
        Node tempNode = head;
        while (tempNode.next.next != null) {
            tempNode = tempNode.next;
        }
        tempNode.next = null;
        
    }

    void printNodes() {
        if(head == null) {
            System.out.println("list is empty...");
            return;
        }

        Node tempNode = head;
        while(tempNode != null) {
            System.out.print(tempNode.data+" -> ");
            tempNode = tempNode.next;
        }
        System.out.println(" null ");
    }

    public static void main(String[] args) {
        LLDelete list = new LLDelete();

        list.addFront("b");
        list.addLast("c");
        list.addFront("a");
        list.addLast("d");
        list.printNodes();

        list.deleteFront();
        list.printNodes();

        list.deleteLast();
        list.printNodes();
        
    }
}
