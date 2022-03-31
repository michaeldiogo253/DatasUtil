package conversor.test;

import conversor.ConverteDataParaString;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class ConverteDataParaStringTest {

    @Test
    void deveConverterLocalDateParaStringBr(){

        LocalDate data = LocalDate.of(2022,1,17);
        String dataFormatada = ConverteDataParaString.formata(data);

        assertEquals(dataFormatada, "17/01/2022");
    }

    @Test
    void deveConverterLocalDateTimeParaStringBr(){

        LocalDateTime data = LocalDateTime.of(2022, 1, 17, 12,0);
        String dataFormatada = ConverteDataParaString.formata(data);

        assertEquals(dataFormatada, "17/01/2022 12:00");
    }

    @Test
    void deveConverterLocalTimeParaStringBr(){

        LocalTime hora = LocalTime.of( 12, 0);
        String horaFormatada = ConverteDataParaString.formata(hora);

        assertEquals(horaFormatada, "12:00");
    }
}