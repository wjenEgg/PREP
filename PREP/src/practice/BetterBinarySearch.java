package practice;

public class BetterBinarySearch {
	public static int binarySearch(int[] args, int low, int high ,int target)
	{
		int mid;
		
		while(low > high)
		{
			mid = (low + high)/2;
			if(args[mid] == target)
				return mid;
			else if(args[mid] > target)
				high = mid -1;
			else
				low = mid + 1;
		}
		
		return -1;
	}
	
	public static void main( String [ ] args )
    {
      int[] test={2,4,5,7,9,12,13,23,34,42,51};
      System.out.println(BinarySearch.binarySearch(test, 13));
    }
}
