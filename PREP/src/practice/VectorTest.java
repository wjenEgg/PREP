package practice;

import java.util.Vector;

public class VectorTest extends TestAbstract {
	private Vector test = new Vector();
	public void test(){
		test.addElement("hello");
		test.addElement(1);
		System.out.println(test);
	}
	public static void main(String args[]){
		VectorTest vt = new VectorTest();
		vt.test();
		vt.output();
	}
}
