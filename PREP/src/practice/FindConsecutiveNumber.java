package practice;

import java.util.HashMap;

public class FindConsecutiveNumber {
	HashMap<Integer, Integer> freq = new HashMap<Integer, Integer>();
	public FindConsecutiveNumber(int[] target){
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		boolean nonconsecutive=false;
		for(int i=0; i<target.length;i++){
			if(freq.containsKey(target[i])){
				nonconsecutive=true;
				break;
			} else{
				freq.put(target[i], 1);
				if(target[i]>max)
					max=target[i];
				if(target[i]<min)
					min=target[i];
			}
		}
		if(nonconsecutive==true || max-min+1!=target.length)
			System.out.println("not consecutive");
		else
			System.out.println("consecutive");
	}
	public static void main(String args[]){
		int[] target={2,5,1,4,3,6,0};
		FindConsecutiveNumber fcn = new FindConsecutiveNumber(target);
	}
}
