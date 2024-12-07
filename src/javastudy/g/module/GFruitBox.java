package javastudy.g.module;

// 제네릭 메서드
// 제네릭 타입의 파라미터를 받아와 사용하는 일반 메서드와 제네릭 메서드를 혼동하지 말자
// 제네릭 메서드는 직접 메서드에 <T>, 제네릭을 설정함으로써 동적으로 타입을 받아와 사용할 수 있는
// 독립적으로 운용 가능한 메서드라고 이해하면 됨
public class GFruitBox<T> {

    // 클래스의 타입 파라미터를 받아와 사용하는 일반 메서드
    public T addBox(T x, T y) {
        // .. body 생략
        return null;
    }

    // 독릭접으로 할당 운영되는 제네릭 메서드
    public static <T> T addBoxStatic(T x, T y) {
        // .. body 생략
        return null;
    }
    
    // 독릭접으로 운영되는 제네릭 메서드
    public <T, U> void printBox(T x, U y) {
        // 해당 매개변수의 타입 출력
        System.out.println(x.getClass().getSimpleName());
        System.out.println(y.getClass().getSimpleName());
    }
}
