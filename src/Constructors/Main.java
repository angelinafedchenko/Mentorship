package Constructors;

public class Main {

    public static void main(String[] args) {
        Trainee.description = "Nice";
        Trainee.getDescription();

    }
}

class Trainee {

    private String name;
    private int age;

    public static String description;

//    public Trainee() {
//        System.out.println("First constructor");
//        this.name = "Default name";
//        this.age = 0;
//    }
//
//    public Trainee (String name) {
//        System.out.println("Second constructor");
//        this.name = name;
//    }

    Trainee (String name, int age) {
        System.out.println("Third constructor");
        this.name = name;
        this.age = age;
    }

    public void setName (String name) {
        this.name = name;
    }

    public void setAge (int age) {
        this.age = age;
    }

    public static void getDescription() {
        System.out.println(description);
    }
}