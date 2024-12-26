package com.healthcaremanagementsystem.service;

import com.healthcaremanagementsystem.model.Department;

import java.util.ArrayList;
import java.util.Scanner;

public class DepartmentService {

    private ArrayList departments = new ArrayList();

    private static Scanner scanner = new Scanner(System.in);

    void printDepartment(Department department){
        System.out.println(department);
    }
    public Department createDepartment(){

        System.out.println("please enter department Id");
        int deptId = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter department name");
        String deptName = scanner.nextLine();

        System.out.println("please enter doctor id");
        int doctorId = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter hospital id");
        int hId = Integer.parseInt(scanner.nextLine());

        Department department = new Department();
        department.setDeptId(deptId);
        department.setDeptName(deptName);
        department.setDoctorId(doctorId);
        department.sethId(hId);
        departments.add(department);
        return department;

    }
    public void displayDepartment(){
        for (Object department : departments){
            System.out.println("create department: "+department);
        }
    }
}
