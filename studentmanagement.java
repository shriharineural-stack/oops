import java.util.Scanner;

// Parent Class
class Person {
    protected String name;
    protected int age;

    Person() {
        name = "Unknown";
        age = 0;
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayPerson() {
        System.out.println("Name       : " + name);
        System.out.println("Age        : " + age);
    }
}

// Child Class - Inheritance
class Student extends Person {

    private int rollNo;
    private String department;
    private double[] marks;
    private double average;
    private char grade;

    Student(int rollNo, String name, int age, String department) {
        super(name, age);

        this.rollNo = rollNo;
        this.department = department;
        this.marks = new double[5];
        this.average = 0;
        this.grade = 'F';
    }

    // Method to enter marks
    void enterMarks(Scanner sc) {

        System.out.println("\nEnter marks for 5 subjects:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = sc.nextDouble();
        }

        calculateResult();
    }

    // Calculate result
    void calculateResult() {

        double total = 0;

        for (double mark : marks) {
            total += mark;
        }

        average = total / 5;

        if (average >= 90)
            grade = 'A';
        else if (average >= 80)
            grade = 'B';
        else if (average >= 70)
            grade = 'C';
        else if (average >= 60)
            grade = 'D';
        else
            grade = 'F';
    }

    // Display student
    void displayStudent() {

        System.out.println("\n====================================");
        System.out.println("         STUDENT DETAILS");
        System.out.println("====================================");

        System.out.println("Roll Number : " + rollNo);

        displayPerson();
