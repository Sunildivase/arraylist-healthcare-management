package com.healthcaremanagementsystem.service;

import com.healthcaremanagementsystem.model.Doctor;

import java.util.ArrayList;
import java.util.Scanner;

public class DoctorService {

    private ArrayList doctors = new ArrayList();

    private static Scanner scanner = new Scanner(System.in);

    void printDoctor(Doctor doctor){
        System.out.println(doctor);
    }

    public Doctor createDoctor(){

        System.out.println("please enter doctor id");
        int doctorId = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter first name");
        String fName = scanner.nextLine();

        System.out.println("please enter last name");
        String lName = scanner.nextLine();

        System.out.println("please enter age");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter gender");
        String gender = scanner.nextLine();

        System.out.println("please enter contact number");
        String contactNo = scanner.nextLine();

        System.out.println("please enter speciality");
        String speciality = scanner.nextLine();

     Doctor doctor = new Doctor();
     doctor.setDoctorId(doctorId);
     doctor.setfName(fName);
     doctor.setlName(lName);
     doctor.setAge(age);
     doctor.setGender(gender);
     doctor.setContactNo(contactNo);
     doctor.setSpeciality(speciality);
     doctors.add(doctor);
     return doctor;
    }

    public void dispalyDoctor(){
        for(Object doctor : doctors){
            System.out.println("create doctor: "+doctor);
        }
    }
}
