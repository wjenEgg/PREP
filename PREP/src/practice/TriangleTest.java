package practice;

public class TriangleTest {
	public static int judge(int a, int b, int c){
		if ( a + b <= c || a + c <= b || b + c <= a)
			return 4;
		else if ( a == b && a == c && b == c)
			return 3;
		else if ( a == b || a == c || b == c)
			return 2;
		else 
			return 1;
	}

	public static void main(String[] args){
		System.out.println(TriangleTest.judge(1, 100, 2));
	}
}
