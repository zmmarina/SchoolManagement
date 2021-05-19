package com.zmonteiro.application;

import entities.Contract;
import entities.Fee;
import entities.Student;
import services.ContractService;
import services.Year2021;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Hello! Enter the required data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Classroom: ");
        int classroom = sc.nextInt();
        sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Telephone: ");
        long telephone = sc.nextLong();
        System.out.print("Birthdate (dd/MM/yyyy): ");
        Date birthdate = sdf.parse(sc.next());

        System.out.print("Starting contract at: ");
        Date contractDate = sdf.parse(sc.next());
        System.out.print("Due fee per month: ");
        double fee = sc.nextDouble();

        Contract contract = new Contract(contractDate);
        Student student = new Student(name, classroom, email, telephone, birthdate, contract);
        Fee monthlyFee = new Fee(contractDate, fee);
        ContractService contractService = new ContractService(new Year2021());

        contractService.generateSlips(contract, monthlyFee);

        System.out.println("Future slips of " + student.getName());
        for (Fee futureFee : contract.getFees()){
            System.out.println(futureFee);
        }



        sc.close();

    }
}
