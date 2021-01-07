package style;

/**
 * 럼복으로 어노테이션 달아서 쉽게 생성 가능 
 * - 객체가 변경 불가능 
 * - 모든 인자의 기본값이 한 곳에 모여있음. 
 * - 빌더에 정의한 설정 메소드는 빌더 객체 자신을 반환. 쭉 이어서 쓸 수 있다 
 *   예) A a = new A.builder(240, 8).sex(3).classes(4).expire(6).build();
 */
public class ManyVariables03BuilderPattern {
    private final int size; 
	private final int weight;
	private final int sex; 
 	private final int classes; 
    private final int expire; 

    private ManyVariables03BuilderPattern(Builder builder) {
        size = builder.size;
        weight = builder.weight;
        sex = builder.sex;
        classes = builder.classes;
        expire = builder.expire;
    }

    public static class Builder{
        //필수인자 : final 
        private final int size; 
        private final int weight;

        // 선택인자 : 기본값 지정 
        private int sex = 0; 
        private int classes = 0; 
        private int expire = 0; 

        public Builder(int size, int weight){
            this.size = size;
            this.weight = weight;
        }

        public Builder sex(int val){
            sex = val; 
            return this; 
        }

        public Builder classes(int val){
            classes = val; 
            return this; 
        }

        public Builder expire(int val){
            expire = val; 
            return this; 
        }

        public ManyVariables03BuilderPattern build(){
            return new ManyVariables03BuilderPattern(this);
        }
    }
    
}
