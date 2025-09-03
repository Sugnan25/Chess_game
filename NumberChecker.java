import java.util.Scanner;

public class NumberChecker {

    public boolean isArmstrong(int number) {        //Armstrong
        int original = number;
        int sum = 0;
        int digits = String.valueOf(number).length();
        while (number != 0) {
            int digit = number % 10;
            sum += Math.pow(digit, digits);
            number /= 10;
        }
        return sum == original;
    }

    public boolean isPalindrome(int number) {          //Palindrome
        int original = number;
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return original == reversed;
    }

    public boolean isPerfect(int number) {                //perfectNumber divisor shuld be equal to sum.
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NumberChecker checker = new NumberChecker();

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println(num + (checker.isArmstrong(num) ? " is an Armstrong number." : " is not an Armstrong number."));
        System.out.println(num + (checker.isPalindrome(num) ? " is a Palindrome." : " is not a Palindrome."));
        System.out.println(num + (checker.isPerfect(num) ? " is a Perfect number." : " is not a Perfect number."));
    }    
}
