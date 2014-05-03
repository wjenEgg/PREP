package practice;

import java.io.BufferedReader;
import java.io.FileReader;

public class BuildTreeByFile {
	public static BinarySearchNode root=null;
	public static void exe() throws Exception{
		FileReader fr = new FileReader("data\\treenode.txt");
		BufferedReader br = new BufferedReader(fr);
		String str;
		while((str=br.readLine())!=null){
			if(str.equals("Null"))
				insert(null);
			else
				insert(new BinarySearchNode(Integer.parseInt(str)));
		}
	}
	public static void insert(BinarySearchNode node){
		if(root==null)
			root=node;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
