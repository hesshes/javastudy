package javastudy.p.module;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import javastudy.p.module.proxy.Animal;
import javastudy.p.module.proxy.Tiger;

public class DynamicProxySample {
    public static void main(String[] arguments) {

        // newProxyInstance() �޼���� �������� ���Ͻ� ��ü�� ������ �� �ִ�.
        Animal tigerProxy = (Animal) Proxy.newProxyInstance(Animal.class.getClassLoader(), // ��� ��ü�� �������̽��� Ŭ�����δ�
                new Class[] { Animal.class }, // ��� ��ü�� �������̽�
                new InvocationHandler() { // ���Ͻ� �ڵ鷯
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        Object target = new Tiger();

                        System.out.println("----eat �޼��� ȣ�� ��----");

                        Object result = method.invoke(target, args); // Ÿ�� �޼��� ȣ��

                        System.out.println("----eat �޼��� ȣ�� ��----");

                        return result;
                    }
                });

        tigerProxy.eat();
    }
}
