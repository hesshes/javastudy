package javastudy.g.module;

// Generic 클래스 범위 한정자 사용
// 타입이 너무 자유로워 생기는 문제를 방지하고자
// 타입의 범위를 한정
public class GCalc<T extends Number> {
    
    void add(T a, T b) {}
    void min(T a, T b) {}
    void mul(T a, T b) {}
    void div(T a, T b) {}

}
