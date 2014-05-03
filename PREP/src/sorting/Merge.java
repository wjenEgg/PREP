package sorting;

public class Merge {

	public static void execute(int[] input, int start, int end)
	{
		if (start < end)
		{
			int middle = (start + end) / 2;
			execute(input, start, middle);
			execute(input, middle + 1, end);
			merge(input, start, middle, end);
		}
	}
	
	private static void merge(int[] input, int i, int j, int k)
	{
		int leftLength = j - i + 1; // Adding one is because the dividing is round down
		int rightLength = k - j;
		int [] left = new int[leftLength + 1];// Adding one more space for the max number
		int [] right = new int[rightLength + 1];//// Adding one more space for the max number
		for (int l = 0; l < leftLength; l++)
		{
			left[l] = input[i + l];
		}
		for (int l = 0; l < rightLength; l++)
		{
			right[l] = input[j + l + 1];
		}
		left[left.length - 1] = Integer.MAX_VALUE;
		right[right.length - 1] = Integer.MAX_VALUE;
		int leftIndex = 0;
		int rightIndex = 0;
		for (int l = 0; l <= k - i; l++)
		{
			if (left[leftIndex] <= right[rightIndex])
			{
				input[l + i] = left[leftIndex];//Adding i is because we want to update the number from the place that we merge
				leftIndex++;
			}
			else
			{
				input[l + i] = right[rightIndex];
				rightIndex++;
			}
		}
		

		
		System.out.println(input[1] + " " + input[2] + " " + input[2] + " " + input[2] + " ");
		
	}
	
	public static void output (int[] input)
	{
		for (int i = 0; i < input.length; i++)
		{
			System.out.println(input[i]);
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {5,3,2,1,37,31,32,83,43};
		Merge.execute(input, 0, 8);
		Merge.output(input);

	}

}
