package practice;

import java.util.Stack;

public class LinkedListLoop {
	public static boolean testLoop(LinkedListNode start){
		LinkedListNode fast=start;
		LinkedListNode slow=start;
		while(fast!=null){
			slow=slow.link;
			if((fast=fast.link)!=null)
				fast=fast.link;
			if(slow==fast)
				return true;
		}
		return false;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListNode head=null;
		LinkedListNode last=null;
		LinkedListNode loopnode;
		for (int i=0;i<6;i++){
			if(head==null){
				head=new LinkedListNode(i);;
				last=head;
			}
			else{
				last.link=new LinkedListNode(i);;
				last=last.link;
			}
		}
		loopnode=last;
		last.link=loopnode;
		System.out.println(LinkedListLoop.testLoop(head));
	}
}
