package practice;

public class ReversePrintInLinkedList {
	private Node first=null;
	private Node last=null;
	private Node newNode;
	public ReversePrintInLinkedList(){
		for(int i=0;i<10;i++){
			newNode=new Node(i);
			if(first == null){
				first=newNode;
				last=newNode;
			} else{
				last.link=newNode;
				last=last.link;
			}
		}
	}
	private class Node{
		public int info;
		public Node link;
		public Node(int info){
			this.info=info;
		}
	}
	public static void ReversePrint(Node current){
		if(current != null){
			ReversePrint(current.link);
			System.out.println(current.info);
		}
	}
	public static void main(String args[]){
		ReversePrintInLinkedList test = new ReversePrintInLinkedList();
		ReversePrintInLinkedList.ReversePrint(test.first);
	}
}
