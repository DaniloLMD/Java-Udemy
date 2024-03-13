import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Instant;
import java.time.format.DateTimeFormatter;

// Metodos Get do LocalDate e LocalDateTime para retornar dia, mes, ano, etc

public class getters {
    public static void main(String[] args) {
        LocalDate d1 = LocalDate.parse("2004-10-29");
        LocalDateTime d2 = LocalDateTime.parse("2004-10-29T18:30:00.31");
        
        System.out.println("D1 Dia do mes = " + d1.getDayOfMonth());
        System.out.println("D1 Dia da semana = " + d1.getDayOfWeek());
        System.out.println("D1 Mes = " + d1.getMonth());
        System.out.println("D1 Mes Value = " + d1.getMonthValue());
        System.out.println("D1 Ano = " + d1.getYear()); 

        System.out.println();

        System.out.println("D2 day = " + d2.getDayOfMonth());
        System.out.println("D2 month = " + d2.getMonthValue());
        System.out.println("D2 year = " + d2.getYear());
        System.out.println("D2 hour = " + d2.getHour());
        System.out.println("D2 minute = " + d2.getMinute());
        System.out.println("D2 second = " + d2.getSecond());
        System.out.println("D2 nano = " + d2.getNano());
    }
}
