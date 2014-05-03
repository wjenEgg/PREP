package practice;

public class FindShortestDistance {

	public static void exe(int[] input, int target1, int target2){
		int postarget1=-1;
		int postarget2=-1;
		int min=Integer.MAX_VALUE;
		for(int i=0;i<input.length;i++){
			if(input[i]==target1){
				postarget1=i;
				if(postarget2!=-1)
					if(Math.abs(postarget1-postarget2)<min)
						min=Math.abs(i-postarget2);
			}
			if(input[i]==target2){
				postarget2=i;
				if(postarget1!=-1)
					if(Math.abs(i-postarget1)<min)
						min=Math.abs(i-postarget1);
			}
		}
		if(min==Integer.MAX_VALUE)
			System.out.println("one of them or both of them are not existed!");
		else
			System.out.println(min);
	}
	public static void main(String[] args) {
		int[] input={2,1,4,3,9,5,2,4,1,2,4,6,4,5};
		FindShortestDistance.exe(input, 9, 4);
	}

}
