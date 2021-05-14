package hw1.Task1;

public class Task1 {

    public static void main(String[] args) {
        Employee anhelina = new Employee();
        Programmer prog = new Programmer();
        anhelina.employeeName = "Anhelina";
        anhelina.idCard = 123456;
        anhelina.stateCurrent("Hired");
        anhelina.company("Softserve");

        System.out.println(anhelina.toString());
    }

    }

