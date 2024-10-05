package javastudy.d.module;

public class BlockSingleTone {
    // 싱글톤 클래스 객체를 담을 인스턴스 변수
    private static BlockSingleTone instance;

    // 생성자를 private로 선언 (외부에서 new 사용 X)
    private BlockSingleTone() {
    }

    // static 블록을 이용해 예외 처리
    // static block : 클래스가 로딩되고 클래스 변수가 준비된 후 자동으로 실행되는 블록
    static {
        try {
            instance = new BlockSingleTone();
        } catch (Exception e) {
            throw new RuntimeException("싱글톤 객체 생성 오류");
        }
    }

    public static BlockSingleTone getInstance() {
        return instance;
    }
}

/*
 * [Static block initialization]
 * 
 * Eager Initialization의 단점인 예외처리 할 수 없음을 보완. static block 을 이용해 예외를 잡을 수 있음 그러나
 * 여전히 static 의 특성으로 사용하지도 않는데도 공간을 차지함
 * 
 * 출처: https://inpa.tistory.com/entry/GOF- 싱글톤Singleton-패턴-꼼꼼하게-알아보자
 */
