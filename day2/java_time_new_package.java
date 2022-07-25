import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class java_time_new_package {
    public static void main(String[] args) {
        LocalDate d = LocalDate.now();
        System.out.println(d);

        LocalTime e = LocalTime.now();
        System.out.println(e);

        LocalDateTime de = LocalDateTime.now();
        System.out.println(de);

        // DateTimeFormatter use to format date and time
        // own type date time format
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy -- E -- H:m a");
        // dd-MM-yyyy ,dd-MM-yyyy -- E
        String myDate = de.format(dtf);// changing data to the particular foemater
        System.out.println(myDate);
        DateTimeFormatter dft2 = DateTimeFormatter.ISO_DATE_TIME;
        String myDate2 = de.format(dft2);// changing data to the particular foemater
        System.out.println(myDate2);
    }
}
