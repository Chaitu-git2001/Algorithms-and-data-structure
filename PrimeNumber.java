import java.util.Scanner;

class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num <= 1) {
            System.out.println(num + " is Not a Prime Number");
            return;
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                System.out.println(num + " is Not a Prime Number");
                return;
            }
        }

        System.out.println(num + " is a Prime Number");
    }
}

