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
		
		// 추가 코드 
		Object results = elements[--size];
		elements[size] = null; // 만기 참조 제거, 만기참조를 null로 만들면 Nullpointexception이 발생해서 오동작 대신 종료됨.  		
		// 추가 코드 

		return elements[--size];
	}

	// 배열의 길이를 늘려야하면 2배씩 늘인다. 
	private void ensureCapacity(){
		if(elements.length == size){
			elements = Arrays.copyOf(elements, 2*size+1);
		}
	}
}