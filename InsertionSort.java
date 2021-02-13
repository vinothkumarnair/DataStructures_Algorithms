class Main {  
  public static void main(String args[]) { 
    System.out.println("Hello, world!");
    
    int[] unsortedArray = new int[] {4,9,1,3,6,7,55,2};
    InsertionSort insertionSort=new InsertionSort();
    int[] sortedArray=insertionSort.sort(unsortedArray);
    
    for(int printCount=0;printCount<sortedArray.length;printCount++)
    {
        System.out.println(" result "+ sortedArray[printCount] );
    }
  } 
}

class InsertionSort{
    
    public int[] sort(int[] array)
    {
        int sortedIndex=0;
        for(int sortedArrayIndexCount=0; sortedArrayIndexCount<array.length;sortedArrayIndexCount++)
        {
            System.out.println("sorted index "+sortedArrayIndexCount);
    
            if(sortedArrayIndexCount!=array.length-1)
            {
                for(int unsortedIndexCount=sortedArrayIndexCount+1;unsortedIndexCount>0;unsortedIndexCount--)
                {
     

                   if(array[unsortedIndexCount]<array[unsortedIndexCount-1])
                   {
                       System.out.println("swapping  "+(unsortedIndexCount+1) + " with "+ unsortedIndexCount);
                       swap(array,unsortedIndexCount,unsortedIndexCount-1);
                   }
                    
                }
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
