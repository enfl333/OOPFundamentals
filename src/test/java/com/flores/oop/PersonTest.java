package com.flores.oop;


import org.testng.annotations.Test;

import static org.testng.Assert.*;


class PersonTest {

    //Test data
    protected String aMaleName = "Kalle";
    protected String aFemaleName = "Beata";
    protected int anAdultAge = 25;

    @Test
    void createPersonBySetters() {
        Person malePerson = new Person();
        malePerson.setName(aMaleName);
        malePerson.setAge(anAdultAge);
        malePerson.setGender(Gender.MALE);

        assertEquals(malePerson.getAge(),anAdultAge);
        assertEquals(malePerson.getName(),aMaleName);
        assertEquals(malePerson.getGender(),Gender.MALE);
    }

    @Test
    void createPersonByConstructor() {
        Person femalePerson = new Person(aFemaleName,anAdultAge,Gender.FEMALE);
        assertEquals(femalePerson.getAge(),anAdultAge);
        assertEquals(femalePerson.getName(),aFemaleName);
        assertEquals(femalePerson.getGender(),Gender.FEMALE);
    }

    @Test
    void createAHenPersonByConstructor() {
        Person femalePerson = new Person(aFemaleName,anAdultAge,Gender.HEN);
        assertEquals(femalePerson.getAge(),anAdultAge);
        assertEquals(femalePerson.getName(),aFemaleName);
        assertEquals(femalePerson.getGender(),Gender.FEMALE);
    }

    @Test
    void testValidInvalidAgeInput(){
        String inValidIntS = "6y";
        String validIntS = "6";
        boolean falseInt = ScanPersonInput.isValidInt(inValidIntS);
        boolean trueInt = ScanPersonInput.isValidInt(validIntS);

        assertFalse(falseInt);
        assertTrue(trueInt);
    }


}