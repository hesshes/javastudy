package javastudy.p.module.proxy;

//��ȣ ���Ͻ� : �λ������� ��ȣ�� ������ (�λ� ���� ���� ���� ������ ���� �߻�)
public class ProtectedEmployee implements IEmployee {
    private IEmployee employee;

    public ProtectedEmployee(IEmployee employee) {
        this.employee = employee;
    }

    @Override
    public String getInfo(IEmployee viewer) {

        RESPONSIBILITY position = this.employee.getGrade(); // ��ȸ ���ϴ� ���� ��å�� ���

        // �Ű������� ���� ��ȸ���� ��å�� ���� ����� ����
        switch (viewer.getGrade()) {
        case DIRECTOR:
            // �λ����� ����, ������� �� �� �ִ�.
            return this.employee.getInfo(viewer);
        case MANAGER:
            // ������ ���� ������ �� �Ʒ� ������� �� �� �ִ�. ���� ������ �� �� ����.
            if (position != RESPONSIBILITY.DIRECTOR) {
                return this.employee.getInfo(viewer);
            }
        case STAFF:
            // ����� ���� ������ ����鸸 �� �� �ִ�. ����, ���� ������ �� �� ����.
            if (position != RESPONSIBILITY.DIRECTOR && position != RESPONSIBILITY.MANAGER) {
                return this.employee.getInfo(viewer);
            }
        default:
            return "�ٸ� ����� �λ������� ��ȸ �Ҽ� �����ϴ�";
        }
    }

    @Override
    public String getName() {
        return employee.getName();
    }

    @Override
    public RESPONSIBILITY getGrade() {
        return employee.getGrade();
    }
}