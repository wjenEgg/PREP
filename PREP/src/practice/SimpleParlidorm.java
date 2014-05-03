package practice;

public class SimpleParlidorm {

	/**
	 * @param args
	 */
	public static boolean execute(String target, boolean casesen){
		if (!casesen)
			target = target.toLowerCase();
		for (int i = 0; i < target.length() / 2; i++)
			if (target.charAt(i) != target.charAt(target.length() - 1 - i))
				return false;
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(SimpleParlidorm.execute("abczoiOzcba", false));
	}

}
