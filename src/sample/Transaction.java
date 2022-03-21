package sample;

public class Transaction {

    //initializers
    enum Type {Income, Expense};
    private long ID;
    private Type types;
    private String description;
    private String date;
    private long studentID;
    private double amount;

    //default constructor
    Transaction()
    {
        ID = 0;
        types = Type.Income;
        description = "";
        date = "";
        studentID = 0;
        amount = 0;
    }

    //parameterized constructor
    Transaction(long id, Type theType , String description, String date, long studID, double amount)
    {
        this.ID = id;
        this.types = theType;
        this.description = description;
        this.date = date;
        this.studentID = studID;
        this.amount = amount;
    }

    //getters
    public long getId() { return this.ID; }
    public Type getType() { return this.types; }
    public String getDescription() { return this.description; }
    public String getDate() { return this.date; }
    public long getStudentID() { return this.studentID; }
    public double getAmount() { return this.amount; }

    //setters
    public void setId(long id) { this.ID = id; }
    public void setType(Type tp) { this.types = tp; }
    public void setDescription(String desc) { this.description = desc; }
    public void setDate(String date) { this.date = date; }
    public void setStudentID(long studID) { this.studentID = studID; }
    public void setAmount(double amount) { this.amount = amount; }


    //to string
    public String toString()
    {
        String transaction = "ID:" + ID + "\nType: " + types +
                "\nDescription: " + description + "\nDate:" + date + "\nStudent ID:" +
                studentID + "\nAmount: " + amount;
        return transaction;
    }


}
