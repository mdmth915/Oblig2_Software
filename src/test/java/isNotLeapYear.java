import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class isNotLeapYear {

    @Test
    public void number_is_not_leapyear_when_not_dividable_by_4() {
        Year year = new Year();
        year.setYear(2003);

        assertTrue(Year.is_not_dividable_by_4_therefore_not_a_leapyear(2003), "Its not a leapyear when not dividable by 4");
    }

    @Test
    public void number_is_not_leapyear_when_dividable_by_100_and_not_400() {
        assertTrue(Year.is_not_leapyear_when_dividable_100_and_not_400(1700), "Its not a leapyear when dividable by 100 and not 400");

    }
}
