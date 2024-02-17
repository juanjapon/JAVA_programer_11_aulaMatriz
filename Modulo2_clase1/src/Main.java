import java.time.*;
import java.time.temporal.ChronoUnit;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        LocalDateTime localDateTime=LocalDateTime.now();
        //Thread.sleep(80);
        LocalDateTime localDateTime1=LocalDateTime.now();
        System.out.println(localDateTime.compareTo(localDateTime1));
        System.out.println(localDateTime.isAfter(localDateTime1));
        System.out.println(localDateTime.isBefore(localDateTime1));
        System.out.println("________________________________________");

        Instant instant=Instant.now();
        System.out.println("Fecha zulu= "+instant);
        System.out.println(instant.plus(1, ChronoUnit.DAYS));

        System.out.println("____________________________________________");
        ZonedDateTime zonedDateTime=ZonedDateTime.now();
        System.out.println(zonedDateTime);
        ZoneId zoneId=ZoneId.of("Europe/Madrid");
        ZonedDateTime zonaMadrid=ZonedDateTime.now(zoneId);
        System.out.println("hora madrid= "+zonaMadrid);




    }

}