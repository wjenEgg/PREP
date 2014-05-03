package practice;

public class URLTranser {

	public static String exe(String test){
		String output="";
		for(int i=0;i<test.length();i++)
			if(test.charAt(i)=='%'){
				output+=(char)(Integer.parseInt(String.valueOf(test.charAt(i+1)),16)*16 + Integer.parseInt(String.valueOf(test.charAt(i+2)),16));
				i+=2;
			}else
				output+=test.charAt(i);
		return output;
	}
	public static void main(String[] args) {
		System.out.println(URLTranser.exe("http://www.abc.com/%3A%20%3Fdefcfea"));
	}

}
