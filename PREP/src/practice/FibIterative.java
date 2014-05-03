package practice;

public class FibIterative {

	public static void exe(int target){
		int[] a = new int[target];
		for (int i=0;i<a.length;i++){
			if(i==0)
				a[i]=0;
			if(i==1)
				a[i]=1;
			if(i>1)
				a[i]=a[i-1]+a[i-2];
		}
		System.out.println(a[a.length-1]);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FibIterative.exe(11);
	}

}
