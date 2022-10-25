import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class isLeapYear {

    @Test
    public void number_is_leapyear_when_dividable_by_4_and_not_100() {
        assertTrue(Year.number_devidable_by_4_and_not_100_are_leapyear(2004), "Its a leap year, when dividable by 4 and not 100");
    }

    @Test
    public void is_number_dividable_by_400() {
        assertTrue(Year.number_dividable_by_400_are_leapyear(2000), "Its a leap year, when dividable by 400");
    }

}




