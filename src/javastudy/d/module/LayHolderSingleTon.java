package javastudy.d.module;

//06
public class LayHolderSingleTon {

    private LayHolderSingleTon() {
    }

    // static 내부 클래스를 이용
    // Holder로 만들어, 클래스가 메모리에 로드되지 않고 getInstance 메서드가 호출되어야 로드됨
    private static class LayHolderSingleToneHolder {
        private static final LayHolderSingleTon INSTANCE = new LayHolderSingleTon();
    }

    public static LayHolderSingleTon getInstance() {
        return LayHolderSingleToneHolder.INSTANCE;
    }
}

/*
 * [Bill Pugh Solution (LazyHolder)]
 * 
 * 권장되는 두가지 방법중 하나 멀티쓰레드 환경에서 안전하고 Lazy Loading(나중에 객체 생성) 도 가능한 완벽한 싱글톤 기법 클래스
 * 안에 내부 클래스(holder)를 두어 JVM의 클래스 로더 매커니즘과 클래스가 로드되는 시점을 이용한 방법 (스레드 세이프함)
 * static 메소드에서는 static 멤버만을 호출할 수 있기 때문에 내부 클래스를 static으로 설정이밖에도 내부 클래스의 치명적인
 * 문제점인 메모리 누수 문제를 해결하기 위하여 내부 클래스를 static으로 설정 다만 클라이언트가 임의로 싱글톤을 파괴할 수 있다는 단점을
 * 지님 (Reflection API, 직렬화/역직렬화를 통해)
 * 
 * 우선 내부클래스를 static으로 선언하였기 때문에, 싱글톤 클래스가 초기화되어도 SingleInstanceHolder 내부 클래스는
 * 메모리에 로드되지 않음 어떠한 모듈에서 getInstance() 메서드를 호출할 때, SingleInstanceHolder 내부 클래스의
 * static 멤버를 가져와 리턴하게 되는데, 이때 내부 클래스가 한번만 초기화되면서 싱글톤 객체를 최초로 생성 및 리턴하게 된다.
 * 마지막으로 final 로 지정함으로서 다시 값이 할당되지 않도록 방지한다.
 * 
 * 만일 위의 코드 흐름 패턴에 대해 전혀 감을 못잡는 것이라면, JVM의 Class Loader의 클래스 로딩 및 초기화 과정을 아직 잘
 * 모르는 것이다. 자바 코드를 실행하면 클래스가 어떠한 순서대로 로드되고 초기화 되는지, 그리고 내부 클래스를 쓰는데 왜 하필 static
 * 키워드를 붙인 내부 클래스여야 하는지, 그 원리에 대해서 깊이 알고 싶다면 다음 포스팅들을 참고하길 바란다.
 * 
 * 출처: https://inpa.tistory.com/entry/GOF- 싱글톤Singleton-패턴-꼼꼼하게-알아보자
 */