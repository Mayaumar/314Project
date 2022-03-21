package sample;

public class Student {

    //initializers
    private long ID;
    private String fullName;
    private int age;
    private String guardian;
    private String dob;
    private String contact;
    private String email;

    //default constructor
    Student()
    {
        ID = 0;
        fullName = "";
        age = 0;
        guardian = "";
        dob = "";
        contact = "";
        email = "";
    }

    //parameterized constructor
    Student(long id, String fullName, int age, String guardian, String dob, String contact, String email)
    {
        this.ID = id;
        this.fullName = fullName;
        this.age = age;
        this.guardian = guardian;
        this.dob = dob;
        this.contact = contact;
        this.email = email;
    }

    //getters
    public long getId() { return this.ID; }
    public String getFullName() { return this.fullName; }
    public int getAge() { return this.age; }
    public String getGuardian() { return this.guardian; }
    public String getDob() { return this.dob; }
    public String getContact() { return this.contact; }
    public String getEmail() { return this.email; }

    //setters
    public void setId(long id) { this.ID = id; }
    public void setName(String name) { this.fullName = name; }
    public void setAge(int age) { this.age = age; }
    public void setGuardian(String guardian) { this.guardian = guardian; }
    public void setDob(String dob) { this.dob = dob; }
    public void setContact(String contact) { this.contact = contact; }
    public void setEmail(String email) { this.email = email; }

    //to string
    public String toString()
    {
        String student = "Fullname: " + fullName + "\nAge: " + age +
        "\nGuardian: " + guardian + "\nDate of Birth: " + dob + "\nContact: " +
        contact + "\nEmail: " + email;
        return student;
    }
}