package practice;


public class LargestElementInAnArray{
	public static void main(String args[]){
		int[] test={12,43,23,74,83,30,45,36,93,1,35,54};
		System.out.print(largest(test,0,11));
	}
	public static int largest(int[] list, int lowerindex, int upperindex){
		int max;
		if(lowerindex==upperindex)
			return list[lowerindex];
		else{
			max=largest(list, lowerindex+1, upperindex);
			if(list[lowerindex]>=max)
				return list[lowerindex];
			else
				return max;
		}
	}
}
