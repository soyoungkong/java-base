package style;

import java.io.Serializable;

/**
 * <싱글톤 3-3. 직렬화, 역직렬화 대응 >
 * 싱글턴 클래스를 Serializable(직렬화 가능) 클래스로 만들려면 implements Serializable을 추가하는 것으로 부족함. 
 *  cf) Serialize 직렬화 : JVM 힙 메모리에 있는 객체 데이터를 바이트 스트림 형태로 바꿔 외부 파일로 내보낼 수 있게 하는 기술
 *      Deserialize 역직렬화 : 외부 직렬화 데이터를 다시 자바 객체로 변환하는 것, 역직렬화 자체가 생성자 역할을 수행. 
 * - 싱글턴 특성을 유지하려면 모든 필드를 transient(serialize 과정에서 제외하고 싶을 때 선언)로 선언하고 readResolve 메서드를 추가한다. 
 * - 그렇지 않으면 deserialize 역직렬화 할 떄마다 새로운 객체가 생긴다. 
 */
public class Singleton03Serializable implements Serializable {
    public static final Singleton03Serializable INSTANCE = new Singleton03Serializable();
    transient String str = "";
    transient ArrayList list = new ArrayList(); // 모든 필드를 transient로 선언. 

    public static Singleton03Serializable getInstance(){
        return INSTANCE;
    }

    // 역직렬화 대응 : 싱글턴 상태를 유지하기 위해 readResolve를 구현 
    private Object readResolve(){
        return INSTANCE; // 역직렬화한 객체는 무시하고, 클래스 초기화 떄 만들어진 인스터스 반환 
                        // 동일 객체가 반환. 가짜 객체는 garbage collector에서 처리됨. 
    }
}
