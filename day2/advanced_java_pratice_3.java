import java.util.Calendar;

public class advanced_java_pratice_3 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.HOUR_OF_DAY) + " " + c.get(Calendar.MINUTE) + " " + c.get(Calendar.SECOND));
    }
}
