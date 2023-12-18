public class Weekdays {
    public static void main(String[] args) {
        String [] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        int dayPosition = 2;

        if (dayPosition >= 0 && dayPosition <= 6) {
            String weekday = weekdays[dayPosition];
            System.out.println("The weekday at position " + dayPosition + " is: " + weekday);
        } else {
            System.out.println("Invalid day position. Please enter a value between 0 and 6.");
        }
    }
}

