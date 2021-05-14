package hw1.Task1;

public class Employee {
    public String employeeName;
    public long idCard;
    public static int numberOfEmployee;

    public String toString() {
        return "Employee Name: " + employeeName + ", ID card - " + idCard + '.';

    }

    public void stateCurrent(String state) {
        Object o = new Object();
        String s = "";

        System.out.println("Current state - " + state + ';');
    }
    public void printSomething(){
        System.out.println("Привет из емплои!!");
    }


    public void company(String companyName) {
        System.out.println("Company - " + companyName + ';');
    }

    public Employee() {
    numberOfEmployee++;

    System.out.println(Employee.numberOfEmployee);
}

}