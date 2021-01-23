
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class DateDemo {

    public long newDate() throws ParseException {

        long currentMilliSeconds = new SimpleDateFormat("yyyy-MM-dd").parse("1990-05-10").getTime();

        System.out.println("Current Milliseconds since Given Date " + currentMilliSeconds);

        return currentMilliSeconds;

    }

    public static Date parseDate(String date) {
        try {
            return new SimpleDateFormat("yyyy-MM-dd").parse(date);
        } catch (ParseException e) {
            return null;
        }
    }

}