package hw2.Override;

public class C extends B {

    @Override
    public void serialNumber() {
        System.out.println("I'm the third in Alphabet.");
    }

    @Override
    public int number (int c) {
        return c;
    }

    @Override
    public String letter1 (String c) {
        return c;
    }
}
