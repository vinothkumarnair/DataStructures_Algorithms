class Main {  


  public static void main(String args[]) {
  
    
    String givenWordToReverse ="vinoth kum";
    
    Stack stack=new Stack();
    
    char[] wordInChars = givenWordToReverse.toCharArray();
    
    for(char charInWord : wordInChars)
    {
        stack.push(charInWord);
    }
    
    for(int i=0;i<10;i++)
    {
        System.out.println("char in reverse : " + stack.pop());
    }
    
  } 

}

class Stack {
    

private  int top;
private  char[] stack;

public Stack()
{
    stack = new char[10];
    top =-1;
}
  public  void push(char item)
  {
      top++;
      stack[top]=item;
  }
  
  public char pop()
  {
      int oldTop=top;
      top--;
      return stack[oldTop];
  }

  public char peek()
  {
      return stack[top];
  }
  
  //todo : empty check
}

