class LLInsert {
    static Node head = null;
    int size;

    LLInsert() {
        this.size = 0;
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

    void addFirst(String data) {
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

        System.out.println("Null");
    }

    int getSize() {
        return size;
    }

    public static void main(String[] args) {
        LLInsert list = new LLInsert();

        list.addLast("is");
        list.addLast("linked list");
        list.printNodes();

        list.addFirst("this");
        list.printNodes();

        list.addLast("connected");
        list.printNodes();

        System.out.println(list.getSize());
    }
}