class Main {  
  public static void main(String args[]) { 
    System.out.println("Hello, world!");
    
    int[] unsortedArray = new int[] {4,9,1,3,6,7,55,2};
    SelectionSort selectionSort=new SelectionSort();
    int[] sortedArray=selectionSort.sort(unsortedArray);
    
    for(int printCount=0;printCount<sortedArray.length;printCount++)
    {
        System.out.println(" result "+ sortedArray[printCount] );
    }
  } 
}
//performance O(n^2)
//pick a biggest element from unsorted partion and move it to sorted partion
class SelectionSort{
    
    public int[] sort(int[] array)
    {

        for(int count=array.length-1; count>=0;count--)
        {
            System.out.println("outer index "+count);
            int largestIndex=0;
            
            for(int swapCount=0;swapCount<=count;swapCount++)
            {
                if(array[swapCount]>array[largestIndex])
                {
                    largestIndex = swapCount;
                    System.out.println("largest is "+largestIndex );
                }
            }
            
            System.out.println("swapping index "+largestIndex + " with "+ count);
            
            swap(array,largestIndex,count);
            
            System.out.println("****** after sorting *****");
            for(int printCount=0;printCount<array.length;printCount++)
            {
                System.out.println(" item "+ array[printCount] );
            }
            System.out.println("****** done sorting *****");
            
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
