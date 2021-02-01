class Main {  


  //last in first out (LIFO)
  public static void main(String args[]) {
    
    Stack stack=new Stack();
    
    stack.push(50);
    
    stack.push(55);
    
    System.out.println("should be 55 - "+ stack.peek());
    
    stack.push(70);
    
    stack.push(75);
    
    System.out.println("should be 75 - "+ stack.pop());
    
    stack.push(80);
    
    System.out.println("should be 80 - "+ stack.pop());

  } 

}

class Stack {
    

private  int top;
private  int[] stack;

public Stack()
{
    stack = new int[10];
    top =-1;
}
  public  void push(int item)
  {
      top++;
      stack[top]=item;
  }
  
  public  int pop()
  {
      int oldTop=top;
      top--;
      return stack[oldTop];
  }

  public  int peek()
  {
      return stack[top];
  }
  
  //todo : empty check
}

