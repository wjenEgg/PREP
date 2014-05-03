package practice;


public class Parlidorm {
	public static int exe(String input, int start, int end, int length){
		if(start==end){
			if(length==0)
				return 0;
			else
				return length+1;
		}
		else if(end<start)
			return length;
		if(input.charAt(start)==input.charAt(end))
			return exe(input, start+1,end-1,length+2);
		else
			return Math.max(exe(input, start,end-1,0), exe(input, start+1,end,0));
	}
	public static void main(String[] args) {
		String input="qmamfemamdfes";
		System.out.println(Parlidorm.exe(input,0, input.length()-1, 0));
	}

}
