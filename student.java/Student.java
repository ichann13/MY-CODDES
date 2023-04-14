public class Student extends Person {
    String Id = "2022-10929";
    String Major = "BSIT-MAA";
    double gpa = 3.20;

    Student(String Name, String Major, int age, String gender, String email, String Id, double gpa) {
        super(Name, age, gender, email);
        this.Id = Id;
        this.Major = Major;
        this.gpa = gpa;

    }

    public String getDetails() {
        String str = "";
        str = "Name: " + Name + "\nAge: " + age + "\nGender: " + gender + "\nEmail: " + email + "\nId: " + Id
                + "\nMajor: " + Major + "\nGpa: " + gpa;
        return str;

    }

}
