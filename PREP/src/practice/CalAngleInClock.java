package practice;

public class CalAngleInClock {
	private static double m_angle;
	private static double h_angle;
	
	public static void exe(int h, int m){
		double result;
		//h_angle=((h*5.0)+5.0*m/60.0)/60.0*360.0;
		h_angle =0.5*(60*h+m);
		//m_angle=(m/60.0)*360.0;
		m_angle = 6*m;
		if(h_angle>m_angle)
			result=h_angle-m_angle;
		else
			result=m_angle-h_angle;
		if(result>180)
			System.out.println(360-result);
		else
			System.out.println(result);
	}
	
	public static void main(String[] args) {
		CalAngleInClock.exe(21, 30);

	}

}
