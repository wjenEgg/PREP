package practice;

import java.util.HashMap;

public class SpiralPrintInMatrix {

	public static void exe(int[][] target, int x, int y){
		int range=0;
		while(x+range<target.length || y+range<target[0].length || x-range>-1 || y-range>-1){
			for(int i=-range;i<=range;i++){
				if(i+x>-1 && i+x<target.length)
					for(int j=-range;j<=range;j++)
						if(j+y>-1 && j+y<target[0].length && (i==-range || i==range || j==-range || j==range))
							System.out.println(target[x+i][y+j]);
			}
			range++;
		}
	}
	public static void main(String[] args) {
		int[][] target= new int[3][3];
		for (int i=0;i<target.length;i++)
			for (int j=0;j<target[0].length;j++){
				target[i][j]=i*target[0].length+j;
				//System.out.println(target[i][j]);
			}
		SpiralPrintInMatrix.exe(target, 2, 2);
	}

}
