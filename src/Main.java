import model.Student;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("YT", 18, "male", "123");
        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getNo());
        System.out.println(student.getSex());
    }
    
}
