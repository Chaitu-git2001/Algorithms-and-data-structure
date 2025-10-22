import java.util.Scanner;

class PrimeRecursion {
    static boolean isPrime(int num, int i) {
        if (i == num)  
            return true;
        if (num % i == 0) 
        return false;
        return isPrime(num, i + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num <= 1)
            System.out.println(num + " is Not a Prime Number");
        else if (isPrime(num, 2))
            System.out.println(num + " is a Prime Number");
        else
            System.out.println(num + " is Not a Prime Number");
    }
}

