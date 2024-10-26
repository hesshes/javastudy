package javastudy.d.module;

//03
public class LazySingleTon {
    // 싱글톤 클래스 객체를 담을 인스턴스 변수
    private static LazySingleTon instance;

    // 생성자를 private로 선언 (외부에서 new 사용 X)
    private LazySingleTon() {
    }

    // 외부에서 정적 메서드를 호출하면 그제서야 초기화 진행 (lazy)
    public static LazySingleTon getInstance() {
        if (instance == null) {
            instance = new LazySingleTon(); // 오직 1개의 객체만 생성
        }
        return instance;
    }
}
/*
 * [Lazy initialization]
 * 
 * 객체 생성에 대한 관리를 내부적으로 처리 메서드를 호출했을 때 인스턴스 변수의 null 유무에 따라 초기화 하거나 있는 걸 반환하는 기법
 * 미사용 고정 메모리 차지의 한계점을 극복 그러나 쓰레드 세이프(Thread Safe) 하지 않는 치명적인 단점을 가지고 있음
 * 
 * 출처: https://inpa.tistory.com/entry/GOF -싱글톤Singleton-패턴-꼼꼼하게-알아보자
 */

/*
 * [멀티 쓰레드 환경에서의 치명적인 문제점]
 * 
 * 대부분의 자료에서 보통 위의 코드를 싱글톤 패턴 정석이라고 소개하지만, 사실 이는 치명적인 문제점을 가지고 있다. 자바는 멀티 쓰레드
 * 언어인데, 이 멀티 쓰레드 환경에서 쓰레드 세이프 하지 않다는 것이다. 각 스레드는 자신의 실행단위를 기억하면서 코드를 위에서 아래로
 * 읽어간다. 따라서 다음과 같은 동시성으로 인한 코드 실행 문제점이 발생 할 수 있게 된다.
 * 
 * 스레드 A, 스레드 B 가 존재한다고 가정한다. 스레드 A가 if문을 평가하고 인스턴스 생성 코드로 진입하였다. (아직 초기화 진행 X)
 * 그런데 그때 스레드 B가 if문을 평가한다. 아직 스레드 A가 인스턴스화 코드를 실행을 안시켰기 때문에 이 if문도 참이 되게 된다.
 * 그러면 결과적으로 스레드 A와 B가 인스턴스 초기화 코드를 두번 실행하는 꼴이 된다. (원자성이 결여) 출처:
 * https://inpa.tistory.com/entry/GOF--싱글톤Singleton-패턴-꼼꼼하게-알아보자
 */
