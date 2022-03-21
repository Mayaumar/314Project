package sample;

import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        Student s1 = new Student(1000001, "Alex Smith", 7, "Marie Smith", "01/01/2015", "+971-52-000-0000", "MSmith@gmail.com");
        System.out.println(s1);
        System.out.println();

        IncomeTransaction incomeTransaction = new IncomeTransaction(1488, "IncomeTransaction#1488", "21/03/2022", 1488.0, 20041900);
        ExpenseTransaction expenseTransaction = new ExpenseTransaction(2488, "ExpenseTransaction#2488", "21/03/2022", 2488.0, ExpenseTransaction.ExpenseCategory.Salary);

        System.out.println(incomeTransaction);
        System.out.println();
        System.out.println(expenseTransaction);
    }
}