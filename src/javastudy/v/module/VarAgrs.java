package javastudy.v.module;

public class VarAgrs {

    public static <T> T[] toArray(T... args) {
        return args;
    }

    public static <T> T[] pick(T a, T b, T c) {
        T[] arr = toArray(a, b, c);
        return arr;
    }
}

// 메서드 파라미터 부분에 '타입... 매개변수명' 으로 처리하면 사용이 가능
// 가변 인수는 전달 인자를 0개부터 n개까지 넣을 수 있음
// 파라미터로 넘겨지는 값들을 모아서 컴파일시 배열로 처리
// 주의할점은 인자들의 갯수에 제한이 없지만, 배열 자료형은 매개변수 타입으로
// 따라간다는 점

// 2.
//toArray() 메서드는 제네릭 타입으로 가변 인수 배열을 받고 이를 그대로 반환한다.
//이때 타입을 단언할 수 없기 때문에 모든 타입을 받을 수 있는 Object[] 타입 배열로 만들어 반환하게 되는데, 결국 메인 메서드에서 옳지 않은 다운캐스팅이 일어나서 ClassCastException 예외가 발생하게 된다
//출처: https://inpa.tistory.com/entry/JAVA -가변-인수Varargs-매개변수를-동적으로 [Inpa Dev]
