package practice;

import java.util.Stack;

public class LinkedListNode {
	public int info;
	public LinkedListNode link;
	public LinkedListNode(int num){
		this.info=num;
	}
	public void Merge(LinkedListNode target){
		LinkedListNode tmp;
		if(this.link!=null){
			tmp=this.link;
			this.link=target;
			while(target.link!=null)
				target=target.link;
			target.link=tmp;
		} else
			this.link=target;
	}
	public static void main(String args[]){
		LinkedListNode head=null;
		LinkedListNode last=null;
		/*Stack<LinkedListNode> store = new Stack<LinkedListNode>(); //for reverse with stack
		LinkedListNode newnode;
		for (int i=0;i<6;i++){
			newnode=new LinkedListNode(i);
			if(head==null){
				head=newnode;
				last=newnode;
				store.push(last);
			}
			else{
				last.link=newnode;
				last=last.link;
				store.push(last);
			}
		}
		head=store.pop();
		last=head;
		while(!store.empty()){
			last.link=store.pop();
			last=last.link;
		}
		last.link=null;
		newnode=head;
		while(newnode!=null){
			System.out.println(newnode.info);
			newnode=newnode.link;
		}*/
		head=new LinkedListNode(1);
		head.link=new LinkedListNode(2);
		head.link.link=new LinkedListNode(3);
		head.link.link.link=new LinkedListNode(4);
		last=new LinkedListNode(5);
		last.link=new LinkedListNode(6);
		last.link.link=new LinkedListNode(7);
		head.link.link.link.Merge(last);
		while(head!=null){
			System.out.println(head.info);
			head=head.link;
		}
	}
}
