package sample;

public class student {

    //initializers
    private long ID;
    private String fullname;
    private int age;
    private String guardian;
    private String dob;
    private String contact;
    private String email;

    //default constructor
    student()
    {
        ID = 0;
        fullname = "";
        age = 0;
        guardian = "";
        dob = "";
        contact = "";
        email = "";
    }

    //parameterized constructor
    student(long id, String fullname, int age, String guardian, String dob, String contact, String email)
    {
        this.ID = id;
        this.fullname = fullname;
        this.age = age;
        this.guardian = guardian;
        this.dob = dob;
        this.contact = contact;
        this.email = email;
    }

    //getters
    public long getId() { return this.ID; }
    public String getFullname() { return this.fullname; }
    public int getAge() { return this.age; }
    public String getGuardian() { return this.guardian; }
    public String getDob() { return this.dob; }
    public String getContact() { return this.contact; }
    public String getEmail() { return this.email; }

    //setters
    public void setId(long id) { this.ID = id; }
    public void setName(String name) { this.fullname = name; }
    public void setAge(int age) { this.age = age; }
    public void setGuardian(String guardian) { this.guardian = guardian; }
    public void setDob(String dob) { this.dob = dob; }
    public void setContact(String contact) { this.contact = contact; }
    public void setEmail(String email) { this.email = email; }

    //to string
    public String toString()
    {
        String student = "Fullname:" + fullname + "\nAge: " + age +
        "\nGuardian: " + guardian + "\nDate of Birth:" + dob + "\nContact:" +
        contact + "\nEmail: " + email;
        return student;
    }







}
