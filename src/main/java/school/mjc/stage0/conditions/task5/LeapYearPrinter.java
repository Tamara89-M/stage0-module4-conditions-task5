package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
        if (isLeapYear) {
            System.out.println("leap");
        } else {
            System.out.println("not leap");
        }

    }

    public static void main(String[] args) {
        LeapYearPrinter l = new LeapYearPrinter();
        l.isLeapYear(1958);

    }

}
