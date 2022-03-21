package sample;

public class IncomeTransaction extends Transaction {
    private long studentID;

    IncomeTransaction() {
        super();
        super.type = Type.Income;
        this.studentID = -1;
    }

    IncomeTransaction(long ID, String description, String date, double amount, long studentID) {
        super(ID, Type.Income, description, date, amount);
        this.studentID = studentID;
    }

    public long getStudentID() { return studentID; }

    public void setStudentID(long studentID) { this.studentID = studentID; }

    @Override
    public String toString() {
        return "IncomeTransaction {\n" +
                "\tID=" + ID +
                ", type=" + type +
                ", description='" + description + '\'' +
                ", date='" + date + '\'' +
                ", amount=" + amount +
                ", studentID=" + studentID +
                "\n}";
    }
}