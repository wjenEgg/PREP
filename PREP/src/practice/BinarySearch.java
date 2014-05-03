package practice;

public class BinarySearch
{
	public static int binarySearch(int[] list, int searchItem) {
	    int first=0;
	    int last = list.length - 1;
	    int mid=0;
	    
	    boolean found = false;
	    
	    //Loop until found or end of list.
	    while(first <= last &&!found) {
	        //Find the middle.
	        mid = (first + last) /2;
	        
	        //Compare the middle item to the search item.
	        if(list[mid] == searchItem) found = true;
	        else { //Not found, read just search parameters, halving the size & start over.
	            if(list[mid] > searchItem) last = mid -1;
	            else first = mid + 1;
	        }
	    }
	    
	    if(found) return mid;
	    else return(-1);
	}
    public static void main( String [ ] args )
    {
      int[] test={2,4,5,7,9,12,23,34,42,51};
      System.out.println(BinarySearch.binarySearch(test, 6));
    }
}
