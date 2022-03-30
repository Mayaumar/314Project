package sample;
 //hello change
public class Transaction {
    //initializers
    enum Type {Income, Expense, Not_Defined};

    protected long ID;
    protected Type type;
    protected String description;
    protected String date;
    protected double amount;

    //default constructor
    Transaction()
    {
        ID = -1;
        type = Type.Not_Defined;
        description = "";
        date = "";
        amount = -1;
    }

    //parameterized constructor
    Transaction(long id, Type type, String description, String date, double amount)
    {
        this.ID = id;
        this.type = type;
        this.description = description;
        this.date = date;
        this.amount = amount;
    }

    //getters
    public long getId() { return this.ID; }
    public Type getType() { return this.type; }
    public String getDescription() { return this.description; }
    public String getDate() { return this.date; }
    public double getAmount() { return this.amount; }

    //setters
    public void setId(long id) { this.ID = id; }
    public void setType(Type tp) { this.type = tp; }
    public void setDescription(String desc) { this.description = desc; }
    public void setDate(String date) { this.date = date; }
    public void setAmount(double amount) { this.amount = amount; }

    @Override
    public String toString() {
        return "Transaction {\n" +
                "\tID=" + ID +
                ", type=" + type +
                ", description='" + description + '\'' +
                ", date='" + date + '\'' +
                ", amount=" + amount +
                "\n}";
    }
}