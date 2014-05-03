package practice;

import java.util.HashMap;

public class LinkedListCopy implements Cloneable {
	private int value;
	public LinkedListCopy next=null;
	public LinkedListCopy random=null;
	public LinkedListCopy(int value){
		this.value=value;
	}
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	public static LinkedListCopy Copy(LinkedListCopy llc) throws CloneNotSupportedException{
		LinkedListCopy output=(LinkedListCopy) llc.clone();
		LinkedListCopy old=llc;
		LinkedListCopy current=output;
		HashMap<LinkedListCopy, LinkedListCopy> map = new HashMap<LinkedListCopy, LinkedListCopy>();
		while(true){
			map.put(llc, current);
			llc=llc.next;
			if(llc==null)
				break;
			current.next=(LinkedListCopy) llc.clone();
			current=current.next;
		}
		while(old!=null){
			map.get(old).random=map.get(old.random);
			old=old.next;
		}
		return output;
	}
	
	public static void main(String[] args) throws CloneNotSupportedException {
		LinkedListCopy head = new LinkedListCopy(1);
		head.next = new LinkedListCopy(2);
		head.next.next = new LinkedListCopy(3);
		head.next.next.next = new LinkedListCopy(4);
		head.next.next.next.next = new LinkedListCopy(5);
		head.random=head.next.next;
		head.next.random=head.next.next.next;
		head.next.next.random=head.next.next.next.next;
		head.next.next.next.random=head;
		head.next.next.next.next.random=head.next;
		LinkedListCopy result= LinkedListCopy.Copy(head);
		while (result!=null){
			System.out.println(result.value+"->"+result.random.value);
			result=result.next;
		}
	}

}
