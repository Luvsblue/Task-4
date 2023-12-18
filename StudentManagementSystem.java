class AgeNotWithinRangeException extends Exception {
    public AgeNotWithinRangeException(String message) {
        super(message);
    }
}

class NameNotValidException extends Exception {
    public NameNotValidException(String message) {
        super(message);
    }
}

class Student {
    private int rollNo;
    private String name;
    private int age;
    private String course;

    public Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException("Age should be between 15 and 21.");
        }

        if (name.matches(".*\\d.*") || name.matches(".*[!@#$%^&*()].*")) {
            throw new NameNotValidException("Name should not contain numbers or special symbols.");
        }

        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }


}

public class StudentManagementSystem {
    public static void main(String[] args) {
        try {
            Student student1 = new Student(1, "Muthu", 18, "Computer Science");
            System.out.println("Student created successfully.");

            Student student2 = new Student(2, "Kumar", 20, "Mathematics");
            System.out.println("Student created successfully.");
        } catch (AgeNotWithinRangeException e) {
            System.out.println("Exception: " + e.getMessage());
        } catch (NameNotValidException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
