//2.	Calculate factorial of 5.
import java.util.Scanner;

public class factorial{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check its factorial: ");
        int n = sc.nextInt();
        factorial fac = new factorial();
        fac.calculate(n);
    }
}
