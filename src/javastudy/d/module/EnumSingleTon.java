package javastudy.d.module;

//06 �̳� Ȱ��
public enum EnumSingleTon {
    INSTANCE;

    private final Client dbClient;

    EnumSingleTon() {
        dbClient = Database.getClient();
    }

    public static EnumSingleTon getInstance() {
        return INSTANCE;
    }

    public Client getClient() {
        return dbClient;
    }

}

/*
 * [Enum �̿�]
 * 
 * ����Ǵ� �ΰ��� ����� �ϳ� enum�� ���ʿ� ����� ���鶧 private�� ����� �ѹ��� �ʱ�ȭ �ϱ� ������ thread safe��.
 * enum ������ ��� �Ӹ� �ƴ϶�, ������ �޼��带 ������ ����� �����ϱ� ������, �̸� �̿��� �̱��� Ŭ���� ó�� ������ ���� ����
 * Bill Pugh Solution ����� �޸�, Ŭ���̾�Ʈ���� Reflection�� ���� ���ݿ��� ���� ������ ���� �̱��� Ŭ������
 * ��Ƽ��(�Ϲ����� Ŭ����)�� ���̱׷��̼� �ؾ��Ҷ� ó������ �ڵ带 �ٽ� ¥�� �Ǵ� ������ �����Ѵ�. (���� ������ ������� ���� �ɼ� �ֱ�
 * ������) Ŭ���� ����� �ʿ��Ҷ�, enum ���� Ŭ���� ����� �Ұ����ϴ�. ��ó:
 * https://inpa.tistory.com/entry/GOF -�̱���Singleton-����-�Ĳ��ϰ�-�˾ƺ���
 */