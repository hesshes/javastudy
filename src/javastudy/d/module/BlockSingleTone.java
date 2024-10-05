package javastudy.d.module;

public class BlockSingleTone {
    // �̱��� Ŭ���� ��ü�� ���� �ν��Ͻ� ����
    private static BlockSingleTone instance;

    // �����ڸ� private�� ���� (�ܺο��� new ��� X)
    private BlockSingleTone() {
    }

    // static ����� �̿��� ���� ó��
    // static block : Ŭ������ �ε��ǰ� Ŭ���� ������ �غ�� �� �ڵ����� ����Ǵ� ���
    static {
        try {
            instance = new BlockSingleTone();
        } catch (Exception e) {
            throw new RuntimeException("�̱��� ��ü ���� ����");
        }
    }

    public static BlockSingleTone getInstance() {
        return instance;
    }
}

/*
 * [Static block initialization]
 * 
 * Eager Initialization�� ������ ����ó�� �� �� ������ ����. static block �� �̿��� ���ܸ� ���� �� ���� �׷���
 * ������ static �� Ư������ ��������� �ʴµ��� ������ ������
 * 
 * ��ó: https://inpa.tistory.com/entry/GOF- �̱���Singleton-����-�Ĳ��ϰ�-�˾ƺ���
 */
