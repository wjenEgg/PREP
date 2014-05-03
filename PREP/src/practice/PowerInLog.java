package practice;

public class PowerInLog {

	public static int power(int base, int pow){	
		int num = 0;	
		if(pow == 1)	{		
			return base;	
		}	
		if(pow == 0)	{		
			return 1;	
		}	
		if(((pow>>1)<<1) == pow) /*a%2==0*/	{		
			num = power(base, pow>>1);		
			return num*num;	
		}	
		return base*power(base, pow-1);
	}
	public static void main(String[] args) {
		System.out.println(PowerInLog.power(3, 5));
	}

}
