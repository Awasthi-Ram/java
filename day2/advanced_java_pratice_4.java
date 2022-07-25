import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class advanced_java_pratice_4 {
    public static void main(String[] args) {
        LocalDateTime t = LocalDateTime.now();
        System.out.println(t);

        DateTimeFormatter dt = DateTimeFormatter.ofPattern("H :M:S");
        String mydate = t.format(dt);
        System.out.println(mydate);
    }
}
