package practice;

import java.util.HashMap;

public class FibDynamicProgramming {
	private static HashMap<Integer, Integer> result = new HashMap<Integer, Integer>();
	public static int CalNum(int n){
		if(result.containsKey(n))
			return result.get(n);
		if(n==0 || n==1)
			return n;
		result.put(n, CalNum(n-1)+CalNum(n-2));
		return result.get(n);
	}
	public static void main(String args[]){
		System.out.println(FibDynamicProgramming.CalNum(10));
	}
}
