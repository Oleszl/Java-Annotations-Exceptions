import task1.ImmutablePerson;
import task2.InvalidEmailException;
import task2.User;
import task3.InvalidYearException;
import task3.Movie;

public class Main extends Thread {

    public static void main(String[] args) {
        ImmutablePerson immutablePerson = new ImmutablePerson("Oles", 22);
        immutablePerson.setFirstName("Andrii"); // Field [firstName] is read-only!
        immutablePerson.setAge(22); // Field [age] is read-only!

        try {
            User user1 = new User("Oles", "Sukmanovskyi", "oles.sukmanovskyi@gmail.com", "123a");
            User user2 = new User("Ihor", "Bodnar", "i.bodnar.gmail.com", "123a");
        } catch (InvalidEmailException e) {
            e.getErrorDetails();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }


        try {
            Movie movie1 = new Movie("The Lord of the Rings 2", 2001);
            Movie movie2 = new Movie("The Lord of the Rings 1",1880);
        } catch (InvalidYearException e) {
            e.printStackTrace();
        }
    }
}
