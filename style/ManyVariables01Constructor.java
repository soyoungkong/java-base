package style;

// 생성자로 초기화할 경우 필드는 final 
public class ManyVariables01Constructor {
    private final int size; 
	private final int weight;
	private final int sex; 
 	private final int classes; 
    private final int expire; 

	public ManyVariables01Constructor(int size){
		this(size, 0); 
  }

	public ManyVariables01Constructor(int size, int weight){
		this(size, weight, 0); 
  }

	public ManyVariables01Constructor(int size, int weight, int sex){
		this(size, weight, sex, 0); 
  }

	public ManyVariables01Constructor(int size, int weight, int sex, int classes){
		this(size, weight, sex, classes, 0); 
  }

	public ManyVariables01Constructor(int size, int weight, int sex, int classes, int expire){
	    this.size = size;
		this.weight = weight; 
		this.sex = sex;
		this.classes= classes;
		this.expire= expire;
  }
}