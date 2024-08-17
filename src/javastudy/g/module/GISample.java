package javastudy.g.module;

// 인터페이스에도 제네릭을 적용할 수 있음
// 단 인터페이스를 구현하는 클래스에서도 오버라이딩한 메서드를 제네릭 타입에 맞춰서
// 똑같이 구현해 주어야 함
public interface GISample<T> {
    public void addElement(T t, int index);

    public T getElement(int index);

}
