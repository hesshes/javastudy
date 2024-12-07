package javastudy.g.module;

// ���׸� �޼���
// ���׸� Ÿ���� �Ķ���͸� �޾ƿ� ����ϴ� �Ϲ� �޼���� ���׸� �޼��带 ȥ������ ����
// ���׸� �޼���� ���� �޼��忡 <T>, ���׸��� ���������ν� �������� Ÿ���� �޾ƿ� ����� �� �ִ�
// ���������� ��� ������ �޼����� �����ϸ� ��
public class GFruitBox<T> {

    // Ŭ������ Ÿ�� �Ķ���͸� �޾ƿ� ����ϴ� �Ϲ� �޼���
    public T addBox(T x, T y) {
        // .. body ����
        return null;
    }

    // ���������� �Ҵ� ��Ǵ� ���׸� �޼���
    public static <T> T addBoxStatic(T x, T y) {
        // .. body ����
        return null;
    }
    
    // ���������� ��Ǵ� ���׸� �޼���
    public <T, U> void printBox(T x, U y) {
        // �ش� �Ű������� Ÿ�� ���
        System.out.println(x.getClass().getSimpleName());
        System.out.println(y.getClass().getSimpleName());
    }
}
