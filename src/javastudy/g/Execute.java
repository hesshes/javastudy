package javastudy.g;

import javastudy.g.module.GCalc;
import javastudy.g.module.GFruitBox;
import javastudy.g.module.GFruitBox2;
import javastudy.g.module.GIFuncSample;
import javastudy.g.module.GISampleImpl;
import javastudy.g.module.GSample;

public class Execute {
    public static void main(String[] args) {
        // Generic 클래스 사용 예
        GSample<Integer> s1 = new GSample<Integer>();
        s1.setValue(1);

        GSample<Double> s2 = new GSample<Double>();
        s2.setValue(1.0);

        GSample<String> s3 = new GSample<String>();
        s3.setValue("문자열");

        // Generic 인터페이스 사용 예
        GISampleImpl<String> giSample = new GISampleImpl<String>();

        giSample.addElement("this is string", 5);
        giSample.getElement(5);

        // Generic 함수형 인터페이스 사용 예
        // Generic을 통해 함수의 타입을 결정
        GIFuncSample<Integer> n = (x, y) -> x + y;

        int result = n.add(10, 20);
        System.out.println(result);

        // Generic 메서드 호출 예제
        // 함수호출 시에 함수명 앞에 제네릭 타입이 위치
        GFruitBox.<Integer>addBoxStatic(1, 2);
        GFruitBox.<String>addBoxStatic("안녕", "잘가");

        // Generic 메서드 호출 예제2
        // 컴파일러가 제네릭 타입에 들어갈 데이터 타입을 메소드의 매개변수를 통해 추정할
        // 수 있기 때문에, 대부분의 경우 제네릭 메서드의 타입 파라미터를 생략하고 호출 가능
        GFruitBox.addBoxStatic(1, 2);
        GFruitBox.addBoxStatic("안녕", "잘가");

        // Generic 메서드 호출 예졔3
        // 인스턴스 생성시에 타입 파라미터를 지정
        GFruitBox2<Integer, Long> box1 = new GFruitBox2<Integer, Long>();
        box1.printBox(1, 1);

        // Generic 메서드에 다른 타입 파라미터를 지정하면 독릭접으로 운용됨
        box1.<String, Double>printBox("hello", 5.55);
        // 생략 가능한 경우
        box1.printBox("hello", 5.55); 
        
        // Generic 클래스 범위 한정 예
        GCalc<Number> cal1 = new GCalc<Number>();
        GCalc<Integer> cal2 = new GCalc<Integer>(); // 하위 가능
        GCalc<Double> cal3 = new GCalc<Double>();   // 하위 가능
        
        //GCalc<Number> cal1 = new GCalc<Number>();
        
    }

}
