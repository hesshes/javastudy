package javastudy.e.module;

import java.util.Collection;

// 재귀적 타입 한정
// 선언한 타입 E를 서브 타입으로 구현한 구현체로 한정 - 실무에선 주로 Comparable 인터페이스와 사용
// 즉, 자기 자신만 받는다는 표현

public class EICompare {

    public static <E extends Comparable<E>> E max(Collection<E> collection) {
        if (collection.isEmpty())
            throw new IllegalArgumentException("collection is null");

        E result = null;
        for (E e : collection) {
            if (result == null) {
                result = e;
                continue;
            }

            if (e.compareTo(result) > 0) {
                result = e;
            }
        }

        return result;
    }
}
