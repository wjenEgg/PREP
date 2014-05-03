package sorting;

public class Insertion {
	
	public static void execute (int[] input)
	{
		if (input.length < 2)
		{
			output(input);
		}
		else
		{
			for (int i = 1; i < input.length; i++)
			{
				int key = input[i];
				int j = i - 1;
				while (j > -1 && input[j] > key)
				{
					input[j + 1] = input[j];
					j--;
				}
				input[j + 1] = key;
			}
			output(input);
		}
	}
	
	private static void output (int[] input)
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
		int[] abc = {5,3,4,2,1,-1,0,7,11,6,8};
		Insertion.execute(abc);
	}

}
