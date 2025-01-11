package javastudy.p.module.proxy;

import java.util.List;

public class PrintEmployeeInfo {
    IEmployee viewer; // ��ȸ�Ϸ��� ��

    public PrintEmployeeInfo(IEmployee viewer) {
        this.viewer = viewer;
    }

    // Employee ��ü ����Ʈ�� �޾� �������� ������ ��ȸ�Ͽ� ��ȸ
    public void printAllInfo(List<IEmployee> employees) {
        employees.stream().map(employee -> employee.getInfo(viewer)).forEach(System.out::println);
    }
}
