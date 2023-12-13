public class SampleApp {

    public static void main(String[] args) {
        String password = "mySecretPassword";
        authenticate(password);
    }

    public static void authenticate(String enteredPassword) {
        String storedPassword = "mySecretPassword";

        if (enteredPassword.equals(storedPassword)) {
            System.out.println("Authentication successful!");
        } else {
            System.out.println("Authentication failed!")
        }
    }
}
