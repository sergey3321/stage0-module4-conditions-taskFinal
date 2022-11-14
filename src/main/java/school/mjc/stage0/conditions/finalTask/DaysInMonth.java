package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public static void main(String[] args) {
        printDays(1900, 2);
    }

    public static void printDays(int year, int month) {
        if (year % 100 == 0 && year % 400 != 0) {
            System.out.println(28);
        } else if (year % 4 == 0 && month <= 12) {
            System.out.println(29);
        } else if (month == 2) {
            System.out.println(28);
        } else if (month < 0 || month > 12) {
            System.out.println("invalid date");
        } else if (year < 0) {
            System.out.println("invalid date");
        }
        switch (month) {
            case 1:
                System.out.println(31);
                break;
            case 3:
                System.out.println(31);
                break;
            case 4:
                System.out.println(30);
                break;
            case 5:
                System.out.println(31);
                break;
            case 6:
                System.out.println(30);
                break;
            case 7:
                System.out.println(31);
                break;
            case 8:
                System.out.println(31);
                break;
            case 9:
                System.out.println(30);
                break;
            case 10:
                System.out.println(31);
                break;
            case 11:
                System.out.println(30);
                break;
            case 12:
                System.out.println(31);
                break;
            default:
        }
    }
}
