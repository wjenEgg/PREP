package recursion;

public class FibonacciCalculator {

	public static int cal(int number)
	{
		if (number == 0 || number == 1)
			return number;
		else
			return cal(number - 1) + cal(number - 2);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(FibonacciCalculator.cal(10));
	}

}
