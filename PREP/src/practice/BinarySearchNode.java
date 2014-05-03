package practice;

public class BinarySearchNode {
	private int value;
	private BinarySearchNode l;
	private BinarySearchNode r;
	public BinarySearchNode(int value){
		this.value=value;
		this.l=null;
		this.r=null;
	}
	public BinarySearchNode getLeft(){
		return this.l;
	}
	public BinarySearchNode getRight(){
		return this.r;
	}
	public int getValue(){
		return this.value;
	}
	public void setLeft(BinarySearchNode l){
		this.l=l;
	}
	public void setRight(BinarySearchNode r){
		this.r=r;
	}
}
