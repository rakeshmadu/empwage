package com.bridgelabz;

public class EmpWageBuilder {
    public static void main(String[] args) {
        System.out.println("Welcome to emp wage computation ");

        int IS_FULL_TIME = 1;
        int attendance = (int)Math.floor(Math.random() * 10) % 2;
        if(attendance == IS_FULL_TIME) System.out.println("Emp is present");
        else System.out.println("Emp is absent");
    }
}
