package hw1.Task4;

import hw1.Task4.Persons.Person;

class Test1 extends Person {

    public static void main (String[] args) {
        Test1 someTest1 = new Test1();
        someTest1.name = "Ann";
        //someTest1.company;
        //someTest1.numberOfPerson;
        someTest1.numberOfPerson();
        //someTest1.technicalMethod();
        //someTest1.defaultMethod();

        System.out.println(someTest1.toString());
    }

}
