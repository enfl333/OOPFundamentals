package com.flores.oop;

import java.util.Scanner;


/****
 *
 * Helper Class for methods to parse and validate Person input to create an instance of a Person object.
 *
 *
 */
public class ScanPersonInput {

    /***
     * Repeats input request until a validated value is entered and a Gender can
     * be determine.
     *
     * @param aScanner Scanner used to parse from System.in
     * @return aGender Gender Enum match correctly to the users input
     *
     */
    public static Gender scanGenderInput(Scanner aScanner){
        System.out.println("Decide the persons Gender: MALE or FEMALE");
        String genderS = aScanner.next();
        boolean cont = false;
        do{
            if(!isValidGender(genderS)){

                System.out.println("Please enter either : MALE or FEMALE.");
                genderS = aScanner.next();
                cont= !isValidGender(genderS);
            }

        }while (cont);
        Gender gender = Gender.valueOf(genderS);
        return gender;
    }


    public static int scanAgeInput (Scanner aScanner){
        System.out.println("Enter the persons age: ");
        String aAgeString = aScanner.next();
        boolean shouldCnt = false;
        do{
            if(!isValidInt(aAgeString)){
                System.out.println("Please enter a number for age.");
                aAgeString = aScanner.next();
                shouldCnt =!isValidInt(aAgeString);
            }

        }while (shouldCnt);
        int aValidAge = Integer.valueOf(aAgeString);
        return aValidAge;
    }

    public static boolean isValidInt(String aIntValue){
        boolean check = false;
        try{
            Integer.valueOf(aIntValue);
            check = true;
        }catch(NumberFormatException e){

        }
        return check;
    }

    public static boolean isValidGender(String aGender) {
        boolean check = false;
        if(aGender.equals("MALE")|| aGender.equals("FEMALE")){
            check = true;
        }
        return check;
    }



}
