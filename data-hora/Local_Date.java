import java.time.LocalDate;

/*
    LocalDate:
    - Armazena apenas ano, mes e dia.

    Formato ISO 8601:
    ano-mes-dia
    exemplo: 08 de março de 2024
    2024-03-08 

*/

public class Local_Date {
    public static void main(String[] args){
        
        LocalDate d = LocalDate.now();
        System.out.println(d);


        LocalDate d2 = LocalDate.parse("2004-10-24");
        System.out.println(d2);

        LocalDate d3 = LocalDate.of(2024, 3, 8);
        System.out.println(d3);
    }

}

/*
 
    METODOS:

    LocalDate.now();    //pega o horário atual do computador

    LocalDate.parse(String text);   //armazena o horário atual no formato ano-mes-dia (ex: 2004-10-29)
    //^^ Da para mudar o formato da string utilizando o DateTimeFormatter (usei no outro arquivo).

    LocalDate.of(int year, int month, int day);     //armazena a data a partir de inteiros
    (pode-se omitir inteiros, mas deve seguir a ordem)

*/