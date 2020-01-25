package Testing;

class ListNode<E> {
	
	//this is a recursive data type (definition)
	//this is OK!!!
	ListNode<E> next; // this is set to null by constructor by default
	ListNode<E> prev; // this is set to null by constructor by default
	E data;
	
	public ListNode(E theData) {
		this.data = theData;
	}

}
