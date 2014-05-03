package practice;

public class SquareRootCal {
	public SquareRootCal(double target){
		double gap=Double.MAX_VALUE;
		double root=0.0;
		int upper=(int) target;
		int lower=0;
		while(true){
			if(Math.pow((lower+upper)/2,2)>target)
				upper=(lower+upper)/2;
			else
				lower=(lower+upper)/2;
			if(lower==upper-1)
				break;
		}
		root=lower;
		for(int i=1;i<=3;i++)
			root=0.5*(root+target/root);
		System.out.println(root);
		System.out.println(Math.pow(root,2));
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SquareRootCal src = new SquareRootCal(9707);
	}

}
