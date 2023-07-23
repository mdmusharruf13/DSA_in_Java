public class Queue1{

    int SIZE = 5;
    int arr[] = new int[SIZE];
    int front, rear;

    Queue1(){
        front = -1;
        rear = -1;
    }

    void enqueue(int data){
        if(rear == SIZE-1){
            System.out.println("queue is full");
        }
        else{
            if(front == -1){
                front = 0;
            }
            arr[++rear] = data;
            System.out.println(data+" is inserted");
        }
    }

    void dequeue(){
        if(front == -1 || front > rear){
            System.out.println("queue is empty");
        }
        else{
            int data = arr[front];
            if(front >= rear){
                front = -1;
                rear = -1;
            }
            else{
                front++;
            }
            System.out.println(data+" is removed");
        }
    }

    void display(){
        if(front == -1 || front >= rear){
            System.out.println("queue is empty");
        }
        else{
            System.out.print("queue elements are : ");
            for(int i=front; i<=rear; i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }

    void peek(){
        if(front == -1 || front >rear ){
            System.out.println("queue is empty");
        }
        else{
            System.out.println("peek -> "+arr[front]);
        }
    }

    void isEmpty(){
        if(front == -1 || front > rear){
            System.out.println("Queue is empty");
        }
        else{
            System.out.println("Not empty");
        }
    }

    void isFull(){
        if(rear == SIZE-1){
            System.out.println("Queue is FULL");
        }
        else{
            System.out.println("Queue empty");
        }
    }
    public static void main(String[] args) {
        Queue1 q = new Queue1();
        q.enqueue(98);
        q.enqueue(15);
        q.enqueue(20);
        q.enqueue(11);
        q.enqueue(45);
        q.enqueue(55); // adding extra element -> queue is already full

        q.peek();
        q.isEmpty();
        q.isFull();

        q.display();

        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue(); // trying to remove from empty queue -> queue is empty 

        q.display();
    }
}



