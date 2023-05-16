package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {
        int leap;
        if (year %4 == 0 && year % 100 != 0 || year%400==0){
            leap = 2;
        } else {
            leap = 1;
        }

        switch (leap){
            case (1):
                System.out.println("not leap");
                break;
            case (2):
                System.out.println("leap");
                break;
            default: System.out.println("wrong number!");
        }
    }
}
