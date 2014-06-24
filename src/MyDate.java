package src;


public class MyDate {

    private int year;
    private int month;
    private int day;

    private String[] strMonths    = {"Jan", "Feb", "Mar", "Apr", "May", "Jun"
                                    ,"Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

    private String[] strDays      = {"Sunday", "Monday", "Tuesday", "Wednesday"
                                    ,"Thursday", "Friday", "Saturday", "Sunday"};

    private int[]    daysInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};


    public MyDate(int year, int month, int day) {
        setDate(year, month, day);
    }

    public static boolean isLeapYear(int year) {
        return false;
    }

    public static boolean isValidDate(int year, int month, int day) {
        // Between 1 to 9999
        return false;
    }

    public static int getDayOfWeek(int year, int month, int day) {
        return 0;
    }

    public void setDate(int year, int month, int day) {
        this.year  = year;
        this.month = month;
        this.day   = day;
    }

    public int getYear() {
        return this.year;
    }

    public int getMonth() {
        return this.month;
    }

    public int getDay() {
        return this.day;
    }

    public void setYear(int year) {
        if (year < 1 || year > 9999) {
            throw new IllegalArgumentException("Invalid year!");
        }
        this.year = year;
    }

    public void setMonth(int month) {
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Invalid month!");
        }
        this.month = month;
    }

    public void setDay(int day) {
        int monthDay = 31; 
        if (day < 1 || day > monthDay) {
            throw new IllegalArgumentException("Invalid day!");
        }
        this.day = day;
    }

    public MyDate nextDay() {
        return this;
    }

    public MyDate nextMonth() {
        return this;
    }

    public MyDate nextYear() {
        return this;
    }

    public MyDate previousDay() {
        return this;
    }

    public MyDate previousMonth() {
        return this;
    }

    public MyDate previousYear() {
        return this;
    }

    public String toString() {
        // "xxxday d mmm yyyy", e.g., "Tuesday 14 Feb 2012".
        return String.format("%1$s %2$d %3$s %2$d"
            , strDays[day-1], day, strMonths[month-1], year
        );
    }
}   