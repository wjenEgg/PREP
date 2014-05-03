package practice;

public class FibRecursive {

	public static int exe(int num){
		if(num < 0)
			return -1;
		if(num==0)
			return 0;
		if(num==1)
			return 1;
		return exe(num-1)+exe(num-2);
	}
	public static void main(String[] args) {
		System.out.println(FibRecursive.exe(-3));

	}

}
