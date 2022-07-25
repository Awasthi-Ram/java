import java.util.*;

// old used

public class calenderc_class {
    public static void main(String[] args) {
        // calender class is abstract class
        Calendar c = Calendar.getInstance();
        System.out.println(c.getCalendarType());
        System.out.println(c.getFirstDayOfWeek());
        System.out.println(c.getTimeZone());
        // to change time zone or own calender
        Calendar d = Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapur")); // shearch time zone id on google
        System.out.println(d.getCalendarType());
        System.out.println(d.getFirstDayOfWeek());
        System.out.println(d.getTimeZone());
        System.out.println(d.getTimeZone().getID());
        System.out.println(d.getTime());
        System.out.println(d.get(Calendar.DATE));
        System.out.println(d.get(Calendar.SECOND));
        System.out.println(d.get(Calendar.HOUR));
        System.out.println(d.get(Calendar.HOUR_OF_DAY));
        System.out.println(d.get(Calendar.HOUR_OF_DAY) + " :" + d.get(Calendar.MINUTE) + ": " + d.get(Calendar.SECOND));

        // gregorian calender
        GregorianCalendar cal = new GregorianCalendar();
        System.out.println(cal.isLeapYear(5600));
        System.out.println(cal.after(cal));
        // System.out.println(cal.get(56));

        // time Zone use to syn the diffrent time zone
        TimeZone tz;
        System.out.println(TimeZone.getAvailableIDs()[0]);// gave Africa/Abidjan
        System.out.println(TimeZone.getAvailableIDs()[1]);// gave Africa/Accra
        System.out.println(TimeZone.getAvailableIDs()[2]);
        System.out.println(TimeZone.getDefault());

    }
}
