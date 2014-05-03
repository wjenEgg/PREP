package practice;

public class FindSmallestTwo {

	private static int small1=Integer.MAX_VALUE-1;
	private static int small2=Integer.MAX_VALUE;
	public static void exe(int[] target){
		for(int i =0;i<target.length;i++){
			if(target[i]<small1){
				small2=small1;
				small1=target[i];
			}
			else if(target[i]<small2)
				small2=target[i];
		}
		System.out.println("1:" +small1+", 2:" +small2);
	}
	public static void main(String[] args) {
		int[] target ={98,34,13,84,32,54,21,43,12,12,13};
		FindSmallestTwo.exe(target);

	}

}
