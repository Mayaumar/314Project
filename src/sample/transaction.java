package sample;

public class transaction {

    //initializers
    enum type {Income, Expense};
    private long ID;
    private type types;
    private String description;
    private String date;
    private long studentID;
    private double amount;

    //default constructor
    transaction()
    {
        ID = 0;
        types = type.Income;
        description = "";
        date = "";
        studentID = 0;
        amount = 0;
    }

    //parameterized constructor
    transaction(long id, types theType , String description, String date, long studID, double amount)
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
    public types getType() { return this.types; }
    public String getDescription() { return this.description; }
    public String getDate() { return this.date; }
    public long getStudentID() { return this.studentID; }
    public double getAmount() { return this.amount; }

    //setters
    public void setId(long id) { this.ID = id; }
    public void setType(types tp) { this.types = tp; }
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
        return student;
    }


}
