
import java.util.ArrayList;

class Course {
    String courseName;
    String instructor;
    ArrayList<Student> students;

    public Course(String courseName, String instructor, ArrayList<Student> students) {
        if (courseName.length() <= 2) {
            System.out.println("Атың туура жазыңыз");
            this.courseName = "";
        } else {
            this.courseName = courseName;
        }
        this.instructor = instructor;
        this.students = students;
    }

    public void displayCourseInfo() {
        System.out.println("Курс: " + courseName + ", Инструктор: " + instructor);
        System.out.println("Студенттер:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
