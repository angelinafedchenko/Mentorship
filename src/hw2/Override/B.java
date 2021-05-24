package hw2.Override;

public class B extends A {

    @Override
    public void serialNumber() {
        System.out.println("I'm the second in Alphabet.");
    }

    @Override
    public int number (int b) {
        return b;
    }

    @Override
    public void letter() {
        System.out.println("B");
    }
}
