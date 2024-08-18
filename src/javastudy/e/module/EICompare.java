package javastudy.e.module;

import java.util.Collection;

// ����� Ÿ�� ����
// ������ Ÿ�� E�� ���� Ÿ������ ������ ����ü�� ���� - �ǹ����� �ַ� Comparable �������̽��� ���
// ��, �ڱ� �ڽŸ� �޴´ٴ� ǥ��

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
