public class Person {

    public static char[] getDetails;
    String Name = "Christian Suganat";
    int age = 18;
    String gender = "male";
    String email = "ChristianSuganat22@gmail.com";

    Person(String Name, int age, String gender, String email) {

        this.Name = Name;
        this.age = age;
        this.gender = gender;
        this.email = email;
    }

    public String getDetails() {

        String str = "";
        str += "Name: " + Name + "\nAge: " + age + "\nGender: " + gender + "\nEmail: " + email;
        return str;
    }

}
