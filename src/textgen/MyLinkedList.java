package textgen;

import java.util.AbstractList;


/** A class that implements a doubly linked list
 * 
 * @author UC San Diego Intermediate Programming MOOC team
 *
 * @param <E> The type of the elements stored in the list
 */
public class MyLinkedList<E> extends AbstractList<E> {

	//recursive call to LLNode
	LLNode<E> head;
	LLNode<E> tail;
	private LLNode<E> prevNode;
	int size;

	/** Create a new empty LinkedList */
	public MyLinkedList() {
		// TODO: Implement this method	
		//create head and tail nodes with no data so gave null as parameter
		head = new LLNode<E>(null);
		tail = new LLNode<E>(null);
		
		//assign head.next node as tail and tail.previous node as head
		head.next = tail;
		tail.prev = head;
		//initial head size is 0 and does not include the two sentinel nodes: head and tail
		size = 0;
	}
	
	@Override
	public String toString() {
		LLNode<E> node = head.next;
		E data = node.data;
		System.out.print("{");
	     for (int i = 0; i < size; i++) {
	    	 System.out.print(data);
	    	 if(i < size - 1) {System.out.print(", ");}
	    	 node = node.next;
	    	 data = node.data;
	     }
	     System.out.print("}\n");
	     return "";
	} 

	/**
	 * Appends an element to the end of the list
	 * @param element The element to add
	 */
	public boolean add(E element ) 
	{
		// TODO: Implement this method
		if(element == null) {
			throw new NullPointerException("Cannot add null element to list!");
		}
		LLNode<E> newNode = new LLNode<E>(element);
		//System.out.println(newNode.toString() + size());
		if (size == 0) {
			newNode.next = head.next;
			newNode.prev = tail.prev;
			head.next = newNode;
			tail.prev = newNode;
			size ++;
		}else {
			newNode.next = prevNode.next;
			newNode.prev = prevNode;
			prevNode.next.prev = newNode;
			prevNode.next = newNode;
			size ++;
		}
		
		prevNode = newNode;
				
		return true;
	}

	/** Get the element at position index 
	 * @throws IndexOutOfBoundsException if the index is out of bounds. */
	public E get(int index)
	{
		// TODO: Implement this method.
		if (index >= size || index < 0) {
			throw new IndexOutOfBoundsException("Index out of bounds");
		}
		LLNode<E> node = head.next;
		E data = node.data;
		for (int i = 0; i <= index; i++) {
			if (i == index) {
				return data;
			}
			else {
				node = node.next;
				data = node.data;
			}
		}
		return data;
	}

	/**
	 * Add an element to the list at the specified index
	 * @param The index where the element should be added
	 * @param element The element to add
	 */
	public void add(int index, E element ) 
	{
		if(element == null) {
			throw new NullPointerException("Cannot add null element to list!");
		}
		else if (index > size || index < 0) {
			throw new IndexOutOfBoundsException("Index is not within limits of list!");
		}
		else {
			LLNode<E> node = head;
			LLNode<E> newNode = new LLNode<E>(element);
			
			for(int i = 0; i <= index; i++) {
				if (index == i) {
					newNode.next = node.next;
					newNode.prev = node;
					newNode.next.prev = node;
					node.next = newNode;
					size ++;
				}
				node = node.next;
			}
		}
	}


	/** Return the size of the list */
	public int size() 
	{
		// TODO: Implement this method
		return size;
	}

	/** Remove a node at the specified index and return its data element.
	 * @param index The index of the element to remove
	 * @return The data element removed
	 * @throws IndexOutOfBoundsException If index is outside the bounds of the list
	 * 
	 */
	public E remove(int index) 
	{
		// TODO: Implement this method
		if (index >= size || index < 0) {
			throw new IndexOutOfBoundsException("Index out of bounds");
		}
		LLNode<E> node = head.next;

		for(int i = 0; i <= index; i++) {
			E nodedata = node.data;
			if (index == i) {
				node.prev.next = node.next;
				node.next.prev = node.prev;
				node.next = null;
				node.prev = null;
				size = size - 1;
				return nodedata;
			}
			node = node.next;
		}
		
		return null;
	}

	/**
	 * Set an index position in the list to a new element
	 * @param index The index of the element to change
	 * @param element The new element
	 * @return The element that was replaced
	 * @throws IndexOutOfBoundsException if the index is out of bounds.
	 */
	public E set(int index, E element) 
	{
		// TODO: Implement this method
		if (index >= size || index < 0) {
			throw new IndexOutOfBoundsException("Index out of bounds");
		}
		if(element == null) {
			throw new NullPointerException("Cannot add null element to list!");
		}
		
		E data = remove(index);
		add(index,element);
		
		
		return data;
	}   
}

//package level class
class LLNode<E> 
{
	LLNode<E> prev;
	LLNode<E> next;
	E data;

	// TODO: Add any other methods you think are useful here
	// E.g. you might want to add another constructor

	public LLNode(E e) 
	{
		this.data = e;
		this.prev = null;
		this.next = null;
		
	}

	@Override
	public String toString() {
		return "LLNode [prev=" + prev + ", next=" + next + ", data=" + data + "]";
	}
	
}
