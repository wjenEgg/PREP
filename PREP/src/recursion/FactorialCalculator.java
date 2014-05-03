package recursion;

public class FactorialCalculator {

	public static int cal(int number)
	{
		if (number == 1)
			return 1;
		else
			return number * cal(number - 1);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(FactorialCalculator.cal(5));
	}

}
