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

        for(int unsortedIndexCount=1; unsortedIndexCount<array.length;unsortedIndexCount++)
        {
            System.out.println("unsortedIndexCount index "+unsortedIndexCount);
    
            int element = array[unsortedIndexCount];
            int lastIndexInSortedArray=unsortedIndexCount-1;
            while(lastIndexInSortedArray >= 0 && array[lastIndexInSortedArray] > element)
            {
                array[lastIndexInSortedArray+1] = array[lastIndexInSortedArray];
                lastIndexInSortedArray--;
            }
            
            array[lastIndexInSortedArray+1]=element;
            
            
            System.out.println("***** after inner loop");
                for(int printCount=0;printCount<array.length;printCount++)
                {
                    System.out.println(" inner "+ array[printCount] );
                }
            System.out.println("***** inner loop done");
            
        }
        return array;
    }
    
  
    
}
