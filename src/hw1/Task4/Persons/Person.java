package hw1.Task4.Persons;

public class Person {
    public String name;
    protected int age;
    String company;
    private static int number;

    public String toString() {
        return name + " " + age + " " + company + " " + number + ".";

    }

    public void numberOfPerson() {
        number++;
        System.out.println(Person.number);
    }

    protected void stateCurrent(String state) {

        System.out.println("Current state - " + state + ';');
    }

    private void technicalMethod (String tech) {
        System.out.println("I'm technical method" + tech);
    }

    void defaultMethod (String def) {
        System.out.println("I'm default method " + def);
    }

}
