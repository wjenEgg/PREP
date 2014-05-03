package practice;

import java.util.HashMap;

public class FrequecyInArray {
	private int[] target={1,1,1,1,1,2,2,2,2,3,3,3,2,1,1};
	public FrequecyInArray(){
		HashMap<Integer, Integer> freq = new HashMap<Integer, Integer>();
		int maxFreq=0;
		int Freq=1;
		int maxTarget=0;
		for (int i=0;i< target.length;i++){
			if(i>0){
				if(target[i]==target[i-1])
					Freq++;
				else{
					if((freq.containsKey(target[i-1]) && freq.get(target[i-1])<Freq) || !freq.containsKey(target[i-1]))
						freq.put(target[i-1], Freq);
					Freq=1;
				}
			}
		}
		for(int i: freq.keySet())
			if(freq.get(i)>maxFreq){
				maxFreq=freq.get(i);
				maxTarget=i;
			}
		System.out.println(maxTarget);
	}
	public static void main(String args[]){
		FrequecyInArray fia = new FrequecyInArray();
	}
}
