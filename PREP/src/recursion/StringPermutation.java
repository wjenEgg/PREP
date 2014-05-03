package recursion;

public class StringPermutation {
	public static void permutate(String input) {
		execute("", input);
	}
	
	private static void execute(String start, String end) {
		if (end.length() <= 1)
			System.out.println(start + end);
		else {
			for (int i = 0; i < end.length(); i++) {
				String newString = end.substring(0, i) + end.substring(i + 1);
				execute(start + end.charAt(i), newString);
			}
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringPermutation.permutate("math");

	}

}
