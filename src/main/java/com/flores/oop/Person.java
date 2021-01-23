package com.flores.oop;

/***
 *  Represents a human
 */
public class Person {

    private String aName;
    private int aAge;
    private Gender aGender;

    public Person(){

    }

    public Person(String aName,int aAge,Gender aGender){
        this.aName = aName;
        this.aAge = aAge;
        this.aGender = aGender;
    }


    public String getName() {
        return aName;
    }

    public void setName(String aName) {
        this.aName = aName;
    }

    public int getAge() {
        return aAge;
    }

    public void setAge(int aAge) {
        this.aAge = aAge;
    }

    public Gender getGender() {
        return aGender;
    }

    public void setGender(Gender aGender) {
        this.aGender = aGender;
    }

    /***
     * Prints the class information
     */
    public void printInfo(){
        System.out.println("I am a person");
        //Print name if any
        if(getName()!=null){
            System.out.println("My name is :"+ getName());
        }else {
            System.out.println("No name is set.");
        }
        //Print age

        System.out.println("My age is :"+ getAge());
        System.out.println("I am a "+getGender().toString()+ " person.");

    }

}
