import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.Instant;

/*
    Para impressão de datas formatadas, utilizamos o método .format(), disponivel tanto no DateTimeFormatter tanto
    como nas classes de datas (exceto na Instant)

    ex:
    LocalDate.format( DateTimeFormatter );
    DateTimeFormatter.format( LocalDate );

    Para formatar um Instant, acessar ele atraves do .format do Formatter.
    OBS: O formatter precisa estar com uma zona para poder formatar uma classe do tipo Instant, utilizando o metodo:
    .withZone();
    ZoneId.systemDefault() pega a zona do computador, portanto para exibir o Instant no horario do computador fazer:
    .withZone(ZoneId.SystemDefault());

*/

public class format {
    public static void main(String[] args) {
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate d1 = LocalDate.parse("29/10/2004", format1);

        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime d2 = LocalDateTime.parse("29/10/2004 18:00", format2);

        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        Instant d3 = Instant.parse("2004-10-29T18:00:30Z");

        System.out.println("D1: " + d1);
        System.out.println("D1 + format1: " + d1.format(format1));

        System.out.println("D2: " + d2);
        System.out.println("D2 + format1: " + d1.format(format1));
        System.out.println("D2 + format2: " + d2.format(format2));

        System.out.println("D3: " + d3);
        System.out.println("D3 + format3: " + format3.format(d3));
    }
}
