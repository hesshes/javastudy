package javastudy.d.module;

public class ThreadSafeSingleTone {
    private static ThreadSafeSingleTone instance;

    private ThreadSafeSingleTone() {
    }

    // synchronized �޼���
    /*
     * synchronized Ű����� ��Ƽ ������ ȯ�濡�� �ΰ� �̻��� �����尡 �ϳ��� ������ ���ÿ� ������ �� �� Race
     * condition(�������)�� �߻����� �ʵ��� �Ѵ�.�Ѹ���� �����尡 �ش� �޼��带 �����ϴ� ���� �ٸ� �����尡 �������� ���ϵ���
     * ���(lock)�� �Ŵ� ������ ���� �ȴ�.�Ʒ� �׸� ó�� thread-1�� �޼��忡 �����ϴ� ���� ������ thread-2 ~ 4�� ������
     * �����ϰ�, thread-1�� �Ϸᰡ �Ǹ� ���� �����带 ���ٽ�Ų��.
     * 
     */
    public static synchronized ThreadSafeSingleTone getInstance() {
        if (instance == null) {
            instance = new ThreadSafeSingleTone();
        }
        return instance;
    }
}

/*
 * [Thread safe initialization]
 * 
 * synchronized Ű���带 ���� �޼��忡 ��������� �ϳ��ϳ��� �����ϰ� �ϵ��� �����Ѵ�. (����ȭ) ������ �������� ������ �Ź�
 * ��ü�� ������ �� synchronized �޼��带 �Ź� ȣ���Ͽ� ����ȭ ó�� �۾��� overhead�� �߻��� ���� �϶��� �߻��Ѵ�.
 * 
 * ��ó: https://inpa.tistory.com/entry/GOF-�̱���Singleton-����-�Ĳ��ϰ�-�˾ƺ���
 */
