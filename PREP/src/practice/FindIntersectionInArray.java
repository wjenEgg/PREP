package practice;

public class FindIntersectionInArray {

	public static void exe(int[] a1, int[] a2){
		int i=0;
		int j=0;
		for (i=0;i<a1.length;i++){
			for (j=0;j<a2.length;j++)
				if(a1[i]==a2[j])
					break;
			if(j!=a2.length)
				break;
		}
		while(i<a1.length && j<a2.length && a1[i]==a2[j]){
			System.out.println(a1[i]);
			i++;
			j++;
		}
	}
	public static void main(String[] args) {
		int[] a1={4,9,3,2,8,10,7,0};
		int[] a2={87,38,84,93,2,8,10,7};
		FindIntersectionInArray.exe(a1, a2);

	}

}
