package javastudy.g.module;

// reference url
// https://inpa.tistory.com/entry/JAVA-%E2%98%95-%EC%A0%9C%EB%84%A4%EB%A6%ADGenerics-%EA%B0%9C%EB%85%90-%EB%AC%B8%EB%B2%95-%EC%A0%95%EB%B3%B5%ED%95%98%EA%B8%B0#%EC%A0%9C%EB%84%A4%EB%A6%AD_%ED%81%B4%EB%9E%98%EC%8A%A4
public class GSample<T> {
    private T value; // 멤버 변수의 value의 타입은 T 이다.

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
