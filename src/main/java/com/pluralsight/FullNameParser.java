package com.pluralsight;

import java.util.Arrays;
import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {

       // prompts the user to enter a name in one of the following two formats:first last or first middle last
        Scanner read = new Scanner(System.in);

        System.out.print("Enter name in format 1 (first,last) or format 2(first,middle,last): ");
        String userChoice = read.nextLine().trim();

        //read.nextLine();

        String[] nameSplit = userChoice.split(" ");

        System.out.println("First name: " + nameSplit[0]);

        if (nameSplit.length == 3){

            System.out.println("Middle name: " + nameSplit[1]);
            System.out.println("Last name: " + nameSplit[2]);


        }else {
            System.out.println("Middle name: (none)");

            System.out.println("Last name: " + nameSplit[1]);
        }

//

       // System.out.println("Last name: " + nameSplit[2]);






        // if()

        /*
        System.out.print("First name: ");
        String firstName = read.nextLine().trim();

        System.out.print("Middle name: ");
        String middleName = read.nextLine().trim();

        System.out.print("Last name: ");
        String lastName = read.nextLine().trim();

        System.out.print("Suffix: ");
        String suffix = read.nextLine().trim();



        String fullName = "";


        if (middleName.isEmpty()){
            fullName =  ("Your full name is: " + firstName + " " + lastName);

        }
        else{
            fullName = ("Your full name is: " + firstName + " " + middleName + " " + lastName);
        }


        if(!suffix.isEmpty()) {

            fullName = fullName + ", " + suffix;


        }


        System.out.println(fullName);

         */


    }
}
