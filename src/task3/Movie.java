package task3;

import java.time.LocalDate;

public class Movie {
    private String title;
    private int year;

    public Movie(String title, int year) throws InvalidYearException {
        this.title = title;
        setYear(year);
    }

    public void setYear(int year) throws InvalidYearException {
        int currentYear = LocalDate.now().getYear();
        if (year < 1900 || year > currentYear) {
            throw new InvalidYearException("Provided year is invalid. Year should be greater than" +
                                           " 1900 and smaller than " + currentYear);
        }
        this.year = year;
    }

}
