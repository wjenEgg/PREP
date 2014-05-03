package practice;

public class ReverseLinkedListWithoutRecursive {
	public static LinkedListNode reverse(LinkedListNode head){
		LinkedListNode prev=null;
		LinkedListNode current = head;
		LinkedListNode tmp=null;
		while(current!=null){
			tmp=current.link;
			current.link=prev;
			prev=current;
			current=tmp;
		}
		return prev;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListNode head= new LinkedListNode(1);
		head.link=new LinkedListNode(2);
		head.link.link=new LinkedListNode(3);
		//head.link.link.link=new LinkedListNode(4);
		//head.link.link.link.link=new LinkedListNode(5);
		head=ReverseLinkedListWithoutRecursive.reverse(head);
		while(head!=null){
			System.out.println(head.info);
			head=head.link;
		}
	}

}
