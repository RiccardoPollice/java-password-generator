package org.lessons.java.security;

public class PasswordGenerator {
    public static void main(String[] args) {
        String name = "Riccardo";
        String surname = "Pollice";
        String favoriteColor = "Rosso";
        int yearOfBirth = 1996;
        int month = 3;
        int day = 5;
        int sum = yearOfBirth + month + day;
        String password = name + "-"+ surname + "-"+ favoriteColor + "-"+ sum;
        System.out.println(password);




    }
}