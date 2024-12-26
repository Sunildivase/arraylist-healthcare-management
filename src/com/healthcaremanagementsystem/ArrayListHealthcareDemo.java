package com.healthcaremanagementsystem;

import com.healthcaremanagementsystem.service.DepartmentService;
import com.healthcaremanagementsystem.service.DoctorService;
import com.healthcaremanagementsystem.service.HospitalService;
import com.healthcaremanagementsystem.service.PersonService;

import java.util.Scanner;

public class ArrayListHealthcareDemo {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        PersonService personService = new PersonService();
        DoctorService doctorService = new DoctorService();
        HospitalService hospitalService = new HospitalService();
        DepartmentService departmentService = new DepartmentService();

        int option=0;
        do {
            System.out.println("-----------healthcare-management-system---------------");
            System.out.println("1.create person");
            System.out.println("2.create doctor");
            System.out.println("3.create hospital");
            System.out.println("4.create department");
            System.out.println("5.create appointment");
            System.out.println(("6.create prescription"));
            System.out.println("7.create billing");
            System.out.println("please choose the option");
            option = Integer.parseInt(scanner.nextLine());

            switch (option) {
                case 1:
                    personService.createPerson();
                    personService.displayPerson();
//                    System.out.println("person created");
                    break;

                case 2:
                    doctorService.createDoctor();
                    doctorService.dispalyDoctor();
//                    System.out.println("doctor created");
                    break;

                case 3:
                    hospitalService.createHospital();
                    hospitalService.displayHospital();
//                    System.out.println("hospital created");
                    break;

                case 4:
                    departmentService.createDepartment();
                    departmentService.displayDepartment();
//                    System.out.println("department created ");
                    break;

                case 5:
                    System.out.println("appointment created");
                    break;

                case 6:
                    System.out.println("prescription created ");
                    break;

                case 7:
                    System.out.println("bill created");
                    break;

                default:
                    System.out.println("invalid input please enter valid input");
                    break;

            }
        }while(option!=0);{
            System.out.println("Thank you !!!");
        }

    }
}
