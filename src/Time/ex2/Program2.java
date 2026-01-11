package Time.ex2;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Program2 {

    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2026-01-10");
        LocalDateTime d05 = LocalDateTime.parse("2026-01-10T21:04:36");
        Instant d06 = Instant.parse("2026-01-10T21:04:36Z");

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        DateTimeFormatter dtf4 = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter dtf5 = DateTimeFormatter.ISO_INSTANT;



        System.out.println("d04: " + d04.format(dtf1));
        System.out.println("d04: " + dtf1.format(d04));
        System.out.println("d04: " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        System.out.println("d05: " + d05.format(dtf1));
        System.out.println("d05: " + d05.format(dtf2));
        System.out.println("d05: " + d05.format(dtf4));

        System.out.println("d06: " + dtf3.format(d06));
        System.out.println("d06: " + dtf5.format(d06));
        System.out.println("d06: " + d06.toString());


    }
}
