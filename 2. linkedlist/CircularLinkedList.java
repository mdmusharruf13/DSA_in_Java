public class CircularLinkedList {
    
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;
    Node tail = null;

    void add(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next = newNode;
            tail = newNode;
            newNode.next = head;
        }
        System.out.println(data+" is added ");
    }

    void display(){
        Node temp = head;
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        System.out.print("list elements are : ");
        while(temp.next != head){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println(temp.data+" ");
    }

    void delete(int data){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        Node temp = head;
        if(head.data == data && head.next == null){
            head = null;
            tail = null;
            System.out.println(data+" deleted");
            return;
        }
        else if(head.data == data && head.next != null){
            head = head.next;
            tail.next = head;
            System.out.println(data+" deleted");
            return;
        }
        Node prev = head;
        while(temp != tail){
            if(temp.data == data){
                prev.next = temp.next;
                System.out.println(data+" deleted");
                return;
            }
            prev = temp;
            temp = temp.next;
        }
        if(temp.data == data){
            prev.next = temp.next;
            System.out.println(data+" deleted");
            return;
        }
    }

    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();

        list.add(101);
        list.add(10);
        list.add(11);
        list.add(1);
        list.add(12);
        
        list.display();

        list.delete(11); // deleting middle element
        list.display();

        list.delete(101); // deleting first element
        list.display();
        
        list.delete(12); // deleting last element
        list.display();

    }
}
