package task2;

import java.lang.reflect.Field;
import java.util.regex.Pattern;

public class User {
    private String firstName;
    private String lastName;
    @ValidEmail
    private String email;
    private String password;

    public User(String firstName, String lastName, String email, String password) throws InvalidEmailException, IllegalAccessException {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        validateEmailAddress();
    }

    public String getEmail() {
        return email;
    }

    private void validateEmailAddress() throws InvalidEmailException, IllegalAccessException {
        Pattern pattern = Pattern.compile("\\b[\\w.%-]+@[-.\\w]+\\.[A-Za-z]{2,4}\\b");

        for (Field field : User.class.getDeclaredFields()) {
            if (field.isAnnotationPresent(ValidEmail.class)) {
                String email = (String) field.get(this);
                if (!pattern.matcher(email).matches())
                    throw new InvalidEmailException("Email address is invalid!", email);
            }
        }
    }
}
