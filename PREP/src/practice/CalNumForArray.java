package practice;

public class CalNumForArray {
	public static void main(String[] args) throws CloneNotSupportedException {
		int[] target={1,2,3,4,5,6,7,8,9};
		int[] result = new int[target.length];
		int products=1;
		for(int i=0;i<target.length;i++)
			products*=target[i];
		for(int i=0;i<result.length;i++){
			result[i]=products/target[i];
			System.out.println(result[i]);
		}
	}
}
