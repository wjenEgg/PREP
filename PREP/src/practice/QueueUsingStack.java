package practice;

import java.util.Stack;

public class QueueUsingStack {
	private Stack<Integer> in= new Stack<Integer>();
	private Stack<Integer> out=new Stack<Integer>();
	public void Put(int input){
		if(!out.empty())
			while(!out.empty())
				in.add(out.pop());
		in.add(input);
	}
	public int Pop(){
		if(in.empty() && out.empty())
			return -1;
		if(!in.empty())
			while(!in.empty())
				out.add(in.pop());
		return out.pop();
	}
	public static void main(String[] args) {
		QueueUsingStack qus = new QueueUsingStack();
		qus.Put(1);
		qus.Put(2);
		qus.Put(3);
		System.out.println(qus.Pop());
		System.out.println(qus.Pop());
		System.out.println(qus.Pop());
		qus.Put(4);
		qus.Put(5);
		qus.Put(6);
		System.out.println(qus.Pop());
		System.out.println(qus.Pop());
		qus.Put(4);
		qus.Put(5);
		System.out.println(qus.Pop());
		System.out.println(qus.Pop());
		System.out.println(qus.Pop());
		System.out.println(qus.Pop());
		System.out.println(qus.Pop());
		System.out.println(qus.Pop());
		qus.Put(1);
		qus.Put(2);
		qus.Put(3);
		System.out.println(qus.Pop());
		System.out.println(qus.Pop());
		System.out.println(qus.Pop());
		System.out.println(qus.Pop());
	}
}
