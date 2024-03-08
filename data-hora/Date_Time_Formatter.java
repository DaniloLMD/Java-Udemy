import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.time.LocalDate;

// Documentacao (java 19): https://download.java.net/java/early_access/panama/docs/api/java.base/java/text/SimpleDateFormat.html
//para achar a documentacao mais nova, digitar no Google: java (versao) date time formatter

/*
    O DateTimeFormatter serve para iniciarmos uma data a partir de uma string formatada.
    É usado como parametro do metodo .parse() dos demais DateTime.

    Exemplo: iniciar uma data com dia/mes/ano
    LocalDate.parse("29/10/2004", DateTimeFormatter.ofPattern("dd/MM/yyyy"));

    Metodos:
    DateTimeFormatter.ofPattern(String pattern);
    recebe a string que sera o padrao da data. Para checar o que cada letra representa, olhar na documentacao.

    Alguns exemplos de letras:
    d	Day in month
    M	Month in year 
    y	Year
    m	Minute in hour
    ^ foi utilizado /MM/ pois o "m" minusculo é reservado para minutos e nao para meses.
*/

public class Date_Time_Formatter {
    public static void main(String[] args){

        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate d1 = LocalDate.parse("29/10/2004", format1);
        System.out.println(d1);
        
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime d2 = LocalDateTime.parse("08/03/2024 19:00", format2);
        System.out.println(d2);


    }
}
