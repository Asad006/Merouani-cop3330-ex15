package org.example;
/*
*  UCF COP3330 Summer 2021 Assignment 1 Solution
*  Copyright 2021 Asad merouani
*/


import java.util.Scanner;

public class App {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        App app = new App();
        
        app.checkDriveEligibility(scanner);
    }

    private void checkDriveEligibility(Scanner scanner) {
        int age;

        System.out.println("What is your age?");
        age= Integer.parseInt(scanner.nextLine());
        if (age>= 16){
            System.out.println("You are old enough to legally drive.");
        }else {
            System.out.println("You are not old enough to legally drive.");
        }
    }
}
