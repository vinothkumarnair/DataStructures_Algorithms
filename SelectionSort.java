class Main {  
  public static void main(String args[]) { 
    System.out.println("Hello, world!");
    
    int[] unsortedArray = new int[] {4,9,1,3,6,7};
    SelectionSort selectionSort=new SelectionSort();
    int[] sortedArray=selectionSort.sort(unsortedArray);
    
    for(int printCount=0;printCount<sortedArray.length;printCount++)
    {
        System.out.println(" result "+ sortedArray[printCount] );
    }
  } 
}

class SelectionSort{
    
    public int[] sort(int[] array)
    {

        for(int count=array.length-1; count>=0;count--)
        {
            System.out.println("outer index "+count);
            int largestIndex=-1;
            
            for(int swapCount=0;swapCount<count;swapCount++)
            {
                if(array[swapCount]>array[swapCount+1])
                {
                    System.out.println("largetst index is "+swapCount);
                    largestIndex=swapCount;
                }
            }
            
            if(largestIndex>=0)
            {
            System.out.println("swapping index "+largestIndex + " with "+ count);
            
            swap(array,largestIndex,count);
            }
            
        
        }
        return array;
    }
    
    private void swap(int[] array,int index,int unsortedArrayLength)
    {
        int temp = array[index];
        array[index]=array[unsortedArrayLength];
        array[unsortedArrayLength]=temp;
    }
    
}
