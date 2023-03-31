package task1;

import java.lang.reflect.Field;

public class ImmutablePerson {
    @ReadOnly
    private String firstName;
    @ReadOnly
    private int age;

    public ImmutablePerson(String firstName, int age) {
        this.firstName = firstName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String firstName) {
        String fieldName = "firstName";
        validateReadOnlyField(fieldName);
        this.firstName = firstName;
    }

    public void setAge(int age) {
        String fieldName = "age";
        validateReadOnlyField(fieldName);
        this.age = age;
    }

    private void validateReadOnlyField(String fieldName) {
        try {
            Field firstNameField = ImmutablePerson.class.getDeclaredField(fieldName);
            if (firstNameField.isAnnotationPresent(ReadOnly.class))
                System.out.printf("Field [%s] is read-only!\n", fieldName);

        } catch (NoSuchFieldException e) {
            System.out.printf("Field [%s] doesn't exist\n", fieldName);
        }
    }
}
