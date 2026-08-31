import org.w3c.dom.Node;

public class LinkedList {
    class Node{
        String name;
        Node next;

        Node(String name){
            this.name = name;
            this.next=null;
        }
    }

    Node head;

    void add(String name){
        Node newNode = new Node(name);

        //if list is empty
        if (head==null) {
            head = newNode;
            return;   
        }
    
    Node temp = head;

     while(temp.next!=null){
        temp = temp.next;
        }

    temp.next = newNode;
}

    void search(String name){
       Node temp1 = head;

        while(temp.next!=null){
           temp = temp.next;
            }

            temp2=last;

            if (temp1.name==temp.name) {
                System.out.println("names are same ");  
            }else{
                if (temp1.name>temp.name) {
                    System.out.println("first node names comes first ");   
                }else{
                    System.out.println("last node names comes first ");   
                }
            }

            
        }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.add("khushi");
        list.add("RIya");
        list.add("RAhul");
        list.add("Rishi");
        
        list.search("Rishi");
    }
    
}
