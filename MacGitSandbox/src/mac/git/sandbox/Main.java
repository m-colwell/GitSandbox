package mac.git.sandbox;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello Git Sandbox.");
        Date date = new Date();  

        DateFormat formatter = new SimpleDateFormat("dd MMM yyyy HH:mm:ss z");

        String defaultDate = formatter.format(date);
        formatter.setTimeZone(TimeZone.getTimeZone("EST"));  
        String estDate = formatter.format(date);
        formatter.setTimeZone(TimeZone.getTimeZone("EST5EDT"));  
        String edtDate = formatter.format(date);
        // Prints the date in the EST timezone  
        System.out.println(date + " == " + defaultDate + " == " + estDate + " == " + edtDate);  
    }

}
