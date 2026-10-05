import java.util.Scanner;

class Employee {
    String emp_name;
    int emp_id;
    String address;
    String mail_id;
    String mob_number;

    Employee(String name, int id, String addr, String mail, String mob) {
        emp_name = name;
        emp_id = id;
        address = addr;
        mail_id = mail;
        mob_number = mob;
    }

    void display() {
        System.out.println("Employee Name  : " + emp_name);
        System.out.println("Employee ID    : " + emp_id);
        System.out.println("Address        : " + address);
        System.out.println("Mail ID        : " + mail_id);
        System.out.println("Mobile Number  : " + mob_number);
    }
}

class Programmer extends Employee {
    double basicpay, da, hra, pf, fund;
    double grosssalary, netsalary;

    Programmer(String name, int id, String addr,
               String mail, String mob, double bp) {
        super(name, id, addr, mail, mob);
        basicpay = bp;
    }

    void getPaySlip() {
        da = basicpay * 97 / 100;
        hra = basicpay * 10 / 100;
        pf = basicpay * 12 / 100;
        fund = basicpay * 0.1 / 100;

        grosssalary = basicpay + da + hra;
        netsalary = grosssalary - pf - fund;
    }

    void disp() {
        System.out.println();
        System.out.println("***** PROGRAMMER PAYSLIP *****");
        display();
        System.out.println("Gross Salary   : " + grosssalary);
        System.out.println("Net Salary     : " + netsalary);
    }
}

class AssistantProfessor extends Employee {
    double basicpay, da, hra, pf, fund;
    double grosssalary, netsalary;

    AssistantProfessor(String name, int id, String addr,
                       String mail, String mob, double bp) {
        super(name, id, addr, mail, mob);
        basicpay = bp;
    }

    void getPaySlip() {
        da = basicpay * 97 / 100;
        hra = basicpay * 10 / 100;
        pf = basicpay * 12 / 100;
        fund = basicpay * 0.1 / 100;

        grosssalary = basicpay + da + hra;
        netsalary = grosssalary - pf - fund;
    }

    void disp() {
        System.out.println();
        System.out.println("***** ASSISTANT PROFESSOR PAYSLIP *****");
        display();
        System.out.println("Gross Salary   : " + grosssalary);
        System.out.println("Net Salary     : " + netsalary);
    }
}

class AssociateProfessor extends Employee {
    double basicpay, da, hra, pf, fund;
    double grosssalary, netsalary;

    AssociateProfessor(String name, int id, String addr,
                       String mail, String mob, double bp) {
        super(name, id, addr, mail, mob);
        basicpay = bp;
    }

    void getPaySlip() {
        da = basicpay * 97 / 100;
        hra = basicpay * 10 / 100;
        pf = basicpay * 12 / 100;
        fund = basicpay * 0.1 / 100;

        grosssalary = basicpay + da + hra;
        netsalary = grosssalary - pf - fund;
    }

    void disp() {
        System.out.println();
        System.out.println("***** ASSOCIATE PROFESSOR PAYSLIP *****");
        display();
        System.out.println("Gross Salary   : " + grosssalary);
        System.out.println("Net Salary     : " + netsalary);
    }
}

class Professor extends Employee {
    double basicpay, da, hra, pf, fund;
    double grosssalary, netsalary;

    Professor(String name, int id, String addr,
              String mail, String mob, double bp) {
        super(name, id, addr, mail, mob);
        basicpay = bp;
    }

    void getPaySlip() {
        da = basicpay * 97 / 100;
        hra = basicpay * 10 / 100;
        pf = basicpay * 12 / 100;
        fund = basicpay * 0.1 / 100;

        grosssalary = basicpay + da + hra;
        netsalary = grosssalary - pf - fund;
    }

    void disp() {
        System.out.println();
        System.out.println("***** PROFESSOR PAYSLIP *****");
        display();
        System.out.println("Gross Salary   : " + grosssalary);
        System.out.println("Net Salary     : " + netsalary);
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name of Employee: ");
        String name = sc.nextLine();

        System.out.print("Enter ID of Employee: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Address of Employee: ");
        String address = sc.nextLine();

        System.out.print("Enter Mail ID of Employee: ");
        String mail = sc.nextLine();

        System.out.print("Enter Mobile Number of Employee: ");
        String mobile = sc.nextLine();

        System.out.print("Enter Basic Pay: ");
        double bp = sc.nextDouble();

        System.out.println();
        System.out.println("1. Programmer");
        System.out.println("2. Assistant Professor");
        System.out.println("3. Associate Professor");
        System.out.println("4. Professor");
        System.out.println("5. Exit");

        System.out.print("Enter Designation: ");
        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                Programmer p = new Programmer(
                    name, id, address, mail, mobile, bp);
                p.getPaySlip();
                p.disp();
                break;

            case 2:
                AssistantProfessor ap = new AssistantProfessor(
                    name, id, address, mail, mobile, bp);
                ap.getPaySlip();
                ap.disp();
                break;

            case 3:
                AssociateProfessor asp = new AssociateProfessor(
                    name, id, address, mail, mobile, bp);
                asp.getPaySlip();
                asp.disp();
                break;

            case 4:
                Professor prof = new Professor(
                    name, id, address, mail, mobile, bp);
                prof.getPaySlip();
                prof.disp();
                break;

            case 5:
                System.out.println("Exiting...");
                break;

            default:
                System.out.println("Invalid Designation");
        }

        sc.close();
    }
}
