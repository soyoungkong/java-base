package style;

/**
 * <싱글톤 3-4. 리플렉션 방어 
 * 원소가 하나 뿐인 enum 자료형을 정의 (public 방식과 동일)
 * - 간결, 직렬화가 자동으로 처리, refelction 공격에도 
 * cf) 리플렉션 : 객체를 통해 클래스 정보를 분석하여 런타임에 클래스동작을 조작하는 방법 (클래스 파일 위치, 이름만 알면 객체 생성)
 *               리플렉션을 통해 싱글톤 객체 생성 시, 다른 객체를 반환해 싱글톤이 한번 깨짐. 
 */
public enum Singleton04Enum {
    INSTANCE;

    private int value = 1; 
    public int getValue(){
        return value;
    }    
}
