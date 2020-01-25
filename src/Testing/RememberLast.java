package Testing;

//the T will stand in anywhere you want to use
//the passed in type
public class RememberLast<T> {
	private T lastElement;
	private int numElements;
	
	public RememberLast () {
		numElements = 0; 
		lastElement = null;
	}

	public T add (T element) throws NullPointerException {
		if(element == null) {
			throw new NullPointerException("RememberLast object cannot store null pointers.");
		}
		T prevLast = lastElement;
		lastElement = element;
		numElements++;
		return prevLast;
	}
}

////Somewhere else you can use the above as follows:

//RememberLast<Integer> rInt = new RememberLast<Integer>();
//RememberLast<String> rStr = new RememberLast<String>();
//
//rInt.add(3);
//rStr.add("happy");
