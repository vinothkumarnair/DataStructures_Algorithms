class Main {  
  public static void main(String args[]) { 
    System.out.println("Hello, world!");
    
    int[] unsortedArray = new int[] {4,9,1,3,6,7,55,2};
    MergeSort mergeSort=new MergeSort();
    int[] sortedArray=mergeSort.sort(unsortedArray);
    
    for(int printCount=0;printCount<sortedArray.length;printCount++)
    {
        System.out.println(" result "+ sortedArray[printCount] );
    }
  } 
}

class MergeSort{
    
    public int[] sort(int[] array)
    {
        mergeSort(array,0,array.length-1);
        return array;
    }
    
    private void mergeSort(int[] array,int start,int end)
    {
        if(end <= start)
        {
            System.out.println("exiting regression at start "+ start + " end "+end);
            return;
        }
        
  
        System.out.println("Merge Sort : start "+start + " end "+end);
        int mid = (start + end)/2;
        System.out.println("Merge Sort : mid "+mid);
        System.out.println("*********Merge Sort : Right *********");
        mergeSort(array,start,mid);
        System.out.println("*********Merge Sort : Left *********");
        mergeSort(array,mid+1,end);
        
        System.out.println("********* Merge *********");
         System.out.println("Merge :start "+ start + " mid " + mid + " end "+end);
        merge(array, start,mid,end);
        
        
    }
    
    
    // first sorted array  - 1,3,5,7 ( index - 0 to 3)
    // second sorted array - 2,4,6,8 ( index - 4 to 7)
    //start 0     mid    3    end    7
    private void merge(int[] array, int start, int mid, int end)
    {
        //temp arry to hold the sorted items
        int[] tempArray =new int[(end-start)+1];
        
        int leftIndex =start;
        int rightIndex =mid+1;
        int tempIndex =0;
       
        while(leftIndex<=mid && rightIndex<=end)
        {
            if(array[leftIndex]<array[rightIndex])
            {
                tempArray[tempIndex]=array[leftIndex];
                leftIndex=leftIndex+1;
            }
            else
            {
                tempArray[tempIndex]=array[rightIndex];
                rightIndex=rightIndex+1;
            }
            tempIndex=tempIndex+1;
        }
        
        //copy the already sorted values to temp
       if(leftIndex<=mid)
        {
            while(leftIndex<=mid)
            {
                tempArray[tempIndex]=array[leftIndex];
                tempIndex++;
                leftIndex++;
            }
        }else if (rightIndex<=end)
        {
            while(rightIndex<=end)
            {
                tempArray[tempIndex]=array[rightIndex];
                tempIndex++;
                rightIndex++;
            }
        }
        
        for(int i=0;i<tempArray.length;i++)
        {
            array[start+i]=tempArray[i];
        }
        
        
        
        for(int printCount=0;printCount<tempArray.length;printCount++)
        {
            System.out.println(" temp "+ tempArray[printCount] );
        }
    
    
    }
    
    
    
}
