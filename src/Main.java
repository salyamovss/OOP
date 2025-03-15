import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Student student1;
        student1 = new Student

                ("Айжан", 17, 500);
        Student student2 = new Student("Бакыт", 15, 300);
        Student student3 = new Student("Эржан", 18, 700);

        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);

        Course course = new Course("Java", "Асель", students);
        course.displayCourseInfo();
    }
}