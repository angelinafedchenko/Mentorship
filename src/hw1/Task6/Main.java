package hw1.Task6;

public class Main {
    public static void main (String[] args) {
        User user = new User("Bob1",1);
        user.toString();
        System.out.println(user.toString());

        User user1 = new User("Bob2", 2);
        System.out.println(user1.toString());

        System.out.println(user.hashCode());
        System.out.println(user1.hashCode());

        System.out.println(user.equals(user1));
    }
}
