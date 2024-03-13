import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.LocalDate;
import java.time.Instant;
import java.time.format.DateTimeFormatter;;


public class timezone {
    public static void main(String[] args){

        Instant d1 = Instant.parse("2004-10-29T02:00:00Z");
        LocalDate d2 = LocalDate.ofInstant(d1, ZoneId.systemDefault()); //horario d1 no brasil
        LocalDateTime d3 = LocalDateTime.ofInstant(d1, ZoneId.of("Portugal")); //horario d1 em portugal
        
        //printa todas as timezones disponiveis
        /*for(String s: ZoneId.getAvailableZoneIds()){
            System.out.println(s);
        }*/

        System.out.println("D2: D1 em Goiania = " + d2);
        System.out.println("D3: D1 em Portugal = " + d3);

    }
}

/*
    METODOS
    ZoneId.getAvailableZoneIds(); //retorna strings com todos os timezones disponiveis

    .ofInstant( Instant, Timezone);
    Metodo do LocalDate e LocalDateTime para converter um Instant para o timezone desejado

    ZoneId.systemDefault(); //retorna o Timezone do computador
    ZoneId.of(String); //retorna o Timezone referente à string, usar o ZoneId.getAvailableIds() para 
    ver todas as strings existentes. Ex: "Portugal", "Brazil/Acre"
*/
