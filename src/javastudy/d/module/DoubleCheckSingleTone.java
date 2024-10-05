package javastudy.d.module;

public class DoubleCheckSingleTone {
    private static volatile DoubleCheckSingleTone instance; // volatile Ű���� ����

    private DoubleCheckSingleTone() {
    }

    public static DoubleCheckSingleTone getInstance() {
        if (instance == null) {
            // �޼��忡 ����ȭ �Ŵ°� �ƴ�, Singleton Ŭ���� ��ü�� ����ȭ �ɾ����
            synchronized (DoubleCheckSingleTone.class) {
                if (instance == null) {
                    instance = new DoubleCheckSingleTone(); // ���� �ʱ�ȭ�� ����ȭ �۾��� �Ͼ�� ���ҽ� ���� �ּ�ȭ
                }
            }
        }
        return instance; // ���� �ʱ�ȭ�� �Ǹ� ������ ������ �ν��Ͻ��� ��ȯ
    }
}
/*
 * [Double-Checked Locking]
 * 
 * �Ź� synchronized ����ȭ�� �����ϴ� ���� �������, ���� �ʱ�ȭ�Ҷ��� �����ϰ� �̹� ������� �ν��Ͻ��� ��ȯ�Ҷ��� �������
 * �ʵ��� �ϴ� ��� �̶� �ν��Ͻ� �ʵ忡 volatile Ű���带 �ٿ��־�� I/O ����ġ ������ �ذ� �� �� �ִ�. �׷��� volatile
 * Ű���带 �̿��ϱ����ؼ� JVM 1.5�̻��̾�� �ǰ�, JVM�� ���� �������� ���ذ� �ʿ��Ͽ�, JVM�� ���� ������ ������ ������ ����
 * �ʴ� ��찡 �߻��ϱ� ������ ����ϱ⸦ �����ϴ� ���̴�.
 * 
 * ��ó: https://inpa.tistory.com/entry/GOF �̱���Singleton-����-�Ĳ��ϰ�-�˾ƺ���
 */

/*
 * [ volatile Ű���� ]
 * 
 * Java������ �����带 ������ ����Ұ��, ������ ���ؼ� ������ ��������� ������ ���� �޸�(RAM)���κ��� �������� ���� �ƴ϶�
 * ĳ��(Cache) �޸𸮿��� �������� �ȴ�.������ �񵿱�� �������� ĳ�ÿ� �����ϴٰ�, �� �����帶�� �Ҵ�Ǿ��ִ� ĳ�� �޸��� ��������
 * ��ġ���� ������ �ִٴ� ���̴�.�׷��� volatile Ű���带 ���� �� ������ ĳ�ÿ��� ���� ���� ���� �޸𸮿��� �о������ �������ִ�
 * ���̴�.
 */