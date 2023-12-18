import java.util.HashMap;

public class StudentGrades {
    private HashMap<String, Integer> studentGrades;

    public StudentGrades() {
        studentGrades = new HashMap<>();
    }

    public void addStudent(String name, int grade) {
        studentGrades.put(name, grade);
    }

    public void removeStudent(String name) {
        studentGrades.remove(name);
    }

    public void displayGrade(String name) {
        if (studentGrades.containsKey(name)) {
            int grade = studentGrades.get(name);
            System.out.println(name + "'s grade is: " + grade);
        } else {
            System.out.println("Student not found.");
        }
    }

    public static void main(String[] args) {
        StudentGrades grades = new StudentGrades();

        grades.addStudent("Muthu", 90);
        grades.addStudent("Sasi", 85);
        grades.addStudent("Rathish", 95);

        grades.displayGrade("Muthu");
        grades.displayGrade("Sasi");
        grades.displayGrade("Rathish");
        grades.displayGrade("Dinesh");

        grades.removeStudent("Sasi");
        grades.displayGrade("Sasi");
    }
}
