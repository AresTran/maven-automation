import java.util.Date;

public class Main {
    public static void main(String[] args) {
//        String text = "Hello World";
//        System.out.println(text);
//        System.out.println("Hello World");

        Student stu = new Student();
        stu.setFullName("Thanh An");
        stu.setGender(false);
//        stu.setBirthday("03-11-1990 00:00:00");
        System.out.println(stu.getFullName());
        System.out.println(stu.isGender());

    }
}
