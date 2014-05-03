package practice;

public class StringReverser {
	private String target="";
	public StringReverser(String target){
		this.target=target;
		for (int i=target.length()-1;i>=0;i--)
			System.out.print(this.target.charAt(i));
	}
	public static void main(String args[]){
		StringReverser sr= new StringReverser("I love you!!");
	}
}
