package practice;

import java.util.Stack;

public class DeleteInLinkedList {
	
	/**
	 * @param args
	 */
	public static LinkedListNode reverse(LinkedListNode head){
		Stack<LinkedListNode> reverse = new Stack<LinkedListNode>();
		LinkedListNode last;
		while(head!=null){
			reverse.push(head);
			head=head.link;
		}
		head = reverse.pop();
		last = head;
		while(!reverse.empty()){
			last.link=reverse.pop();
			last=last.link;
		}
		last.link=null;
		return head;
	}
	
	public static void main(String[] args) {
		LinkedListNode head = new LinkedListNode(12);
		LinkedListNode newnode = new LinkedListNode(3);
		head.link=newnode;
		newnode= new LinkedListNode(8);
		head.link.link=newnode;
		newnode= new LinkedListNode(6);
		head.link.link.link=newnode;
		head=DeleteInLinkedList.reverse(head);
		LinkedListNode prev=head;
		LinkedListNode current=head.link;
		while(current!=null){
			if(prev.info>current.info)
				prev.link=current.link;
			else
				prev=prev.link;
			current=current.link;
		}
		head=DeleteInLinkedList.reverse(head);
		while(head!=null){
			System.out.println(head.info);
			head=head.link;
		}
	}
}
