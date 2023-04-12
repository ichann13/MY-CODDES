public class Student {

    int StudentNumber;
    String StudentName;
    String Course;
    String Year;

    public void getStudentDetails(int StNum, String StName, String StCourse, String STyear) {

        StudentNumber = StNum;
        Year = STyear;
        StudentName = StName;
        Course = StCourse;

    }

    public void showStDetails() {
        System.out
                .print("Student No.: " + StudentNumber + "\n" + "Year: " + Year + "\n" + "Student Name: " + StudentName
                        + "\n" + "Course: " + Course);

    }

    public static void main(String[] args) throws Exception {

        Student chan = new Student();

        chan.getStudentDetails(109029, "Christian Suganat", "BSIT-MAA", "FIRST YEAR");
        chan.showStDetails();

    }
}
