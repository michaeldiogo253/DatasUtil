package conversor.test;

import conversor.ConverteStringParaDate;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import static org.junit.jupiter.api.Assertions.*;

class ConverteStringParaDateTest {

    @Test
    void deveConverterStringBrComTracoParaLocalDate(){
        String data = "10-03-2022";
        LocalDate localDate = ConverteStringParaDate.converteStringBrComTracoParaLocalDate(data);
        assertEquals(localDate, LocalDate.of(2022,3,10));
    }

    @Test
    void deveConverterStringBrComBarraParaLocalDate(){
        String data = "10/03/2022";
        LocalDate localDate = ConverteStringParaDate.converteStringBrComBarraParaLocalDate(data);
        assertEquals(localDate, LocalDate.of(2022,3,10));
    }

    @Test
    void deveConverteStringAmericanaComTracoParaLocalDate(){
        String data = "2022-03-17";
        LocalDate localDate = ConverteStringParaDate.converteStringAmericanaComTracoParaLocalDate(data);
        assertEquals(localDate, LocalDate.of(2022,3,17));
    }

    @Test
    void deveConverteStringHoraParaLocalTime(){
        String hora = "12-00";
        LocalTime localTime = ConverteStringParaDate.toLocalTime(hora);
        assertEquals(localTime, LocalTime.of(12,0));
    }

    @Test
    void deveConverteStringDataEHoraParaLocalDateTime(){
        String data = "17-03-2022";
        String hora = "12-00";
        LocalDateTime localDateTime = ConverteStringParaDate.toLocalDateTime(data, hora);
        assertEquals(localDateTime, LocalDateTime.of(2022,3,17,12,0));
    }
}