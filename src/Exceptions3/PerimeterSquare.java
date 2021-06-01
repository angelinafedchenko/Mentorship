package Exceptions3;

public class PerimeterSquare {

    public void getPerimeter() {

        Square square = new Square();
        try {
            square.setSide(0);
        } catch (PerimeterException e) {
            System.err.println(e.getMessage());
        }
    }
}
