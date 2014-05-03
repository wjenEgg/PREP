package practice;

import java.lang.reflect.Constructor;

public class EqualUtil {
	public static boolean equals(Object a, Object b) throws NoSuchMethodException, SecurityException{
		@SuppressWarnings("rawtypes")
		Class classa = a.getClass();
		@SuppressWarnings("rawtypes")
		Class classb = b.getClass();
		@SuppressWarnings("rawtypes")
		Constructor[] ctora = classa.getConstructors();
		@SuppressWarnings("rawtypes")
		Constructor[] ctorb = classb.getConstructors();
		if (ctora.length < 1 || ctorb.length < 1) {
			return false;
		}
		if (!ctora[0].toString().equals(ctorb[0].toString())){
			return false;
		}
		if (ctora[0].toString().contains("Integer")){
			return equals((Integer)a, (Integer)b);
		} else if (ctora[0].toString().contains("Float")) {
			return equals((Float) a, (Float) b);
		} else if (ctora[0].toString().contains("Double")) {
			return equals((Double) a, (Double) b);
		} else if (ctora[0].toString().contains("Long")) {
			return equals((Long) a, (Long) b);
		} else if (ctora[0].toString().contains("String")) {
			return equals((String) a, (String) b);
		} else {
			return false;
		}
	}
	
	private static boolean equals(Integer a, Integer b) {
		return a.equals(b);
	}
	
	private static boolean equals(Float a, Float b) {
		return a.equals(b);
	}
	
	private static boolean equals(Double a, Double b) {
		return a.equals(b);
	}
	
	private static boolean equals(Long a, Long b) {
		return a.equals(b);
	}
	
	private static boolean equals(String a, String b) {
		return a.equals(b);
	}

	/**
	 * @param args
	 * @throws SecurityException 
	 * @throws NoSuchMethodException 
	 */
	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		// TODO Auto-generated method stub
		Integer i1 = 3;
		Integer i2 = 5;
		Float f1 = 6f;
		Float f2 = 6f;
		String s1 = "abc";
		String s2 = "cba";
		Boolean b1 = true;
		Boolean b2 = true;
		System.out.println(EqualUtil.equals((Object)i1, (Object)i2));
		System.out.println(EqualUtil.equals((Object)f1, (Object)f2));
		System.out.println(EqualUtil.equals((Object)s1, (Object)i2));
		System.out.println(EqualUtil.equals((Object)b1, (Object)b2));
	}

}
