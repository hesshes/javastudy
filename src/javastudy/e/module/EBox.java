package javastudy.e.module;

import java.util.ArrayList;
import java.util.List;

// 다중 상속 타입 제한
public class EBox<T extends EIReadable & EICloseable> {

    List<T> list = new ArrayList<T>();

    public void add(T item) {
        list.add(item);
    }
}
