// import java.util.*;

public class Stack1 {

    static int SIZE = 5;
    int stack[] = new int[SIZE];
    int top = -1;

    void push(int value){
        if(top == SIZE-1){
            System.out.println("overflow...");
            System.out.println(value+" cannot be inserted");
        }
        else{
            stack[++top] = value;
        }
    }

    void pop(){
        if(top == -1){
            System.out.println("underflow...");
        }
        else{
            int popped = stack[top--];
            System.out.println(popped+" is deleted");
        }
    }

    void display(){
        if(top == -1){
            System.out.println("underflow");
        }
        else{
            System.out.println("stack elements are : ");
            for(int i=top; i>=0; i--){
                System.out.println(stack[i]);
            }
        }
    }


    public static void main(String[] args) {
        Stack1 stk = new Stack1();
        stk.push(598);
        stk.push(120);
        stk.push(255);
        stk.push(1200);
        stk.push(300);
        stk.push(400);

        stk.display();

        stk.pop();

        stk.display();
    }
}
