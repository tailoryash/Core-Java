import java.time.*;

public class LocalDateEx{
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalDate yesterday = date.minusDays(1);
        LocalDate tom = date.plusDays(2);
        System.out.println(date);

        LocalDate ld = LocalDate.now();

        System.out.println(ld.getDayOfMonth());
        System.out.println(ld.getDayOfWeek());
        System.out.println(ld.getDayOfYear());

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
        System.out.println(ldt.getDayOfMonth());
        System.out.println(ldt.getDayOfWeek());
        System.out.println(ldt.getDayOfYear());
        System.out.println(ldt.getSecond());
        System.out.println(ldt.getHour());
        System.out.println(ldt.getMinute());

        LocalDateTime dt = LocalDateTime.of(2022, 5, 12, 12,2);
        System.out.println(dt.minusDays(5));
        LocalDate bday = LocalDate.of(2001, 3, 16);
        LocalDate today = LocalDate.now();
        Period p = Period.between(bday, today);
        System.out.printf("your are is %d years %d months %d days", p.getYears(), p.getMonths(), p.getDays());

        Year y = Year.of(2020);
        System.out.println(y.isLeap());

//        System.out.println(ZoneId.getAvailableZoneIds());
//        System.out.println(zone);
//        System.out.println(zone);
        ZonedDateTime zonedt = ZonedDateTime.now();
        System.out.println(zonedt);

        ZoneId la = ZoneId.of("America/Los_Angeles");
        ZonedDateTime ladt = ZonedDateTime.now(la);
        System.out.println(ladt);
    }
}
