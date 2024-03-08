import java.time.LocalDateTime;

/*
    LocalDateTime:
    - Armazena ano, mes, dia, horas, minutos, segundos e decisegundos

    Formato ISO 8601:
    ano-mes-diaThora:minuto:segundo.decisegundo
               ^ T de time
    exemplo: 08 de março de 2024, 18 horas 29 minutos 32 segundos 475 decisegundos
    2024-03-08T18:29:32.475202592

    (pode-se isolar os campos de decisegundos e segundos, mas não o de horas e minutos)

*/

public class Local_Date_Time {
    public static void main(String[] args) {

        LocalDateTime d = LocalDateTime.now();
        System.out.println(d);
        
        LocalDateTime d2 = LocalDateTime.parse("2024-03-08T18:38:40.0521");
        System.out.println(d2);

        d2 = LocalDateTime.parse("2024-03-08T18:38"); //isolando o campo de segundos e decisegundos
        System.out.println(d2);

        LocalDateTime d3 = LocalDateTime.of(2024, 3, 8, 18, 34, 40, (int) 1e8);
        System.out.println(d3);

        LocalDateTime d4 = LocalDateTime.of(2024, 3, 8, 18, 34); //isolando o campo de segundos e decisegundos
        System.out.println(d4);

    }
}

/*
 
    METODOS:

    LocalDateTime.now();    //pega o horário atual do computador

    LocalDateTime.parse(String text);   //armazena o horário atual no formato ano-mes-dia (ex: 2004-10-29)
    //^^ Da para mudar o formato da string utilizando o DateTimeFormatter (usei no outro arquivo).

    LocalDateTime.of(int year, int month, int day, int hour, minute, int second, int nanosecond); 
        //armazena a data a partir de inteiros (pode-se omitir inteiros, mas deve seguir a ordem)

*/