package com.flores.oop;

import java.util.Scanner;

/***
 *  Simple inPut output program to demostrate the creation of persons
 *
 */
public class Main {


    public void scanPersonInput(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("------------------- Create a Person!------------------------");
        //Name- Input
        System.out.println("Enter the persons name: ");
        String name = scanner.next();

        //Age-Input
        int aValidAge = ScanPersonInput.scanAgeInput(scanner);

        //Gender-Input
        Gender gender = ScanPersonInput.scanGenderInput(scanner);

        Person person = new Person(name,aValidAge,gender);
        person.printInfo();

        scanner.close();

    }


    public static void main(String[] args) {
        System.out.println("Invoking main program");
        Main main  = new Main();
        main.scanPersonInput();
    }
}
