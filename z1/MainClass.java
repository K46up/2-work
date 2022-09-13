package z1;

public class MainClass {
    public static void main(String[] args) {
        Student student = new Student("Maksim", "Ogurtsov", "PKS-419", 4.5);
        Aspirant aspirant = new Aspirant("Sergey", "Zorin", "PKS-419", 4, "drone");
        Student un = new Aspirant("Ivan", "Ivanov", "PKS-419", 5, "aboutSpace");
        Student[] students = { student, aspirant, un };

        for (Student s : students)
            System.out.println(s.getScholarship());
    }
}
