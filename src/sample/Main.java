package sample;

import java.util.ArrayList;
import java.util.Scanner;

public class Main  {

    private static ArrayList<Student> students = new ArrayList<>();

    public static Student addNewStudent(){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter student's ID");
        long id = sc.nextLong();
        System.out.println("Enter student's full name");
        String fullname = sc.toString();
        System.out.println("Enter student's age");
        int age = sc.nextInt();
        System.out.println("Enter student's guardian name");
        String guardian = sc.toString();
        System.out.println("Enter date of birth");
        String dob = sc.toString();
        System.out.println("");
        String contact = sc.toString();
        String email = sc.toString();

        Student newStudent = new Student(id,fullname,age,guardian,dob,contact,email);
        students.add(newStudent);
        return newStudent;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please select an option");
        System.out.println("1. Register new student \n 2. Add an expenditure \n 3. Add an income transaction \n 4. Display Cashflow");
        int userinput = sc.nextInt();
        if(userinput == 1){
            System.out.println("Enter student id");
            long studentId = sc.nextLong();
            System.out.println("Enter full name");
            String fullname = sc.toString();
            System.out.println("enter age");
            int age = sc.nextInt();
            System.out.println("enter DOB");




        }
        for(int i = 0; i < students.size(); i++){
            System.out.println(students.get(i));
        }


    }
}
