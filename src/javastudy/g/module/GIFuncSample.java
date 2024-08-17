package javastudy.g.module;

// 제네릭 함수형 인터페이스
// 람다 표현식의 함수형 인터페이스로 제네릭 인터페이스가 많이 사용되는 곳

public interface GIFuncSample<T> {
    public T add(T x, T y);
}
