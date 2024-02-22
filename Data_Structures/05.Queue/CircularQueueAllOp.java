
public class CircularQueueAllOp {
    static class Queue {
        static int arr[];
        static int size;
        static int rear = -1;
        static int front = -1;

        Queue(int n) {
            arr = new int[n];
            size = n;
        }

        boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        boolean isFull() {
            return (rear + 1) % size == front;
        }

        void add(int data) {
            if (isFull()) {
                System.out.println("queue is full");
                return;
            }
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        int remove() {
            if (rear == -1) {
                System.out.println("queue is empty");
                return -1;
            }
            int result = arr[front];
            if (rear == front) {
                rear = front = -1;
            } else {
                front = (front + 1) % size;
            }
            return result;
        }

        int peek() {
            if (rear == -1) {
                System.out.println("queue is empty");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(555);
        q.add(45);
        q.add(35);
        q.add(25);
        System.out.println(q.remove() + " removed ");
        q.add(15);
        System.out.println(q.remove() + " removed ");
        q.add(5);

        System.out.println("queue elements are : ");
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
