package style;

public class Autoboxing01 {
    // 속도가 느린 프로그램 
    // sum이 Long으로 선언되어서 i가 더해질 때마다 객체가 생긴다. 
    public static void main(String[] args){
        //	Long sum = 0L;
        long sum = 0L; 
        for (long i = 0; i< Integer.MAX_VALUE; i++){
            sum +=i;
        }
        System.out.println(sum);
    }
}
