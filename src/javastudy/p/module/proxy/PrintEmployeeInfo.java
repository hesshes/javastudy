package javastudy.p.module.proxy;

import java.util.List;

public class PrintEmployeeInfo {
    IEmployee viewer; // 조회하려는 자

    public PrintEmployeeInfo(IEmployee viewer) {
        this.viewer = viewer;
    }

    // Employee 객체 리스트를 받아 직원들의 정보를 순회하여 조회
    public void printAllInfo(List<IEmployee> employees) {
        employees.stream().map(employee -> employee.getInfo(viewer)).forEach(System.out::println);
    }
}
