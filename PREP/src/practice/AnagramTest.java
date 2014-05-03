package practice;

import java.util.HashMap;

public class AnagramTest {
	private HashMap<Character, Integer> frequency = new HashMap<Character, Integer>();
	public AnagramTest(String target){
		target =target.toLowerCase();
		for (int i=0;i<target.length();i++)
			if(65<=(int)target.charAt(i) && (int)target.charAt(i)<=122)
				if(frequency.containsKey(target.charAt(i)))
					frequency.put(target.charAt(i), frequency.get(target.charAt(i))+1);
				else
					frequency.put(target.charAt(i),1);
	}
	public boolean Test(String test){
		HashMap<Character, Integer> testfreq = new HashMap<Character, Integer>();
		test = test.toLowerCase();
		for (int i=0;i<test.length();i++)
			if(65<=(int)test.charAt(i) && (int)test.charAt(i)<=122)
				if(testfreq.containsKey(test.charAt(i)))
					testfreq.put(test.charAt(i), testfreq.get(test.charAt(i))+1);
				else
					testfreq.put(test.charAt(i),1);
		for(Character c: testfreq.keySet())
			if(!frequency.containsKey(c) || frequency.get(c)!=testfreq.get(c))
				return false;
		for(Character c: frequency.keySet())
			if(!frequency.containsKey(c) || frequency.get(c)!=testfreq.get(c))
				return false;
		return true;
	}
	public static void main(String[] args) {
		AnagramTest at = new AnagramTest("A decimal point ");
		System.out.println(at.Test("I'm a dot in place"));
		System.out.println(at.Test(" I am a weakish speller"));
		System.out.println(at.Test("cabb"));
		System.out.println(at.Test("c     ab"));
	}

}
