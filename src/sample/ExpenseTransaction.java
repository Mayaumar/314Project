package sample;

public class ExpenseTransaction extends Transaction {
    enum ExpenseCategory {Rent, Utilities, Salary, Not_Defined};

    private ExpenseCategory category;

    ExpenseTransaction() {
        super();
        super.type = Type.Expense;
        this.category = ExpenseCategory.Not_Defined;
    }

    ExpenseTransaction(long ID, String description, String date, double amount, ExpenseCategory category) {
        super(ID, Type.Expense, description, date, amount);
        this.category = category;
    }

    @Override
    public String toString() {
        return "ExpenseTransaction {\n" +
                "\tID=" + ID +
                ", type=" + type +
                ", description='" + description + '\'' +
                ", date='" + date + '\'' +
                ", amount=" + amount +
                ", category=" + category +
                "\n}";
    }
}
