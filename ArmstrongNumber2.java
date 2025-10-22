class ArmstrongNumber2 {
    static int armStrong(int number) {
        if (number == 0)
            return 0;
        int reminder = number % 10;
        return (reminder * reminder * reminder) + armStrong(number / 10);//very improtant line
    }

    public static void main(String[] args) {
        int num = 153;
        int originalNumber = num;

        int result = armStrong(num);  // call recursive function

        if (originalNumber == result) {
            System.out.println("Number is Armstrong");
        } else {
            System.out.println("Number is Not Armstrong");
        }
    }
}
