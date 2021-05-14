package Draft1;

public class Main {

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("Anhelina");
        person1.setAge(30);
//        person1.speak();
        System.out.println("Name: " + person1.getName());
        System.out.println("Age: " + person1.getAge());
    }
}

class Person {
    private String name;
    private int age;

    public void setName (String UserName) {
        name = UserName;
    }

    public String getName() {
        return name;
    }

    public void setAge (int userAge) {
        age = userAge;
    }

    public int getAge() {
        return age;
    }

//    int calculateYearsToBeRetirement() {
//        int years = 65-age;
//        return years;
//    }
//
//    void speak() {
//        for (int i = 0; i<3; i++) {
//            System.out.println("Меня зовут " + name + ", мне " + age +" лет");
//        }
//    }
}
