package Testing;

class SLLNode<E> {

	  SLLNode<E> next;
	  E data;

	  public SLLNode() {
	    this.next = null;
	    this.data = null;
	  }

	  public SLLNode(E theData) {
	    this.data = theData;
	  }

	  public SLLNode(E theData,
	                 SLLNode<E> prevNode) {
	    this(theData);
	    this.next = prevNode.next;
	    prevNode.next = this;
	  }

	  public static void main(String[] args)
	  {
	    SLLNode<Integer> n0 = new SLLNode<Integer>();
	    SLLNode<Integer> n1= new SLLNode(1,n0);
	    SLLNode<Integer> n2 = new SLLNode(2,n0);
	  }
	}

/* n0 sets next to null and data to null because the object was 
 * started with no parameters. the constructor with no parameters
 * on line 8 sets both next and data to null:
 * 
 * n0 = Null ---> Null
 * 
 * when n1 gets created it passes 1 and n0 as params. the constructor
 * on line 17 gets called and uses 1 as the data that then gets passed
 * on to this(theData) which is a call to the constructor on line 13
 * it then sets the next object for n1 as the n0's next object (null) and sets
 * n0's new next object as n1 or 1:
 * 
 * n0 = Null --> n1 = 1 ---> Null
 * 
 * when n2 gets created it passes 2 and n0 as params. the constructor 
 * on line 17 gets called an uses 2 as the data that then gets passed
 * on to this(theData) which is a call to the constructor on line 13
 * it then sets the next object for n2 as the n0's next object (n1) and sets 
 * n0's new next object as n2 or 2:
 * 
 * n0 = Null --> n2 = 2 ---> n1 = 1 ---> Null
 * 
 * 
 * WHAT HAPPENS IF WE SWITCH ORDER OF 
 * 	    this.next = prevNode.next;
 * 		prevNode.next = this;
 * TO:
 * 		prevNode.next = this;
 * 		this.next = prevNode.next;
 * IN THE CONSTRUCTOR ON LINE 17?
 * 
 * BECAUSE prevNode.next gets changed first to the value of this
 * that means that this.next will point at the object being constructed
 * so n0 points to n2 and n2 points to itself. n1 ends up being unlinked
 * and points next to itself:
 * 
 * n0 = Null --> n2 = 2 --> n2  
 * n1 = 1 ---> n1
 *
 */
