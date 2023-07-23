public class DoublyLinkedList {

    class Node{
        String data;
        Node prev;
        Node next;

        Node(String data){
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    void createNode(String str){
        Node newNode = new Node(str);
        if(head==null){
            head = newNode;
            tail = newNode;
        }
        else{
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
        System.out.println(str+" inserted ");
    }

    void displayList(){
        Node temp = head;
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        System.out.print("list elements are : ");
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    void deleteNode(String str){
        if(head==null){
            System.out.println("list is empty : ");
            return;
        }
        Node curr = head;
        Node prev = head;
        while(curr != null){
            if(curr.data == str && head == curr){
                if(curr.next == null){
                    head = null;
                    tail = null;
                    break;
                }
                else{
                    head = curr.next;
                    curr.next.prev = null;
                    break;

                }
            }
            else if(curr.data == str && head != curr){
                prev.next = curr.next;
                curr.next.prev = prev;
                break;
            }
            curr = curr.next;
        }
    }

    Node head = null;
    Node tail = null;
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.createNode("java");
        list.createNode("c");
        list.createNode("c++");
        list.createNode("C#");
        list.createNode("python");
        list.createNode("Rust");
        list.displayList();
        list.deleteNode("java");
        list.displayList();
    }   
}
