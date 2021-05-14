package hw1.Task4.Persons;

import hw1.Task4.Test3;

public class Test2 extends Person {
    public static void main (String[] args) {
        Test2 someTest2 = new Test2();
        someTest2.name = "Harry";
        someTest2.age = 22;
        someTest2.company = "SS";
        //person2.numberOfPerson();
        someTest2.stateCurrent("Hired");
        //person2.technicalMethod();
        someTest2.defaultMethod("Hi");
        someTest2.personSay();

        System.out.println(someTest2.toString());

    }

    void personSay() {
    System.out.println ("I'm the second person");
}
}


