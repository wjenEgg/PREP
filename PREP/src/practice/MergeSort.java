package practice;

public class MergeSort {

    private int[] list;
    
    /**
     * Construct a new MergeSort object that will
     * sort the specified array of integers.
     *
     * @param listToSort the array of integers to be sorted.
     */
    public MergeSort(int[] listToSort) {
	list = listToSort;
    }

    /**
     * Get a reference to the array of integers in this
     * MergeSort object.
     *
     * @return a reference to the array of integers.
     */
    public int[] getList() {
	return list;
    }

    /**
     * Sort the values in the array of integers in this
     * MergeSort object into non-decreasing order.
     */
    public void sort() {
	list = sort(list);
    }
    
    /**
     * Recursive helper method which sorts the array referred to 
     * by whole using the merge sort algorithm.
     *
     * @param whole the array to be sorted.
     * @return a reference to an array that holds the elements
     *         of whole sorted into non-decreasing order.
     */
    private int[] sort(int[] whole) {
	if (whole.length == 1) {
	    return whole;
	}
	else {
	    // Create an array to hold the left half of the whole array
	    // and copy the left half of whole into the new array.
	    int[] left = new int[whole.length/2];
	    System.arraycopy(whole, 0, left, 0, left.length);

	    // Create an array to hold the right half of the whole array
	    // and copy the right half of whole into the new array.
	    int[] right = new int[whole.length-left.length];
	    System.arraycopy(whole, left.length, right, 0, right.length);
	    
	    // Sort the left and right halves of the array.
	    left = sort(left);
	    right = sort(right);

	    // Merge the results back together.
	    merge(left, right, whole);

	    return whole;
	}
    }

    /**
     * Merge the two sorted arrays left and right into the
     * array whole.
     *
     * @param left a sorted array.
     * @param right a sorted array.
     * @param whole the array to hold the merged left and right arrays.
     */
    private void merge(int[] left, int[] right, int[] whole) {
	int leftIndex = 0;
	int rightIndex = 0;
	int wholeIndex = 0;

	// As long as neither the left nor the right array has
	// been used up, keep taking the smaller of left[leftIndex]
	// or right[rightIndex] and adding it at both[bothIndex].
	while (leftIndex < left.length &&
	       rightIndex < right.length) {
	    if (left[leftIndex] < right[rightIndex]) {
		whole[wholeIndex] = left[leftIndex];
		leftIndex++;
	    }
	    else {
		whole[wholeIndex] = right[rightIndex];
		rightIndex++;
	    }
	    wholeIndex++;
	}
	
	int[] rest;
	int restIndex;
	if (leftIndex >= left.length) {
	    // The left array has been use up...
	    rest = right;
	    restIndex = rightIndex;
	}
	else {
	    // The right array has been used up...
	    rest = left;
	    restIndex = leftIndex;
	}

	// Copy the rest of whichever array (left or right) was
	// not used up.
	for (int i=restIndex; i<rest.length; i++) {
	    whole[wholeIndex] = rest[i];
	    wholeIndex++;
	}
    }

    public static void main(String[] args) {

	int[] arrayToSort = {3,4,9,2,8,34,21,31};

	System.out.println("Unsorted:");
	for(int i= 0; i<arrayToSort.length;i++)
		System.out.print(arrayToSort[i]+",");

	MergeSort sortObj = new MergeSort(arrayToSort);
	sortObj.sort();

	System.out.println("Sorted:");
	for(int i= 0; i<arrayToSort.length;i++)
		System.out.print(arrayToSort[i]+",");
    }
}


