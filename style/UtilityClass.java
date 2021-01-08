package style;

/**
 *  - 객체를 만들 목적의 클래스가 아닌 경우,
    - private 생성자를 사용. (abstract는 소용x). 객체 생성을 방지   
    - 어떤 경우에도 객체를 만들 수 없다.
    - 하위 클래스도 만들 수 없다 (호출 가능한 생성자가 없음)
 */
public class UtilityClass{
	private UtilityClass(){
		throw new AssertionError(); // 실수로 생성 시 바로 알 수 있음. 
	}
	// ... 
}