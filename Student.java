class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class Student {
    public void registerStudent(String name, int age) throws InvalidAgeException {
        if (age < 17) {
            throw new InvalidAgeException("Age must be above 17 for registration");
        }
        System.out.println("Student " + name + " registered successfully.");
    }

    public static void main(String[] args) {
        Student student = new Student();
        String name = "Rohan";
        int age = 15;

        System.out.println("Enter name: " + name);
        System.out.println("Enter age: " + age);

        try {
            student.registerStudent(name, age);
        } catch (InvalidAgeException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}