package practice;

import java.util.HashMap;

public class FindSumInArray {
	public HashMap<Integer, Boolean> value = new HashMap<Integer, Boolean>();
	public boolean Exe(int[] target, int sum){
		for (int i=0; i< target.length;i++)
			value.put(target[i], true);
		for(int i: value.keySet())
			if(value.containsKey(sum-i))
				return true;
		return false;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindSumInArray fsia = new FindSumInArray();
		int[] target={3,8,9,4,18,-3,48,32};
		System.out.println(fsia.Exe(target, 20));
	}

}
