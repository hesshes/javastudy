package javastudy.e;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import javastudy.e.module.EBox;
import javastudy.e.module.EBoxType;
import javastudy.e.module.EICompare;
import javastudy.e.module.ESchool;
import javastudy.e.module.EStudent;

public class Eexecute {
    public static void main(String[] args) {
        // Java Generic
        // 클래스 내부에서 사용할 데이터 타입을 외부에서 지정하는 기법
        ArrayList<String> arrList = new ArrayList<String>();
        // ArrayList : 리스트 자료형
        // <String> : 내부에서 사용할 변수 타입 선언
        // list : 변수명
        // <> : 다이아몬드 연산자
        // <T> : 타입 매개변수 / 타입 변수 라고 부름

        // Generic 캐스팅 문제 예
        // 배열은 가능
        Object[] arr = new Integer[1];

        // Generic 은 불가능 error
        // List<Object> list2 = new ArrayList<Integer>();

        // Generic은 서브 타입 간에 형변환 불가능
        // 전달받은 타입으로만 서로 캐스팅이 가능

        // 인터페이스 타입 한정 사용 예
        // EStudent가 구현한 인터페이스가
        // ESchool에 제네릭으로 한정지어서 정의 했을 때
        ESchool<EStudent> a = new ESchool<EStudent>();
        // 사용 불가 예
        // ESchool<Test> a = new ESchool<Test>();

        // 다중 인터페이스 타입 한정 예
        // 다중 상속 한정 제한이므로 상속한 인터페이스 모두를
        // 구현한 클래스만이 타입 할당이 가능
        EBox<EBoxType> box = new EBox<EBoxType>();

        // 재귀적 타입 한정 예
        Collection<Integer> list = Arrays.asList(56, 34, 12, 31, 65, 77, 91, 88);
        System.out.println(EICompare.max(list));

        Collection<Number> list2 = Arrays.asList(56, 34, 12, 31, 65, 77, 91, 88);
        // System.out.println(EICompare.max(list2)); // error number 추상 메서드는 Comparable를
        // 구현하지 않았음

        // Generic 와일드 카드
        // <?> : Unbounded Wildcards ( 제한 없음 )
        // - 타입 파라미터를 대치하는 구체적인 타입으로 모든 클래스나 인터페이스 타입이 올 수 있음
        // <? extends 상위타입> : Upper Bounded Wildcards ( 상위 클래스 제한 )
        // - 타입 파라미터를 대치하는 구체적인 타입으로 상위 타입이나 상위 타입의 하위 타입만 올 수 있음
        // <? super 하위타입> : Lower Bounded Wildcards ( 하위 클래스 제한 )
        // - 타입 파라미터를 대치하는 구체적인 타입으로 하위 타입이나 하위 타입의 상위 타입만 올 수 있음
  
    }
}
