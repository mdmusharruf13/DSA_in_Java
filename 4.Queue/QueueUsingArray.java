public class QueueUsingArray {

    static int queue[];
    static int front, rear, currSize, maxSize;

    QueueUsingArray(int size){
        front = -1;
        rear = -1;
        currSize = 0;
        maxSize = size;
        queue = new int[maxSize];
    }

    void push(int value){
        if(currSize == maxSize){
            System.out.println("queue is full");
            return;
        }
        else{
            if(front == -1){
                front = 0;
                rear = 0;
            }
            else{
                rear = (rear + 1) % maxSize;
            }
            queue[rear] = value;
            System.out.println(queue[rear]+" inserted");
            currSize++;
        }
    }

    void pop(){
        if(front == -1){
            System.out.println("queue is empty");
        }
        else{
            int element = queue[front];
            if(currSize == 1){
                front = -1;
                rear = -1;
            }
            else{
                front = (front + 1) % maxSize;
            }
            System.out.println(element+" is removed");
            currSize--;
        }
    }

    void display(){
        if(front == -1){
            System.out.println("queue is empty");
        }
        else{
            int cnt = currSize;
            System.out.print("queue elements : ");
            for(int i=front; cnt != 0 ; i=(i+1)%maxSize, cnt--){
                System.out.print(queue[i]+" ");
            }
            System.out.println();
        }
    }

    void top(){
        if(front == -1){
            System.out.println("queue is empty");
        }
        else{
            System.out.println(queue[front]+" is the top");
        }
    }

    void size(){
        System.out.println(currSize+" is the size");
    }

    public static void main(String[] args) {
        QueueUsingArray que = new QueueUsingArray(5);
        que.push(98);
        que.push(59);
        que.push(50);
        que.push(23);
        que.push(15);

        que.display();
        que.top(); // first element
        que.size();

        que.push(16); // overflow 

        que.pop();
        que.pop();
        que.pop();
        que.pop();
        que.pop();
        que.size();

        que.pop(); // underflow
    }
}
