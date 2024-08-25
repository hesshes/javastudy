package javastudy.e.module;

// 다중 인터페이스, 파라미터 한정
public class ESchool2<T extends EIReadable & EICloseable, U extends EIAppendable & EICloseable & EIFlushable> {

    void func(T reader, U writer) {

    }

}
