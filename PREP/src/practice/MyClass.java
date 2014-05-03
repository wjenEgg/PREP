package practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MyClass {
	private int num1;
	private int num2;
	private String str1;
	public MyClass(int num1, int num2, String str1){
		this.num1=num1;
		this.num2=num2;
		this.str1=str1;
	}
	public int getNum1(){
		return num1;
	}
	public int getNum2(){
		return num2;
	}
	public String getStr1(){
		return str1;
	}
	public boolean equals(MyClass obj){
		if(num1==obj.getNum1() && num2==obj.getNum2() && str1.equals(obj.getStr1()))
			return true;
		else
			return false;
	}
	public static void main(String[] args) throws Exception{
		/*MyClass class1=new MyClass(1,2,"1");
		MyClass class2=new MyClass(1,2,"1");
		MyClass class3=new MyClass(1,2,"2");
		BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
		if(class1==class2)
			System.out.println("1 and 2 are the same.");
		if(class1.equals(class2))
			System.out.println("The value of 1 and 2 are the same.");
		if(!class1.equals(class3))
			System.out.println("The value of 1 and 3 are different.");
		StringTokenizer tokenizer = new StringTokenizer(keyboard.readLine());
		System.out.flush();
		System.out.println(tokenizer.nextToken());*/
		MyClass Class4=null;
		if(null==Class4)
			System.out.println("b");
		if(Class4==null)
			System.out.println("a");
		
	}
}
