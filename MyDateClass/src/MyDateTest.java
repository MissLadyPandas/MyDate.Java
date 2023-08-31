public class MyDateTest {
    public static void main(String[] args) {
        // Create a MyDate object using the no-arg constructor (current date)
        MyDate date1 = new MyDate();
        System.out.println("Date1: " + date1.getYear() + "-" + (date1.getMonth() + 1) + "-" + date1.getDay());

        // Create a MyDate object using elapsed time
        MyDate date2 = new MyDate(34355555133101L);
        System.out.println("Date2: " + date2.getYear() + "-" + (date2.getMonth() + 1) + "-" + date2.getDay());

        // Create a MyDate object with specified year, month, and day
        MyDate date3 = new MyDate(2022, 7, 15); // August 15, 2022 (month is 0-based)
        System.out.println("Date3: " + date3.getYear() + "-" + (date3.getMonth() + 1) + "-" + date3.getDay());
    }
}
