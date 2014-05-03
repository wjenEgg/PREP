package practice;

public class MaxSubArray {
	public MaxSubArray(int[] target){
		int maxSum=Integer.MIN_VALUE;
		int maxStartIndex=0;
		int maxEndIndex=0;
		int currentMax=0;
		int currentStart=0;
		int tmpStart = 0;
		for(int currentEnd=0;currentEnd<target.length;currentEnd++){
			currentMax=currentMax+target[currentEnd];
			if(currentMax<0){
				currentMax=0;
				currentStart=currentEnd+1;
			}
			if(currentMax>maxSum){
				maxSum=currentMax;
				maxStartIndex=currentStart;
				maxEndIndex=currentEnd;
			}
		}
		System.out.println("Max:"+maxSum+"Start:"+maxStartIndex+"End:"+maxEndIndex);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] abc={1,0,-11,22,-5,50,-45,55};
		MaxSubArray msa=new MaxSubArray(abc);
	}

}
