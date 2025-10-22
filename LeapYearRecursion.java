public class LeapYearRecursion {

    // Recursive function to check leap year
    static boolean isLeap(int year) {
        if (year % 400 == 0) return true;
        if (year % 100 == 0) return false;
        if (year % 4 == 0) return true;

        // recursion: check smaller year just for demo (not needed in real life)
        return isLeap(year - 4); 
    }

    public static void main(String[] args) {
        int year1 = 2020;
        int year2 = 1900;

        System.out.println("Input: " + year1 + " → Output: " + isLeap(year1));
        System.out.println("Input: " + year2 + " → Output: " + isLeap(year2));
    }
}
