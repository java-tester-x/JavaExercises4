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

    public boolean isLeapYear(int year) {
        return false;
    }

    public boolean isValidDate(int year, int month, int day) {
        return false;
    }

    public int getDayOfWeek(int year, int month, int day) {
        return 0;
    }

    public void setDate(int year, int month, int day) {
        this.year  = year;
        this.month = month;
        this.day   = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public void setYear() {
        // 
    }

    public void setMonth() {
        // 
    }

    public void setDay() {
        // 
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