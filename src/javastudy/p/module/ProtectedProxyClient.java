package javastudy.p.module;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javastudy.p.module.proxy.Employee;
import javastudy.p.module.proxy.IEmployee;
import javastudy.p.module.proxy.PrintEmployeeInfo;
import javastudy.p.module.proxy.RESPONSIBILITY;
import javastudy.p.module.proxy.ProtectedEmployee;
import javastudy.p.module.proxy.ProtectedEmployee;

public class ProtectedProxyClient {
    public static void main(String[] args) {
        // ������ ���� ��ü ����
        Employee CTO = new Employee("Dragon Jung", RESPONSIBILITY.DIRECTOR);
        Employee devManager = new Employee("Cats Chang", RESPONSIBILITY.MANAGER);
        Employee financeManager = new Employee("Dell Choi", RESPONSIBILITY.MANAGER);
        Employee devStaff = new Employee("Dark Kim", RESPONSIBILITY.STAFF);
        Employee financeStaff = new Employee("Pal Yoo", RESPONSIBILITY.STAFF);

        // �������� ����Ʈ�� ����
        List<Employee> employees = Arrays.asList(CTO, devManager, financeManager, devStaff, financeStaff);

        /*-----------------------------------------------------------------------------------------*/

        // ������ ��ϵ� ����Ʈ�� ������ �� ������, �������� ������ Employee ��ü�� ���Ͻ� ��ü ProtectedEmployee��
        // Wrap�ϴ� �۾��� �����Ѵ�.
        List<IEmployee> protectedEmployees = new ArrayList();
        for (Employee e : employees) {
            protectedEmployees.add(new ProtectedEmployee((IEmployee) e));
        }

        /*-----------------------------------------------------------------------------------------*/

        // �� : �ϰ� ��� ��å
        Employee me = new Employee("inpa", RESPONSIBILITY.STAFF);

        System.out.println("\n================================================================");
        System.out.println("�ó�����1. �ϰ� ����� ���� ȸ�� �ο� �λ� ���� ��ȸ");
        System.out.println("================================================================");
        PrintEmployeeInfo view = new PrintEmployeeInfo(me);
        view.printAllInfo(protectedEmployees);

        System.out.println("\n================================================================");
        System.out.println("�ó�����2. ������ ȸ�� �ο� �λ� ���� ��ȸ");
        System.out.println("================================================================");
        PrintEmployeeInfo view2 = new PrintEmployeeInfo(devManager);
        view2.printAllInfo(protectedEmployees);

        System.out.println("\n================================================================");
        System.out.println("�ó�����3. �󹫰� ȸ�� �ο� �λ� ���� ��ȸ");
        System.out.println("================================================================");
        PrintEmployeeInfo view3 = new PrintEmployeeInfo(CTO);
        view3.printAllInfo(protectedEmployees);
    }
}
