class Student {
    String name;
    int age;
    int wordCount;

    public Student(String name, int age, int wordCount) {
        this.name = name;
        if (age < 16) {
            System.out.println(name + " окууга мүмкүнчүлүгү жок.");
            this.wordCount = 0; // Мааниси 0 болот
        } else {
            this.age = age;
            this.wordCount = wordCount;
        }
    }
    public  String toString() {
        return "Student{name='" + name + "', age=" + age + ", wordCount=" + wordCount + "}";
    }
}