
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

class Voter {
    private int voterId;
    private String name;
    private int age;

    public Voter(int voterId, String name, int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Invalid age for voter");
        }

        this.voterId = voterId;
        this.name = name;
        this.age = age;
    }

    // Other methods and getters/setters here
}

public class VoterManagementSystem {
    public static void main(String[] args) {
        try {
            Voter voter1 = new Voter(1, "Sasi", 20);
            System.out.println("Voter created successfully.");

            Voter voter2 = new Voter(2, "Muthu", 16);
            System.out.println("Voter created successfully.");
        } catch (InvalidAgeException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
