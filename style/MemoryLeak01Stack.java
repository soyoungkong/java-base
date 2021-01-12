import java.util.Arrays;
import java.util.EmptyStackException;

public class MemoryLeak01Stack {
	private Object[] elements;
	private int size = 0;
	private static final int DEFAULT_INITIAL_CAPACITY = 16; 
	
	public MemoryLeak01Stack(){
		elements = new Object[DEFAULT_INITIAL_CAPACITY];
	}
    
    public void push(Object e){
		ensureCapacity();
		elements[size++] = e;
	} 

	public Object pop(){
		if (size==0)
			throw new EmptyStackException();

		return elements[--size];
	}

	// 배열의 길이를 늘려야하면 2배씩 늘인다. 
	private void ensureCapacity(){
		if(elements.length == size){
			elements = Arrays.copyOf(elements, 2*size+1);
		}
	}
}