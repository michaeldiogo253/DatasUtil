package conversor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ConverteStringParaDate {

    public static LocalDate converteStringBrComTracoParaLocalDate(String dataPadraoBr){
        return LocalDate.parse(dataPadraoBr, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    }

    public static LocalDate converteStringBrComBarraParaLocalDate(String dataPadraoBr){
        String dataComTraco = dataPadraoBr.replace("/","-");
        return LocalDate.parse(dataComTraco, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    }

    public static LocalDate converteStringAmericanaComTracoParaLocalDate(String dataPadraoAmericano){
        return LocalDate.parse(dataPadraoAmericano, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }

    public static LocalTime toLocalTime(String horario){
        return LocalTime.parse(horario, DateTimeFormatter.ofPattern("HH-mm"));
    }

    public static LocalDateTime toLocalDateTime(String data, String horario){
        return LocalDateTime.parse(data + "-" + horario, DateTimeFormatter.ofPattern("dd-MM-yyyy-HH-mm"));
    }
}
