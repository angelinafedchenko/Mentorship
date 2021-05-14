package hw1.Task3;

import hw1.Task1.Employee;

class Main {

    public static void main(String[] args) {
        Employee one = new Employee();
        one.employeeName = "B";
        one.idCard = 789;
        one.stateCurrent("Fired");
        one.company("Softserve");

        System.out.println(one.toString());
    }


}