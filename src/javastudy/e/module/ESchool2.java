package javastudy.e.module;

// ���� �������̽�, �Ķ���� ����
public class ESchool2<T extends EIReadable & EICloseable, U extends EIAppendable & EICloseable & EIFlushable> {

    void func(T reader, U writer) {

    }

}
