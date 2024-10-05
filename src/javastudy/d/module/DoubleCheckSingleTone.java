package javastudy.d.module;

public class DoubleCheckSingleTone {
    private static volatile DoubleCheckSingleTone instance; // volatile 키워드 적용

    private DoubleCheckSingleTone() {
    }

    public static DoubleCheckSingleTone getInstance() {
        if (instance == null) {
            // 메서드에 동기화 거는게 아닌, Singleton 클래스 자체를 동기화 걸어버림
            synchronized (DoubleCheckSingleTone.class) {
                if (instance == null) {
                    instance = new DoubleCheckSingleTone(); // 최초 초기화만 동기화 작업이 일어나서 리소스 낭비를 최소화
                }
            }
        }
        return instance; // 최초 초기화가 되면 앞으로 생성된 인스턴스만 반환
    }
}
/*
 * [Double-Checked Locking]
 * 
 * 매번 synchronized 동기화를 실행하는 것이 문제라면, 최초 초기화할때만 적용하고 이미 만들어진 인스턴스를 반환할때는 사용하지
 * 않도록 하는 기법 이때 인스턴스 필드에 volatile 키워드를 붙여주어야 I/O 불일치 문제를 해결 할 수 있다. 그러나 volatile
 * 키워드를 이용하기위해선 JVM 1.5이상이어야 되고, JVM에 대한 심층적인 이해가 필요하여, JVM에 따라서 여전히 쓰레드 세이프 하지
 * 않는 경우가 발생하기 때문에 사용하기를 지양하는 편이다.
 * 
 * 출처: https://inpa.tistory.com/entry/GOF 싱글톤Singleton-패턴-꼼꼼하게-알아보자
 */

/*
 * [ volatile 키워드 ]
 * 
 * Java에서는 쓰레드를 여러개 사용할경우, 성능을 위해서 각각의 쓰레드들은 변수를 메인 메모리(RAM)으로부터 가져오는 것이 아니라
 * 캐시(Cache) 메모리에서 가져오게 된다.문제는 비동기로 변수값을 캐시에 저장하다가, 각 쓰레드마다 할당되어있는 캐시 메모리의 변수값이
 * 일치하지 않을수 있다는 점이다.그래서 volatile 키워드를 통해 이 변수는 캐시에서 읽지 말고 메인 메모리에서 읽어오도록 지정해주는
 * 것이다.
 */