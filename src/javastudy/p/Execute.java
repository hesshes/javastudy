package javastudy.p;

import javastudy.p.module.PolymorphismChildren;
import javastudy.p.module.PolymorphismParent;

public class Execute {
    public static void main(String[] args) {
          
        PolymorphismParent tv = new PolymorphismChildren();
        tv.powerOn_Off();
        tv.channelOn_Off();
        
        PolymorphismChildren tv = new PolymorphismParent(); // 컴파일 에러
        
        /*
         * 다형성 관련 문제
         * 자식 클래스의 인스턴스를 생성하여 부모 클래스의 객체(메모리공간)로 대입(참조)하는 것은 가능하나
         * 부모 클래스의 인스턴스를 생성하여 자식 클래스의 객체(메모리공간)로 대입(참조)하는 것은 불가능
         * 
         * [이후 다시 정리해야 함]
         * C/C++의 내용으로 보면 각 클래스의 힙 메모리 공간 할당시 
         * 정의된 클래스대로 메모리 할당을 하게 되는데 
         * 1. 부모 클래스의 메모리 공간이 인스턴스로 생성된 자식 클래스의 객체의 메모리를 담을 수 없음
         * 2. 자식 클래스의 메모리 공간은 인스턴스로 생성된 부모 클래스의 객체의 메모리를 담을 수 있음
         * 따라서, 1의 경우는 다운 캐스팅을 해줘야 함
         * 
         * */

    }

}
