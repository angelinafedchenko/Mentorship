import hw1.Task4.Persons.Person;

public class ClassesAndObjects {

    public static void main(String[] args) {
        User person1 = new User();
        //person1.name = "Ronald";
        person1.setName("Ronald");
        person1.setNameAndAge("Ron", 25);
        //String s1 = "Ronald1";
        //person1.setName(s1);
        //person1.age = 50;
        //int year1 = person1.calculateYearsToRetirement();
        //System.out.println("For first: " + year1);
        person1.speak();
        //person1.speak();

        User person2 = new User();
        person2.name = "Harry";
        person2.age = 40;
        person2.calculateYearsToRetirement();
        int year2 = person2.calculateYearsToRetirement();
        System.out.println("For second: " + year2);

    }
}

class User {
    String name;
    int age;

    int calculateYearsToRetirement() {
        int years = 65 - age;
        return years;
    }

    void speak() {
        for (int i = 0; i<2; i++) {
            System.out.println("My name is: " + name + ". My age is: " + age);
        }
        }

        void sayHello() {
            System.out.println("Hello from " + name);

        }

        void setName (String username) {
            name = username;
        }

    void setNameAndAge (String username, int userage) {
        name = username;
        age = userage;
    }
}

