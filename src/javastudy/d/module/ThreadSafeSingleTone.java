package javastudy.d.module;

public class ThreadSafeSingleTone {
    private static ThreadSafeSingleTone instance;

    private ThreadSafeSingleTone() {
    }

    // synchronized 메서드
    /*
     * synchronized 키워드는 멀티 쓰레드 환경에서 두개 이상의 쓰레드가 하나의 변수에 동시에 접근을 할 때 Race
     * condition(경쟁상태)이 발생하지 않도록 한다.한마디로 쓰레드가 해당 메서드를 실행하는 동안 다른 쓰레드가 접근하지 못하도록
     * 잠금(lock)을 거는 것으로 보면 된다.아래 그림 처럼 thread-1이 메서드에 진입하는 순간 나머지 thread-2 ~ 4의 접근을
     * 제한하고, thread-1이 완료가 되면 다음 스레드를 접근시킨다.
     * 
     */
    public static synchronized ThreadSafeSingleTone getInstance() {
        if (instance == null) {
            instance = new ThreadSafeSingleTone();
        }
        return instance;
    }
}

/*
 * [Thread safe initialization]
 * 
 * synchronized 키워드를 통해 메서드에 쓰레드들을 하나하나씩 접근하게 하도록 설정한다. (동기화) 하지만 여러개의 모듈들이 매번
 * 객체를 가져올 때 synchronized 메서드를 매번 호출하여 동기화 처리 작업에 overhead가 발생해 성능 하락이 발생한다.
 * 
 * 출처: https://inpa.tistory.com/entry/GOF-싱글톤Singleton-패턴-꼼꼼하게-알아보자
 */
