package problem4;

public class Date {
    private int month;
    private int day;
    private int year;

    Date(int month, int day, int year) {
        this.month = month;
        this.day  = day;
        this.year = year;
    }
    public void displayDate() {
        System.out.println(month + "/" + day + "/" + year);
    }
}
