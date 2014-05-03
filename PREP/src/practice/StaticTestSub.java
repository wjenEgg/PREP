package practice;

public class StaticTestSub extends StaticTest {
	public static void getNum(int i){
		System.out.print(i+1);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticTest a = new StaticTestSub();
		a.getNum(1);
	}

}
