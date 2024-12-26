package com.healthcaremanagementsystem.service;

import com.healthcaremanagementsystem.model.Hospital;

import java.util.ArrayList;
import java.util.Scanner;

public class HospitalService {

    private ArrayList hospitals = new ArrayList();

    private static Scanner scanner = new Scanner(System.in);

    void printHospital(Hospital hospital){
        System.out.println(hospital);
    }

    public Hospital createHospital(){

        System.out.println("please enter id");
        int hId = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter hospital name");
        String hName = scanner.nextLine();

        System.out.println("please enter hospital address");
        String hAddress = scanner.nextLine();

        System.out.println("please enter contact no");
        String contactNo = scanner.nextLine();

        System.out.println("please enter email Id ");
        String emailId = scanner.nextLine();

        Hospital hospital = new Hospital();
        hospital.sethId(hId);
        hospital.sethName(hName);
        hospital.sethAddress(hAddress);
        hospital.setContactNo(contactNo);
        hospital.setEmailId(emailId);
        hospitals.add(hospital);
        return hospital;
    }

    public void displayHospital(){
        for(Object hospital : hospitals){
            System.out.println("create hospital: "+hospital);
        }
    }

}
