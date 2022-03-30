package sample;

import java.util.ArrayList;
import java.util.Scanner;

public class Main  {

    private static ArrayList<Student> students = new ArrayList<>();

    public static Student addNewStudent(){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter student's ID");
        long id = sc.nextLong();
        sc.nextLine();
        System.out.println("Enter student's full name");
        String fullname = sc.nextLine();
        System.out.println("Enter student's age");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter student's guardian name");
        String guardian = sc.nextLine();
        System.out.println("Enter date of birth");
        String dob = sc.next();
        System.out.println("Enter Phone No");
        String contact = sc.next();
        System.out.println("Enter email");
        String email = sc.next();

        Student newStudent = new Student(id,fullname,age,guardian,dob,contact,email);
        students.add(newStudent);
        return newStudent;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        IncomeTransaction incomeTransaction = new IncomeTransaction(1488, "IncomeTransaction#1488", "21/03/2022", 1488.0, 20041900);
        ExpenseTransaction expenseTransaction = new ExpenseTransaction(2488, "ExpenseTransaction#2488", "21/03/2022", 2488.0, ExpenseTransaction.ExpenseCategory.Salary);

        System.out.println(incomeTransaction);
        System.out.println();
        System.out.println(expenseTransaction);

        System.out.println("Please select an option");
        System.out.println("1. Register new student \n 2. Add an expenditure \n 3. Add an income transaction \n 4. Display Cashflow");
        int userinput = sc.nextInt();
        if(userinput == 1){
            addNewStudent();
            System.out.println("New Student Added Successfully");
        }

    }
}
