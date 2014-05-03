package practice;

import java.util.ArrayList;
import java.util.List;

public class Generics {
	public static void exe(List l){
		if(l.get(0) instanceof Integer)
			System.out.println("Integer");
		else if (l.get(0) instanceof Double)
			System.out.println("Double");
		else if (l.get(0) instanceof String)
			System.out.println("String");
		for (int i = 0; i < l.size(); i++){
			System.out.println(l.get(i));
		}
	}
	public static void main(String[] args){
		ArrayList<String> test1 = new ArrayList<String>();
		test1.add("a");
		test1.add("b");
		test1.add("c");
		Generics.exe(test1);
		ArrayList<Integer> test2 = new ArrayList<Integer>();
		test2.add(1);
		test2.add(2);
		test2.add(3);
		Generics.exe(test2);
		ArrayList<Double> test3 = new ArrayList<Double>();
		test3.add(1.32);
		test3.add(2.32);
		test3.add(3.32);
		Generics.exe(test3);
	}
}
