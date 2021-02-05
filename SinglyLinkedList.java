class Main {  


  public static void main(String args[]) {

    SinglyLinkedList myList=new SinglyLinkedList();
    myList.insertFirst(10);
    myList.insertFirst(40);
    myList.insertFirst(60);
    myList.insertFirst(80);
    myList.insertFirst(90);
    
    myList.printAllNodes();
    
    myList.deleteFirst();
    myList.deleteFirst();
    
    System.out.println("after delete *********");
    myList.printAllNodes();
    
    
    System.out.println("after inserting last ****");
    myList.insertLast(200);
    myList.insertLast(800);
    myList.printAllNodes();
    
    

  } 

}

class Node {
    
public int data;
public Node next;

public Node(int data)
{
    this.data=data;
}

public void display()
{
    System.out.println("node value : "+ data );
}

}

class SinglyLinkedList
{
    
    private Node first;
    private Node last;
    
    public Node insertFirst(int data)
    {
        Node node=new Node(data);
        node.next = first;
        
         if(isEmpty())
            last= node;
        
        first = node;
        
        return first;
    }
    
    public Node deleteFirst()
    {
        Node temp = first;
        first = first.next;
        return first;
    }
    
    public Node insertLast(int data)
    {
        Node newNode=new Node(data);
        
        if(isEmpty())
        {
            first=newNode;
        }
        else
        {
        last.next = newNode;
        last = newNode;
        return last;
        }
        
    }
    
    public boolean isEmpty()
    {
        return first==null;
    }
    
    public void printAllNodes()
    {
        Node currentNode = first;
        
        while(currentNode!=null)
        {
            System.out.println("current node value : "+ currentNode.data);
            currentNode = currentNode.next;
        }
    }
}

