package style;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 
 */
public class ServiceInterfaceExample {

    // 1. 서비스 인터페이스 
    public interface Service{
        // 서비스에서 고유한 메서드들 구현
    }

    // 2. 서비스 제공자 인터페이스 
    public interface Provider{
        Service newService();
    }

    // 3. 서비스 등록과 접근에 사용되는 객체 생성 불가능 클래스 
    public static class Services{
        private Services(){}    // 객체 생성 방지 

        // 서비스 이름과 서비스 간 대응관계 보관 
        private static final Map<String, Provider> providers = new ConcurrentHashMap<String, Provider>();
        public static final String DEFULT_PROVIDER_NAME = "<def>";

        // 제공자 등록 API 
        public static void registrerDefaultProvider(Provider provider){
            registerProvider(DEFULT_PROVIDER_NAME, provider);
        }

        public static void registerProvider(String name, Provider provider){
            providers.put(name, provider);
        }

        // 서비스 접근 API 
        public static Service newInstance(){
            return newInstance(DEFULT_PROVIDER_NAME);
        }

        public static Service newInstance(String name){
            Provider provider = providers.get(name);
            if (provider==null) 
                throw new IllegalArgumentException("No provider registred with name: " + name); 
            return provider.newService();
        };
        
    }
}
