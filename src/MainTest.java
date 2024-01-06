import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");

    @Test
    void data() {
        assertEquals("2023", String.valueOf(data.getYear()));
        assertEquals("MARCH", String.valueOf(data.getMonth()));
        assertEquals("1", String.valueOf(data.getDayOfMonth()));
        assertEquals("WEDNESDAY", String.valueOf(data.getDayOfWeek()));
    }
}