class UserStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int ptr = -1;

    UserStack() {
        this(DEFAULT_SIZE);
    }

    private UserStack(int size) {
        this.data = new int[size];
    }

    private boolean isFull() {
        return ptr == data.length - 1;
    }

    private boolean isEmpty() {
        return ptr == -1;
    }

    boolean push(int item) {
        if (isFull()) {
            System.out.println("stack is full!");
            return false;
        }

        ptr += 1;
        data[ptr] = item;
        System.out.println(item + " inserted");
        return true;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("cannot pop from an empty stack!");
            return -1;
        }
        return data[ptr--];
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("cannot peek from an empty stack!");
        }
        return data[ptr];
    }

}

public class CustomStack {
    public static void main(String[] args) {
        UserStack stack = new UserStack();

        stack.push(98);
        stack.push(90);
        stack.push(50);
        stack.push(18);
        stack.push(19);
        stack.push(53);
        stack.push(59);
        stack.push(33);
        stack.push(40);
        stack.push(99);
        stack.push(66);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
