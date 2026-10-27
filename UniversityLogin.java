public class UniversityLogin {
    public void login(String username) {
        if (username == null) {
            throw new NullPointerException("Username cannot be null");
        }
        System.out.println("Login successful for: " + username);
    }

    public static void main(String[] args) {
        UniversityLogin ul = new UniversityLogin();
        String username = null;

        System.out.println("Enter username: " + username);

        try {
            ul.login(username);
        } catch (NullPointerException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}