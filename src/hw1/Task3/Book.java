package hw1.Task3;

import hw1.Task1.Employee;

public class Book {


    private int weight;
    private static int numberOfBooks;
    String name;
    int pages;


    int getWeight () {

        return weight;
    }

    void setWeight (int weight) {
        this.weight = weight;
    }

    Book () {
        numberOfBooks++;
    }

    public static void main (String[] args) {
        Book a = new Book();
        a.setWeight(3);
        System.out.println("Books's weight is " + a.getWeight());

        for (int i=0; i < 10; i++) {

        }
        System.out.println("Number of book is " + numberOfBooks);
    }
}
