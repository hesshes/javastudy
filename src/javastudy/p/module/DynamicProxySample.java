package javastudy.p.module;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import javastudy.p.module.proxy.Animal;
import javastudy.p.module.proxy.Tiger;

public class DynamicProxySample {
    public static void main(String[] arguments) {

        // newProxyInstance() 메서드로 동적으로 프록시 객체를 생성할 수 있다.
        Animal tigerProxy = (Animal) Proxy.newProxyInstance(Animal.class.getClassLoader(), // 대상 객체의 인터페이스의 클래스로더
                new Class[] { Animal.class }, // 대상 객체의 인터페이스
                new InvocationHandler() { // 프록시 핸들러
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        Object target = new Tiger();

                        System.out.println("----eat 메서드 호출 전----");

                        Object result = method.invoke(target, args); // 타겟 메서드 호출

                        System.out.println("----eat 메서드 호출 후----");

                        return result;
                    }
                });

        tigerProxy.eat();
    }
}
