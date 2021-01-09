package style;

public class immutable01Object {
    // String s = new String("Stringtest") // "Stringtest 자체로 스트링 객체
    String s = "Stringtest"; // recommend 

    // Boolena(s) // 비추천. 생성자는 호출할 때마다 새 객체를 만듦 
    Boolean a = Boolean.valueOf(s); // recommend,  static factory method 정적 팩토리 메소드 
}
