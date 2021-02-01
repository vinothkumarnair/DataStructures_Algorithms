class Main {  


  public static void main(String args[]) {
    String givenWordToReverse ="vinoth kuma";
    
    Queue queue=new Queue();
    
    char[] wordInChars = givenWordToReverse.toCharArray();
    
    for(char charInWord : wordInChars)
    {
        queue.insert(charInWord);
    }
    
    for(int i=0;i<10;i++)
    {
        System.out.println("char in queue : " + queue.remove());
    }

  } 

}

class Queue {
    
private int index = 0;
private  char[] queueArr;

public Queue()
{
    queueArr = new char[10];
}
  public  void insert(char item)
  {
      //circular queue
      if(index == 10)
        index=0;
        
      queueArr[index]=item;
      
      index=index+1;
  }
  
  public char remove()
  {
      char[] newArray = new  char[10];
      char firstItem = queueArr[0];
      
      for(int charIndex=0;charIndex<10;charIndex++)
      {
          if(charIndex!=0)
            newArray[charIndex-1] =  queueArr[charIndex];
      }
      queueArr = newArray;
      
      return firstItem;
  }

  public char peek()
  {
      return queueArr[0];
  }
  
  //todo : empty check
}

