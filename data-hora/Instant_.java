import java.time.Instant;

/*
    Instant:
    - Armazena ano, mes, dia, horas, minutos, segundos e decisegundos
    - Em vez de ser no horário do computador, acessa o horário de Londres (GMT 0), Zulu Time

    Formato ISO 8601:
    ano-mes-diaThora:minuto:segundo.decisegundoZ
               ^ T de time                     ^ Z de Zulu Time (horario de londres, GMT 0)
    exemplo: 08 de março de 2024, 21 horas 29 minutos 32 segundos 475 decisegundos
    2024-03-08T21:29:32.475202592Z

    (pode-se isolar campos, como decisegundos, segundos)

*/


public class Instant_ {
    public static void main(String[] args) {
        Instant d = Instant.now();

        System.out.println(d);

        Instant d2 = Instant.parse("2024-03-08T21:29:32.475202592Z");
        System.out.println(d2);

    }
}


/*
 
    METODOS:

    Instant.now();    //pega o horário atual do computador

    Instant.parse(String text);   //armazena o horário atual no formato ano-mes-dia (ex: 2004-10-29)
    //^^ Da para mudar o formato da string utilizando o DateTimeFormatter (usei no outro arquivo).

*/
