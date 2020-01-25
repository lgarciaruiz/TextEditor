package Testing;

public class mylinkedlist<E> {
	private ListNode<E> head;
	private ListNode<E> tail;
	private int size;
	
	public mylinkedlist() {
		size = 0;
		head = new ListNode<E>(null);
		tail = new ListNode<E>(null);
		//this links the head and tail
		head.next = tail;
		tail.prev = head;
	}

}