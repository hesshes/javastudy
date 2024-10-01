package javastudy.e;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import javastudy.e.module.EBox;
import javastudy.e.module.EBoxType;
import javastudy.e.module.EICompare;
import javastudy.e.module.ESchool;
import javastudy.e.module.EStudent;

public class Eexecute {
    public static void main(String[] args) {
        // Java Generic
        // Ŭ���� ���ο��� ����� ������ Ÿ���� �ܺο��� �����ϴ� ���
        ArrayList<String> arrList = new ArrayList<String>();
        // ArrayList : ����Ʈ �ڷ���
        // <String> : ���ο��� ����� ���� Ÿ�� ����
        // list : ������
        // <> : ���̾Ƹ�� ������
        // <T> : Ÿ�� �Ű����� / Ÿ�� ���� ��� �θ�

        // Generic ĳ���� ���� ��
        // �迭�� ����
        Object[] arr = new Integer[1];

        // Generic �� �Ұ��� error
        // List<Object> list2 = new ArrayList<Integer>();

        // Generic�� ���� Ÿ�� ���� ����ȯ �Ұ���
        // ���޹��� Ÿ�����θ� ���� ĳ������ ����

        // �������̽� Ÿ�� ���� ��� ��
        // EStudent�� ������ �������̽���
        // ESchool�� ���׸����� ������� ���� ���� ��
        ESchool<EStudent> a = new ESchool<EStudent>();
        // ��� �Ұ� ��
        // ESchool<Test> a = new ESchool<Test>();

        // ���� �������̽� Ÿ�� ���� ��
        // ���� ��� ���� �����̹Ƿ� ����� �������̽� ��θ�
        // ������ Ŭ�������� Ÿ�� �Ҵ��� ����
        EBox<EBoxType> box = new EBox<EBoxType>();

        // ����� Ÿ�� ���� ��
        Collection<Integer> list = Arrays.asList(56, 34, 12, 31, 65, 77, 91, 88);
        System.out.println(EICompare.max(list));

        Collection<Number> list2 = Arrays.asList(56, 34, 12, 31, 65, 77, 91, 88);
        // System.out.println(EICompare.max(list2)); // error number �߻� �޼���� Comparable��
        // �������� �ʾ���

        // Generic ���ϵ� ī��
        // <?> : Unbounded Wildcards ( ���� ���� )
        // - Ÿ�� �Ķ���͸� ��ġ�ϴ� ��ü���� Ÿ������ ��� Ŭ������ �������̽� Ÿ���� �� �� ����
        // <? extends ����Ÿ��> : Upper Bounded Wildcards ( ���� Ŭ���� ���� )
        // - Ÿ�� �Ķ���͸� ��ġ�ϴ� ��ü���� Ÿ������ ���� Ÿ���̳� ���� Ÿ���� ���� Ÿ�Ը� �� �� ����
        // <? super ����Ÿ��> : Lower Bounded Wildcards ( ���� Ŭ���� ���� )
        // - Ÿ�� �Ķ���͸� ��ġ�ϴ� ��ü���� Ÿ������ ���� Ÿ���̳� ���� Ÿ���� ���� Ÿ�Ը� �� �� ����
  
    }
}
