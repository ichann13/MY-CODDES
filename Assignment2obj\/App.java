public class App {
    public static void main(String[] args) throws Exception {
        Person Info = new Person("Christian Suganat", 18, "Male", "ChristianSuganat22@gmail.com");
        Student chan = new Student("Christian Suganat", "BSIT-MAA", 18, "Male", "ChristianSuganat22@gmail.com",
                "2022-109029", 3.20);

        System.out.println(Info.getDetails());
        System.out.println();
        System.out.println(chan.getDetails());

    }
}
