package hw1.Task4;

import hw1.Task4.Persons.Person;

public class Test3 {
    public static void main(String[] args) {
        Person person3 = new Person();
        person3.name = "Ronald";
        System.out.println("Person 3 is here");

        Person person4 = new Person();
        person4.name = "Ronald";

        if (person3.equals(person4)) {
            System.out.println("OK");

        } else {
            System.out.println("NO");
        }

        System.out.println(person3.hashCode());
        System.out.println(person4.hashCode());
    }


}
