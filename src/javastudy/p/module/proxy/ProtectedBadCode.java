package javastudy.p.module.proxy;

import java.util.Arrays;
import java.util.List;

public class ProtectedBadCode {
    public static void main(String[] args) {
        // ������ ���� ��ü ����
        Employee CTO = new Employee("Dragon Jung", RESPONSIBILITY.DIRECTOR);
        Employee devManager = new Employee("Cats Chang", RESPONSIBILITY.MANAGER);
        Employee financeManager = new Employee("Dell Choi", RESPONSIBILITY.MANAGER);
        Employee devStaff = new Employee("Dark Kim", RESPONSIBILITY.STAFF);
        Employee financeStaff = new Employee("Pal Yoo", RESPONSIBILITY.STAFF);

        // �������� ����Ʈ�� ����
        List<IEmployee> employees = Arrays.asList(CTO, devManager, financeManager, devStaff, financeStaff);

        /*-----------------------------------------------------------------------------------------*/

        // �� : �ϰ� ��� ��å
        Employee me = new Employee("inpa", RESPONSIBILITY.STAFF);

        System.out.println("\n================================================================");
        System.out.println("�ó�����1. �ϰ� ����� ���� ȸ�� �ο� �λ� ���� ��ȸ");
        System.out.println("================================================================");
        PrintEmployeeInfo view = new PrintEmployeeInfo(me); // ��� ���� ������ ����ϴ� Ŭ����
        view.printAllInfo(employees); // �ϰ� ����� �ұ��ϰ� ��� ���� ��ȸ
    }

}
