package revision.linkedlista;

public class LinkedList {

    class Node{
        int data;
        Node next;
        public Node(int data){
             this.data=data;
        }
    }
    Node head;
    int size;

    public LinkedList(){
        this.size=0;
    }

    public Node add(int data){
        Node node=new Node(data);
        if(this.head==null){
            this.head=node;
        }else{
            Node i=this.head;
            while(i.next!=null){
                i=i.next;
            }
            i.next=node;
        }
        this.size++;
        return node;
    }

    public Node addFirst(int data){
        Node node=new Node(data);
        if(this.head==null){
            this.head=node;
        }else{
            Node temp=this.head;
            this.head=node;
            node.next=temp;
        }
        return node;
    }

//    public Node deleteFirst(){
//
//    }

    public void display(){
        Node i=this.head;
        while(i!=null){
            System.out.print(i.data+" -> ");
            i=i.next;
        }
        System.out.println("null");
    }
}
