package august;

import java.util.LinkedList;

public class TestCenter {
	public static void main(String args[]){
		Q q = new Q();
		new Producer(q);
		new Consumer(q);
	}
}
