public class Year {

    private int year;

    public void setYear(int i) {
    }

    public static boolean number_devidable_by_4_and_not_100_are_leapyear(int year) {
        if (year % 4 == 0 && year % 100 != 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean number_dividable_by_400_are_leapyear(int year) {
        if (year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean  is_not_dividable_by_4_therefore_not_a_leapyear(int year) {
        if (year % 4 != 0) {
            return true;
        }
        else {
            return false;
        }
    }
    public static boolean is_not_leapyear_when_dividable_100_and_not_400(int year) {
        if (year % 100 == 0 && year % 400 != 0) {
            return true;
        }
        else {
            return false;
        }
    }
}

