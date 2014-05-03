package august;

import java.util.LinkedList;
import java.util.Queue;

public class Q {

	int n = 0;
	Queue<Integer> q = new LinkedList<Integer>();
	boolean valueSet = false;
	
	synchronized void get() throws InterruptedException{
		if(n<=0){
			System.out.println("Nothing here");
			wait();
		}else if(!valueSet){
			wait();
		}
		
		n--;
		valueSet = false;
		System.out.println("get:"+q.poll());
		if(n<5)
			notify();
	}
	
	synchronized void put(int x) throws InterruptedException{
		if(n>=5){
			System.out.println("Full");
			wait();
		}else if(valueSet)
			wait();
		
		n++;
		valueSet = true;
		System.out.println("put:" + x);
		q.add(x);
		if(n>0)
			notify();
	}
}
