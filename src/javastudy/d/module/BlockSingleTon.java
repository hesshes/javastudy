package javastudy.d.module;
//02
public class BlockSingleTon {
    // �̱��� Ŭ���� ��ü�� ���� �ν��Ͻ� ����
    private static BlockSingleTon instance;

    // �����ڸ� private�� ���� (�ܺο��� new ��� X)
    private BlockSingleTon() {
    }

    // static ����� �̿��� ���� ó��
    // static block : Ŭ������ �ε��ǰ� Ŭ���� ������ �غ�� �� �ڵ����� ����Ǵ� ���
    static {
        try {
            instance = new BlockSingleTon();
        } catch (Exception e) {
            throw new RuntimeException("�̱��� ��ü ���� ����");
        }
    }

    public static BlockSingleTon getInstance() {
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
