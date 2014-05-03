package practice;

public class ReverseLinkedListInRecursive {
	public static LinkedListNode ReverseWithRecursive(LinkedListNode node, LinkedListNode prev){
		LinkedListNode tmp;
		if(node.link==null){
			node.link=prev;
			return node;
		} else{
			tmp=ReverseWithRecursive(node.link,node);
			node.link=prev;
			return tmp;
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListNode head= new LinkedListNode(1);
		head.link=new LinkedListNode(2);
		head.link.link=new LinkedListNode(3);
		head.link.link.link=new LinkedListNode(4);
		head.link.link.link.link=new LinkedListNode(5);
		head=ReverseLinkedListInRecursive.ReverseWithRecursive(head, null);
		while(head!=null){
			System.out.println(head.info);
			head=head.link;
		}

	}

}
