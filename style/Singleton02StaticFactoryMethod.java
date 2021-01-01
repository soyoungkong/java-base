package style;

/**
 * <싱글톤 3-2. static Factory Method>
 *  private으로 싱글턴 선언 후, getInstance(static Factory Method, 정적 팩토리 메소드)로 반환하면 항상 같은 객체를 참조. 
 */
public class Singleton02StaticFactoryMethod {
    private static final Singleton02StaticFactoryMethod INSTANCE = new Singleton02StaticFactoryMethod();
    public static Singleton02StaticFactoryMethod getInstance(){return INSTANCE;}
    /* 
    장점 1. 최신 JVM은 정적 패고리 메소드 호출을 항상 inline으로 처리함.  (성능이 좋다)
      cf) 인라인 : 메소드 호출 시 해당 메서드의 코드를 호출 부분에 직접 삽입하여 실행속도를 높이는 최적화 기법 (컴파일러 최적화) 
          일반적으로 메소드 호출 시, 호출 스택에 메서드 정보를 저장하고 호출 종료 시 스택에서 제거 
          스택 접근으로 인한 성능 저하가 발생. 메서드가 다수 분리되면 성능 저하가 더 많아짐. 
          jVM이 기계적으로 인라인으로 만들어서 성능을 최적화 시킴. 

    장점 2. API를 변경하지 않고도 싱글턴 패턴을 포기할 수 있음. 
     - 스레드마다 별도의 객체를 반환하도록 팩터리 메소드를 수정 (제네릭 타입을 숭용하기 쉽다) 
    */ 
}
