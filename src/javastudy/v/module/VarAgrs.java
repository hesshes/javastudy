package javastudy.v.module;

public class VarAgrs {

    public static <T> T[] toArray(T... args) {
        return args;
    }

    public static <T> T[] pick(T a, T b, T c) {
        T[] arr = toArray(a, b, c);
        return arr;
    }
}

// �޼��� �Ķ���� �κп� 'Ÿ��... �Ű�������' ���� ó���ϸ� ����� ����
// ���� �μ��� ���� ���ڸ� 0������ n������ ���� �� ����
// �Ķ���ͷ� �Ѱ����� ������ ��Ƽ� �����Ͻ� �迭�� ó��
// ���������� ���ڵ��� ������ ������ ������, �迭 �ڷ����� �Ű����� Ÿ������
// ���󰣴ٴ� ��

// 2.
//toArray() �޼���� ���׸� Ÿ������ ���� �μ� �迭�� �ް� �̸� �״�� ��ȯ�Ѵ�.
//�̶� Ÿ���� �ܾ��� �� ���� ������ ��� Ÿ���� ���� �� �ִ� Object[] Ÿ�� �迭�� ����� ��ȯ�ϰ� �Ǵµ�, �ᱹ ���� �޼��忡�� ���� ���� �ٿ�ĳ������ �Ͼ�� ClassCastException ���ܰ� �߻��ϰ� �ȴ�
//��ó: https://inpa.tistory.com/entry/JAVA -����-�μ�Varargs-�Ű�������-�������� [Inpa Dev]
