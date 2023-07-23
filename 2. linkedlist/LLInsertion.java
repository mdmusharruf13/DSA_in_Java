public class LLInsertion{

    class Node{
        int data;
        Node next;
        
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public Node head = null;
    public Node tail = null;

    public void insert(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next = newNode;
            tail = newNode;
        } 
    }

    public void display(){
        Node temp = head;
        if(head==null){
            System.out.println("List is empty");
        }
        else{
            System.out.println("list elements : ");
            while(temp!=null){
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    public void delete(int val){
        if(head==null){
            System.out.println("list is empty");
        }
        else{
            Node temp = head;
            Node prev = null;
            while(temp.next != null){
                if(temp.data == val){
                    System.out.println(temp.data+" is deleted");
                    prev.next = temp.next;
                    break;
                }
                prev = temp;
                temp = temp.next;
            }
        }
    }

    public void update(int pos, int val){
        if(head==null){
            System.out.println("list is empty");
        }
        else{
            Node temp = head;
            for(int i=0; i<pos; i++){
                if(i==pos-1){
                    System.out.println(temp.data+"->"+val);
                    temp.data = val;
                    break;
                }
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        
        LLInsertion list = new LLInsertion();
        list.insert(100);
        list.insert(200);
        list.insert(500);
        list.insert(400);
        list.insert(300);
        list.display();
        list.delete(500);
        list.display();
        list.update(2,500);
        list.display();

    }
}

