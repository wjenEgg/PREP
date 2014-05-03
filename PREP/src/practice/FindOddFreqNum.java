package practice;

public class FindOddFreqNum {
	public static int tester(int[] test){
		int result=test[0];
		for(int i=1;i<test.length;i++)
			result=result^test[i];
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] test = {1,2,3,2,1,3,21,43,34,34,12,21,43};
		System.out.println(FindOddFreqNum.tester(test));
	}

}
