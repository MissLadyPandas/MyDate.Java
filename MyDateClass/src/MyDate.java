
//+------------------------------------------+
//|                MyDate                    |
//+------------------------------------------+
//| -year: int                               |
//| -month: int                              |
//| -day: int                                |
//+------------------------------------------+
//| +MyDate()                                |
//| +MyDate(elapsedTime: long)               |
//| +MyDate(year: int, month: int, day: int) |
//| +getYear(): int                          |
//| +getMonth(): int                         |
//| +getDay(): int                           |
//| +setDate(elapsedTime: long)              |
//+------------------------------------------+

import java.util.GregorianCalendar;

public class MyDate {

    // Declare year, month, and day
    private int year;
    private int month;
    private int day;

    // No-arg constructor sets to current date
    MyDate() {
        setDate(System.currentTimeMillis());
    }

    // Constructor that takes elapsed time
    MyDate(long elapsedTime) {
        setDate(elapsedTime);
    }

    // Constructor with specified year, month, and day
    MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    // Get year
    public int getYear() {
        return year;
    }

    // Get month
    public int getMonth() {
        return month;
    }

    // Get day
    public int getDay() {
        return day;
    }

    // Set date based on elapsed time
    public void setDate(long elapsedTime) {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTimeInMillis(elapsedTime);
        this.year = calendar.get(GregorianCalendar.YEAR);
        this.month = calendar.get(GregorianCalendar.MONTH);
        this.day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
    }
}
