package Task2;

public class Main {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Symbat", 18, "Java"),
                new Student("Aidar", 19, "Js"),
                new Student("Alina", 20, "Java"),
                new Student("Bektur", 22, "Js"),
                new Student("Meerim", 21, "Java")
        };

        int javaCount = 0;
        int jsCount = 0;

        for (Student student : students) {
            if (student.group.equals("Java")) {
                javaCount++;
            } else if (student.group.equals("Js")) {
                jsCount++;
            }
        }


//        Task3
        int ages = 0;
        for (Student forage : students){
            ages += forage.getAges();

        }
        System.out.println("avarage age: " + (ages / 5));


        System.out.println("Java: " + javaCount);
        System.out.println("Js: " + jsCount);
    }
}
