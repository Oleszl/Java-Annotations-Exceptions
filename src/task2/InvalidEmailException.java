package task2;

public class InvalidEmailException extends Exception {
    private String email;

    public InvalidEmailException(String message, String email) {
        super(message);
        this.email = email;
    }

    public void getErrorDetails() {
        System.out.printf("Your email [%s] is incorrect", email);
    }
}
