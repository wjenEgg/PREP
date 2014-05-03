package practice;

import java.util.HashMap;

public class FindIntersectionInStringArray {
	public static String[] execute(String[] a, String[] b){
		HashMap<String, Boolean> result = new HashMap<String, Boolean>();// This hashmap is used to save the result
		//The reason to make it as a hashmap is to avoid duplicated values.
		HashMap<String, Boolean> tmp = new HashMap<String, Boolean>();// This hashmap is used to save the values in both of arrays.
		for (int i = 0; i < Math.max(a.length, b.length); i++){// Using the biggest length as upper bound.
			if (i < a.length && i < b.length){
				if (tmp.containsKey(a[i]) && !result.containsKey(a[i]))//Check the value in tmp and result
					result.put(a[i], true);
				else
					tmp.put(a[i], true);
				if (tmp.containsKey(b[i]) && !result.containsKey(b[i]))
					result.put(b[i], true);
				else
					tmp.put(b[i], true);
			} else if (i < a.length){
				if (tmp.containsKey(a[i]) && !result.containsKey(a[i]))
					result.put(a[i], true);
				else
					tmp.put(a[i], true);
			} else {
				if (tmp.containsKey(b[i]) && !result.containsKey(b[i]))
					result.put(b[i], true);
				else
					tmp.put(b[i], true);
			}
		}
		return (String[]) result.keySet().toArray(new String[0]);
	}
	public static void main(String[] args){
		String[] a = {"apple", "pork", "beef","beef","apple"};
		String[] b = {"beef", "pork", "banana","pork","apple","banana","chicken"};
		String[] c = FindIntersectionInStringArray.execute(a, b);
		for (int i = 0 ; i < c.length; i++)
			System.out.println(c[i]);
	}
}
