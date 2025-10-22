public class LeapYearSimple {
    public static void main(String[] args) {
        int year1 = 2020;
        int year2 = 1900;

        System.out.println("Input: " + year1 + " → Output: " + isLeap(year1));
        System.out.println("Input: " + year2 + " → Output: " + isLeap(year2));
    }

    static boolean isLeap(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }
}
