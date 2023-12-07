package io.zipcoder.polymorphism;

import java.util.Scanner;

public class MainApplication {

    public static void main(String[] args) {
        System.out.println("How many pets are there?");
        Scanner scanner = new Scanner(System.in);
        int noOfPets = scanner.nextInt();
        scanner.nextLine();
        System.out.println("No of pets are: "+ noOfPets);
        for(int i = 0; i<noOfPets;i++){
            System.out.println("What kind of pets each one is?");
            String pet = scanner.nextLine();
            System.out.println("Pet's Name: ");
            String  petName = scanner.nextLine();
        }

    }

}
