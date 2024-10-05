package javastudy.d.module;

// 01 
public class EagerSingleTon {

    // �̱��� Ŭ���� ��ü�� ���� �ν��Ͻ� ����
    private static final EagerSingleTon INSTANCE = new EagerSingleTon();

    // �����ڸ� private�� ���� (�ܺο��� new ��� X)
    private EagerSingleTon() {
    }

    public static EagerSingleTon getInstance() {
        return INSTANCE;
    }
}

/*
 * [Eager Initialization]
 * 
 * �ѹ��� �̸� �����δ�, ���� �������̸鼭�� ������ ��� static final �̶� ��Ƽ ������ ȯ�濡���� ������ �׷��� static
 * ����� ���� ��ü�� ������� �ʴ��� �޸𸮿� �����ϱ� ������ ���� ���ҽ��� ū ��ü�� ���, ���� �ڿ� ���� �߻��� ���� ó���� �� ��
 * ����.
 * 
 * ��ó: https://inpa.tistory.com/entry/GOF -�̱���Singleton-����-�Ĳ��ϰ�-�˾ƺ���
 */