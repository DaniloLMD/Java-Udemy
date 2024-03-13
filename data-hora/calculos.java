import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Instant;
import java.time.format.DateTimeFormatter;

import java.time.temporal.ChronoUnit; //TemporalUnit para somar/subtrair em Instants

import java.time.Duration; //para calcular tempo entre dois LocalDateTime ou Instant (nao funciona com LocalDates)
                                                                                    //^ da para fazer funcionar convertendo de LocalDate pra LocalDateTime
public class calculos{
    public static void main(String[] args){
        LocalDate d1 = LocalDate.parse("2004-10-29");
        LocalDateTime d2 = LocalDateTime.parse("2004-10-29T10:00");
        Instant d3 = Instant.parse("2004-10-29T10:00:00Z");

        LocalDate pastWeekLocalDate = d1.minusWeeks(1);
        LocalDate nextWeekLocalDate = d1.plusWeeks(1);

        System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
        System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);

        LocalDateTime nextYearLocalDateTime = d2.plus(1, ChronoUnit.YEARS);
        System.out.println("nextYearLocalDateTime = " + nextYearLocalDateTime);

        Instant nextWeekInstant = d3.plus(7, ChronoUnit.DAYS);
        System.out.println("nextWeekInstant = " + nextWeekInstant);
        
        //duracao entre dois LocalDateTime
        Duration t1 = Duration.between(nextWeekInstant, d3);
        System.out.println("t1 dias = " + t1.toDays());

        //duracao entre dois LocalDate
        Duration t2 = Duration.between(pastWeekLocalDate.atTime(0, 0), nextWeekLocalDate.atStartOfDay());
        System.out.println("t2 dias = " + t2.toDays());
    }
}

/*
    --- METODOS PARA ADICIONAR/SUBTRAIR (presentes em todos menos no Instant)

    .minus
    .plus
    
    ex:
    .minusDays(int qtd)
    .minusWeeks(int qtd)
    .minusMonths(int qtd)
    .minusYears(int qtd)

    .plusDays(int qtd)
    .plusWeeks(int qtd)

    --- METODOS PARA ADICIONAR/SUBTRAIR (presentes no Instant)
    .plus(int qtd, TemporalUnit u)
    .minus(int qtd, TemporalUnit u)

    Utilizar ChronoUnit como Temporal Unit, encontrado em java.time.temporal.ChronoUnit;

    ex:
    adicionando 5 dias:
    .plus(5, ChronoUnit.DAYS);

    removendo 1 semana:
    .minus(1, ChronoUnit.WEEKS);



    --- TEMPO ENTRE DUAS HORAS:
    Duration, encontrado em java.time.Duration

    para efetuar o calculo: .between()
    Duration d = Duration.between(data um, data dois);

    para acessar os membros do calculo: .to()
    d.toDays();
    d.toMinutes();
    d.toSeconds();

    Para calcular entre dois LocalDate, que não possuem campo de horas e minutos, pode-se usar os metodos
    de conversão para LocalDateTime:

    .atTime(int horas, int minutos); //aceita varios campos, até segundos, etc, se nao colocar sao zerados
    ex:
    .atTime(0, 0); //inicia com 0 horas e 0 minutos

    .atStartOfDay(); //inicia com 0 horas e 0 minutos

*/