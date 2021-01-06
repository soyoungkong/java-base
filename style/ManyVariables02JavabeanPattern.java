package style;

/**
 * 
 *  ManyVariables02JavabeanPattern obj = new ManyVariables02JavabeanPattern();
    obj.setSize(1);
    obj.setWeight(1);
    obj.setSex(1);
    obj.setClasses(1);
    obj.setExpire(1);
 */
public class ManyVariables02JavabeanPattern {
    // 필드는 기본값으로 초기화 (기본값이 있는 경우), final x
    private int size = -1; 
    private int weight = -1; 
    private int sex = 0; 
    private int classes = 0; 
    private int expire =0; 

	// 인자가 없는 생성자 호출 
	public ManyVariables02JavabeanPattern(){}

	// setter 
	public void setSize(int val) {size = val;};
	public void setWeight(int val) {weight= val;};
	public void setSex(int val) {sex = val;};
	public void setClasses(int val) {classes = val;};
	public void setExpire(int val) {expire = val;};
}
