package conversor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class ConverteDataParaString {

    public static String formata(LocalDate data){
        return data.format(java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    public static String formata(LocalDateTime dataHora){
        return dataHora.format(java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
    }

    public static String formata(LocalTime hora){
        return hora.format(java.time.format.DateTimeFormatter.ofPattern("HH:mm"));
    }

}
