import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    private final Main testing = new Main();

    @Test
    void longData1() {
        String longData = testing.longData(OffsetDateTime.parse("2023-03-01T13:00:00Z"));
        assert longData.equals("01 marzo 2023") : "La data è sbagliata";
    }

    @Test
    void longData2() {
        String longData = testing.longData(OffsetDateTime.parse("2022-01-12T13:00:00Z"));
        assert longData.equals("12 gennaio 2022") : "La data è sbagliata";
    }

    @Test
    void longData3() {
        String longData = testing.longData(OffsetDateTime.parse("1989-12-08T13:00:00Z"));
        assert longData.equals("08 dicembre 1989") : "La data è sbagliata";
    }

    @Test
    void longData4() {
        String longData = testing.longData(OffsetDateTime.parse("2010-01-02T13:00:00Z"));
        assert longData.equals("02 gennaio 2010") : "La data è sbagliata";
    }
}