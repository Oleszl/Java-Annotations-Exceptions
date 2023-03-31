package task1.approach2;

public class ImmutablePerson {
    @ReadOnly
    private final String firstName;
    @ReadOnly
    private final int age;

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

    @Override
    public String toString() {
        return "ImmutablePerson{" +
               "firstName='" + firstName + '\'' +
               ", age=" + age +
               '}';
    }
}
