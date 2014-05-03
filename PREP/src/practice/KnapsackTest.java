//import java.io.*;
package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class KnapsackTest {

	static int[] arr;
	static int k=0;
	static int[] need;
	static boolean flag;
	static int size;

	public static void main(String[] args) throws IOException  {
		System.out.println("Enter values (q for quit):");
		KnapsackTest.getValue();
		WKx(20);
		/*int i=0;
		while(i<arr.length){
		System.out.print(arr[i]+" ");}
		System.out.println("");
		size=arr.length;
		flag=true;
		Kx(arr[k], 20, 0);
		int j=0;
		while(j<size){
			System.out.print(need[j]+" ");	
		}*/
		
		
	}
	public static void WKx(int weight){
		int sum = 0;
		for (int i = 0; i < arr.length; i++)
			sum += arr[i];
		if (sum < weight)
			System.out.println("Put everything into the pack");
		else{
			Quicksort q = new Quicksort();
			int i = arr.length - 1;
			q.sort(arr);
			arr = q.getResult();
			while(sum > weight){
				sum -= arr[i];
				i--;
			}
			System.out.println("Put " + (i + 1) + " items into the pack, total weight: " + sum);
			for (int j = 0; j <= i; j++)
				System.out.println(arr[j]);
		}
	}
	/*public static void Kx(int a, int weight, int m){
		int j=0;
		if(flag&& weight==0){
			need[j++]=a; return;
		}
		else if(k+m==size){
			flag=false;
			m=0;
		  Kx(arr[k+1],weight+arr[k],m);
		}
		else if(arr[k+m]>weight){
			m++;
			flag=false;
		 Kx(arr[k+m],weight,m);
		}
		else Kx(arr[++k],weight-arr[k-1],0);
	}*/

	public static void getValue() throws IOException{
		ArrayList<Integer> tmp = new ArrayList<Integer>();
		Pattern pattern = Pattern.compile("\\d+");
		Matcher matcher;
		InputStreamReader isr= new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String input = br.readLine();
		while(!input.equals("q")){
			matcher = pattern.matcher(input);
			if (matcher.matches())
				tmp.add(Integer.parseInt(input));
			input = br.readLine();
		}
		arr = new int[tmp.size()];
		for (int i = 0; i < tmp.size(); i++){
			arr[i] = tmp.get(i);
			System.out.println(arr[i]);
		}
	}
}
