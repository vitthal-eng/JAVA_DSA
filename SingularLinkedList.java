package Linked_List;



public class SingularLinkedList {
    Node head;
    private int size;
    SingularLinkedList(){
        this.size = 0;
    }
class Node{
    String data;
    Node next;

    Node(String data){
        this.data = data;
        this.next = null;
        size++;
    }
}

// add : first 
public void addFirst(String data){
    Node newNode = new Node(data);

    if(head == null){
        head = newNode;
        return;
    }

    newNode.next = head;
    head = newNode;
}

// add last
public void addLast(String data){
    Node newNode = new Node(data);
   if(head == null){
        head = newNode;
        return;
    }

    Node currentNode = head;
    while(currentNode.next != null){
        currentNode = currentNode.next;
    }
    currentNode.next = newNode;
}

    public void printList(){
        if(head == null){
            System.out.println("List is empty !");
            return;
        }
        Node currentNode = head;
        while(currentNode != null){
            System.out.print(currentNode.data +  " -> ");
            currentNode = currentNode.next;
    }
    System.out.println("NULL!");
}


// delete first
public void deleteFirst(){
    if(head == null){
        System.out.println("The list is empty");
        return;
    }
    head = head.next;
    size--;
}

public void deleteLast(){
   
    if(head == null){
        System.out.println("The list is empty");
        return;
    }
    size--;
if(head.next == null){
    head = null;
    return;
}

    Node secondlast = head;
    Node lastNode = head.next;
    while(lastNode.next != null){
        lastNode = lastNode.next;
        secondlast = secondlast.next;

    }
    secondlast.next = null;
}

public int getSize(){
    return size;
}

    public static void main(String[] args) {
        SingularLinkedList list = new SingularLinkedList();
        list.addFirst("a");
        list.addFirst("is");
        list .printList();
        
        list.addLast("list");
        list .printList();
        
        list.addFirst("This");
        list .printList();

        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();

        System.out.println(list.getSize());

    }
}
