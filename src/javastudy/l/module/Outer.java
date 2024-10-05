package javastudy.l.module;

public class Outer {
    // static ����
    static String value = "> Outer Ŭ������ static �ʵ� �Դϴ�.";

    // static final ���
    static final String VALUE = "> Outer Ŭ������ static final �ʵ� �Դϴ�.";

    Outer() {
        System.out.println("> Outer ������ �ʱ�ȭ");
    }

    // static �޼���
    static void getInstance() {
        System.out.println("> Outer Ŭ������ static �޼��� ȣ��");
    }

    // inner Ŭ����
    class Inner {
        Inner() {
            System.out.println("> Inner ������ �ʱ�ȭ");
        }
    }

    // static inner Ŭ����
    static class Holder {
        static String value = "> Holder Ŭ������ static �ʵ� �Դϴ�.";
        static final String VALUE = "> Holder Ŭ������ static final �ʵ� �Դϴ�.";

        Holder() {
            System.out.println("> Holder ������ �ʱ�ȭ");
        }
    }

}

//java -classpath Ŭ����������ġ -verbose:class Ŭ������
