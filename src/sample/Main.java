package sample;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main  {

    private static ArrayList<Student> students = new ArrayList<>();
    private static ArrayList<ExpenseTransaction> ExpenseTrans = new ArrayList<>();
    private static ArrayList<IncomeTransaction> IncomeTrans = new ArrayList<>();

    static public void generateCashFlow(String startingDate, String endingDate) {
        double totalIncomeAmount = 0.0;
        double totalExpensesAmount = 0.0;

        try {
            Date startingDateObj = new SimpleDateFormat("dd/MM/yyyy").parse(startingDate);
            Date endingDateObj = new SimpleDateFormat("dd/MM/yyyy").parse(endingDate);

            for (int i = 0; i < IncomeTrans.size(); ++i) {
                Date transactionDateObj = new SimpleDateFormat("dd/MM/yyyy").parse(IncomeTrans.get(i).getDate());
                if (transactionDateObj.compareTo(startingDateObj) >= 0 && transactionDateObj.compareTo(endingDateObj) <= 0) {
                    totalIncomeAmount += IncomeTrans.get(i).getAmount();
                }
            }

            for (int i = 0; i < ExpenseTrans.size(); ++i) {
                Date transactionDateObj = new SimpleDateFormat("dd/MM/yyyy").parse(ExpenseTrans.get(i).getDate());
                if (transactionDateObj.compareTo(startingDateObj) >= 0 && transactionDateObj.compareTo(endingDateObj) <= 0) {
                    totalExpensesAmount += ExpenseTrans.get(i).getAmount();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Total income: " + totalIncomeAmount);
        System.out.println("Total expenses: " + totalExpensesAmount);
    }


    public static void addNewIncome(){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter transaction ID");
        long id = sc.nextLong();
        sc.nextLine();
        System.out.println("Enter description");
        String description = sc.nextLine();
        System.out.println("Enter transaction date");
        String date = sc.nextLine();
        System.out.println("Enter amount");
        double amount = sc.nextDouble();
        System.out.println("Enter student ID");
        long studentID = sc.nextLong();

        IncomeTransaction newIncome = new IncomeTransaction(id, description, date, amount, studentID);
        IncomeTrans.add(newIncome);
        for(int i = 0; i < IncomeTrans.size(); i++){
            System.out.println(IncomeTrans.get(i));
        }

    }


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
    public static void addNewExpense(){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter transaction ID");
        long id = sc.nextLong();
        sc.nextLine();
        System.out.println("Enter description");
        String description = sc.nextLine();
        System.out.println("Enter transaction date");
        String date = sc.nextLine();
        System.out.println("Enter amount");
        double amount = sc.nextDouble();
        System.out.println("Enter expense category: 1)Rent \n2)Utilities \n3)Salary");
        int expenseCategory = sc.nextInt();

        if(expenseCategory == 1)
        {
            ExpenseTransaction newExpense = new ExpenseTransaction(id, description, date, amount, ExpenseTransaction.ExpenseCategory.Rent);
            ExpenseTrans.add(newExpense);

        }else if(expenseCategory == 2)
        {
            ExpenseTransaction newExpense = new ExpenseTransaction(id, description, date, amount, ExpenseTransaction.ExpenseCategory.Utilities);
            ExpenseTrans.add(newExpense);

        }else
        {
            ExpenseTransaction newExpense = new ExpenseTransaction(id, description, date, amount, ExpenseTransaction.ExpenseCategory.Salary);
            ExpenseTrans.add(newExpense);

        }


        for(int i = 0; i < ExpenseTrans.size(); i++) {
            System.out.println(ExpenseTrans.get(i));
        }
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
        else if(userinput == 2){
            addNewExpense();
        }
        else if(userinput == 3){
            addNewIncome();
        }
        else if (userinput == 4){
            String str1;
            String str2;

            System.out.print("Enter starting date:\t");
            str1 = sc.nextLine();
            System.out.print("Enter ending date:\t");
            str2 = sc.nextLine();
            generateCashFlow(str1,str2);
        }


            }
}
