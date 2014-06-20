package src;


public class MyTime {

    private int hour   = 0;
    private int minute = 0;
    private int second = 0;

    public MyTime(int hour, int minute, int second) {
        setTime(hour, minute, second);
    }

    /**
     * [setTime description]
     * @param hour   [description]
     * @param minute [description]
     * @param second [description]
     */
    public void setTime(int hour, int minute, int second)
    {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    /**
     * [getHour description]
     * @return [description]
     */
    public int getHour() {
        return hour;
    }

    /**
     * [getMinute description]
     * @return [description]
     */
    public int getMinute() {
        return minute;
    }

    /**
     * [getSecond description]
     * @return [description]
     */
    public int getSecond() {
        return second;
    }

    /**
     * [setHour description]
     * @param hour [description]
     */
    public void setHour(int hour) {
        if (hour < 0 || hour > 23) {
            throw new IllegalArgumentException("Not valid hour's value");
        }
        this.hour = hour;
    }

    /**
     * [setMinute description]
     * @param minute [description]
     */
    public void setMinute(int minute) {
        if (minute < 0 || minute > 59) {
            throw new IllegalArgumentException("Not valid minute's value");
        }
        this.minute = minute;
    }

    /**
     * [setSecond description]
     * @param second [description]
     */
    public void setSecond(int second) {
        if (second < 0 || second > 59) {
            throw new IllegalArgumentException("Not valid second's value");
        }
        this.second = second;
    }

    /**
     * [nextSecond description]
     * @return [description]
     */
    public MyTime nextSecond()
    {
        try {
            setTime(hour, minute, ++second);
            return this;
        }
        catch(IllegalArgumentException e) {}

        second = 0;
        return nextMinute();
    }

    /**
     * [nextMinute description]
     * @return [description]
     */
    public MyTime nextMinute()
    {
        try {
            setTime(hour, ++minute, second);
            return this;
        }
        catch(IllegalArgumentException e) {}

        minute = 0;
        return nextHour();
    }

    /**
     * [nextHour description]
     * @return [description]
     */
    public MyTime nextHour()
    {
        try {
            setTime(++hour, minute, second);
            return this;
        }
        catch(IllegalArgumentException e) {}

        hour = 0;
        return this;          
    }

    /**
     * [previousSecond description]
     * @return [description]
     */
    public MyTime previousSecond()
    {
        try {
            setTime(hour, minute, --second);
            return this;
        }
        catch(IllegalArgumentException e) {}

        second = 59;
        return previousMinute();
    }

    /**
     * [previousMinute description]
     * @return [description]
     */
    public MyTime previousMinute() {
        try {
            setTime(hour, --minute, second);
            return this;
        }
        catch(IllegalArgumentException e) {}

        minute = 59;
        return previousHour();
    }

    /**
     * [previousHour description]
     * @return [description]
     */
    public MyTime previousHour() {
        try {
            setTime(--hour, minute, second);
            return this;
        }
        catch(IllegalArgumentException e) {}

        hour = 23;
        return this;
    }

    /**
     * [toString description]
     * @return [description]
     */
    public String toString() {
        return String.format("%1$02d:%2$02d:%3$02d", hour, minute, second);
    }
}   