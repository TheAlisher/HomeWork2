package com.company;

public class Main {

    public static void main(String[] args) {
        String name = "John";
        int age = 12;
        int temp = 20;
        if (age > 20 && age < 45 && temp < 30 && temp > -20) {
            System.out.println("Идем гулять");
        }
        if (age < 20 && temp > 0 && temp < 28) {
            System.out.println("Пошли гулять");
        }
        if (age > 45 && temp > -10 && temp < 25) {
            System.out.println("Можно гулять");
        }

    }

}
