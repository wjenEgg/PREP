package practice;

public class CartesianPoint {

	private static int x=-100;
	private static int y=0;
	private static double large=Integer.MIN_VALUE;
	private static double small=Integer.MAX_VALUE;
	private static int largeindex=0;
	private static int smallindex=0;
	public static void exe(int[] xlist, int[] ylist){
		for (int i=0;i<xlist.length;i++)
			if(Math.sqrt(Math.pow(xlist[i]-x,2)+Math.pow(ylist[i]-y,2))<small){
				small=Math.sqrt(Math.pow(xlist[i]-x,2)+Math.pow(ylist[i]-y,2));
				smallindex=i;
			}
			else if(Math.sqrt(Math.pow(xlist[i]-x,2)+Math.pow(ylist[i]-y,2))>large){
				large=Math.sqrt(Math.pow(xlist[i]-x,2)+Math.pow(ylist[i]-y,2));
				largeindex=i;
			}
		System.out.println("large point: "+xlist[largeindex]+", "+ylist[largeindex]+"small point: "+xlist[smallindex]+", "+ylist[smallindex]);
	}
	public static void main(String[] args) {
		int[] xlist={3,4,1,5,9,-8,3,7};
		int[] ylist={-1,4,2,-3,-9,6,1,0};
		CartesianPoint.exe(xlist, ylist);
		long test =9;
		long result=1;
		for(int i=0;i<100;i++)
			result=result*test;
		System.out.println(result);
	}

}
