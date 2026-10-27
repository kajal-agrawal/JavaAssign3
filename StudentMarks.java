public class StudentMarks {
    public void enterMarks(int marks) throws Exception {
        if (marks < 0 || marks > 100) {
            throw new Exception("Marks must be between 0 and 100");
        }
        System.out.println("Marks recorded: " + marks);
    }

    public static void main(String[] args) {
        StudentMarks sm = new StudentMarks();
        int marks = 105;

        System.out.println("Enter marks: " + marks);

        try {
            sm.enterMarks(marks);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("Thank you for using the system");
        }
    }
}