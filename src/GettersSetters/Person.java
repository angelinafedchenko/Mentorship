package GettersSetters;


public class Person {

        public static void main(String[] args) {
            User person1 = new User();

            person1.setName("Ronald");
            person1.setAge(4);

            System.out.println("Name: " + person1.getName());
            System.out.println("Age: " + person1.getAge());
            person1.speak();


        }
    }

    class User {
        private String name;
        private int age;


        public void setName(String name) {
            if (name.isEmpty()) {
                System.out.println("Field is empty");
            } else {
                this.name = name;
            }
        }

        public String getName() {
            return name;
        }


        public void setAge(int userAge) {
            if (userAge < 0) {
                System.out.println("Age should be >0");
            } else {
                age = userAge;
            }
        }

        public int getAge () {
            return age;
        }




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


        void setNameAndAge (String username, int userage) {
            name = username;
            age = userage;
        }
    }



