package javastudy.g.module;

// ���׸� �޼���
// ���׸� Ÿ���� �Ķ���͸� �޾ƿ� ����ϴ� �Ϲ� �޼����
// ���׸� �޼��带 ȥ������ ����
// ���׸� �޼���� ���� �޼��忡 <T>, ���׸��� ���������ν� �������� Ÿ���� �޾ƿ� ����� �� �ִ�
// ���������� ��� ������ �޼����� �����ϸ� ��
public class GFruitBox2<T, U> {

    // ���������� ��Ǵ� ���׸� �޼���
    public <T, U> void printBox(T x, U y) {
        // �ش� �Ű������� Ÿ�� ���
        System.out.println(x.getClass().getSimpleName());
        System.out.println(y.getClass().getSimpleName());
    }
}
