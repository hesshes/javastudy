package javastudy.d.module;

public class EagerSingleTone {

    // �̱��� Ŭ���� ��ü�� ���� �ν��Ͻ� ����
    private static final EagerSingleTone INSTANCE = new EagerSingleTone();

    // �����ڸ� private�� ���� (�ܺο��� new ��� X)
    private EagerSingleTone() {
    }

    public static EagerSingleTone getInstance() {
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