// public class StackAllOp {

//     static class Node {
//         int data;
//         Node next;

//         Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     static class Stack {
//         static Node head;

//         boolean isEmpty() {
//             return head == null;
//         }

//         void push(int data) {
//             Node newNode = new Node(data);
//             if (isEmpty()) {
//                 head = newNode;
//                 return;
//             }
//             newNode.next = head;
//             head = newNode;
//         }

//         int pop() {
//             if (isEmpty()) {
//                 return -1;
//             }
//             int top = head.data;
//             head = head.next;
//             return top;
//         }

//         int peek() {
//             if (isEmpty()) {
//                 return -1;
//             }
//             return head.data;
//         }
//     }

//     public static void main(String[] args) {
//         Stack s = new Stack();

//         s.push(125);
//         s.push(200);
//         s.push(250);
//         s.push(390);
//         s.push(720);
//         s.push(990);
//         s.push(1290);

//         while (!s.isEmpty()) {
//             System.out.println(s.peek());
//             s.pop();
//         }

//     }
// }

class StackAllOp {

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
            int popped = head.data;
            head = head.next;
            return popped;
        }

        int peek() {
            if (isEmpty()) {
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(125);
        stack.push(200);
        stack.push(250);
        stack.push(390);
        stack.push(720);
        stack.push(990);
        stack.push(1290);

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        System.out.println(stack.peek());
    }
}