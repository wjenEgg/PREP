package practice;

public class ReverseStringRecursive {
	private static Character[] output;
	
	public static String exe(String input){
		String output="";
		if(input.length()>1){
			output=input.substring(0,1);
			output=exe(input.substring(1,input.length()))+output;
		}
		else
			output=input;
		return output;
	}
	public static void nonrecursive(String input){
		Character[] output = new Character[input.length()];
		for(int i=input.length()-1;i>=0;i--)
			output[input.length()-1-i]=input.charAt(i);
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<output.length;i++)
			sb.append(output[i]);
		System.out.print(sb.toString());
	}
	public static void nonrecursivebywords(String input){
		output = new Character[input.length()];
		int start=0;
		for(int i=input.length()-1;i>=0;i--)
			output[input.length()-1-i]=input.charAt(i);
		for(int i=0;i<output.length;i++)
			if(output[i]==' '){
				swap(start,i-1);
				start=i+1;
			}
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<output.length;i++)
			sb.append(output[i]);
		System.out.print(sb.toString());
	}
	private static void swap(int start, int end){
		char tmp;
		for(int i=start;i<=start+(end-start)/2;i++){
			tmp=output[i];
			output[i]=output[start+end-i];
			output[start+end-i]=tmp;
		}
	}
	public static void main(String[] args) {
		//System.out.println(ReverseStringRecursive.exe("boj eht teg lliw i"));
		ReverseStringRecursive.nonrecursive("i love you");
		System.out.println();
		ReverseStringRecursive.nonrecursivebywords("i love you so much but you hate me");
	}

}
