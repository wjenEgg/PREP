package practice;

import java.util.HashMap;

public class PythagoranTripletInArray {

	public static void exe(int[] target){
		HashMap<Double, Boolean> map = new HashMap<Double, Boolean>();
		for(int i=0; i<target.length;i++)
			map.put(Math.pow(target[i],2), true);
		for(int i=0; i<target.length-1;i++)
			for(int j=i+1;j<target.length;j++)
				if(map.containsKey(Math.pow(target[i], 2)+Math.pow(target[j], 2)))
					System.out.println(target[i]+","+target[j]+","+Math.sqrt(Math.pow(target[i], 2)+Math.pow(target[j], 2)));
	}
	
	public static void main(String[] args) {
		int[] target={3,4,5,2,6,8};
		PythagoranTripletInArray.exe(target);
	}

}
