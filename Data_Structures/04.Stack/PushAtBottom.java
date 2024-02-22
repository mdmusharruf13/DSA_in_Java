class PushAtBottom {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Stack {
        Node head;

        boolean isEmpty() {
            return head == null;
        }

        void push(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        int pop() {
            if (isEmpty()) {
                return -1;
            }
            int data = head.data;
            head = head.next;
            return data;
        }

        int peek() {
            if (isEmpty()) {
                return -1;
            }
            return head.data;
        }

        void pushAtBtm(int data) {
            if (isEmpty()) {
                push(data);
                return;
            }
            int popped = pop();
            pushAtBtm(data);
            push(popped);
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();

        s.push(200);
        s.push(250);
        s.push(390);
        s.push(720);

        s.pushAtBtm(125);

        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}