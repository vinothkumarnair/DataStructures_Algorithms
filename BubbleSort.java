class Main {  
  public static void main(String args[]) { 
    System.out.println("Hello, world!");
    
    int[] unsortedArray = new int[] {4,9,1,3,6,7};
    BubbleSort bubbleSort=new BubbleSort();
    int[] sortedArray=bubbleSort.sort(unsortedArray);
    
    for(int printCount=0;printCount<sortedArray.length;printCount++)
    {
        System.out.println(" item "+ sortedArray[printCount] );
    }
  } 
}
//wont perform well
// need lot of swapping compare to insertion sort
class BubbleSort{
    
    public int[] sort(int[] array)
    {

        for(int count=array.length-1; count>=0;count--)
        {
            System.out.println("outer index "+count);
            
            for(int swapCount=0;swapCount<count;swapCount++)
            {
                if(array[swapCount]>array[swapCount+1])
                {
                    System.out.println("swapping "+ array[swapCount] + " with "+ array[swapCount+1] );
                    swap(array,swapCount);
                }
            }
        }
        return array;
    }
    
    private void swap(int[] array,int index)
    {
        int temp = array[index];
        array[index]=array[index+1];
        array[index+1]=temp;
    }
    
}
