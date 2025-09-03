//2.	Calculate factorial of 5.
import java.util.Scanner;

public class factorial{
    public void calculate(int n){
        int result = 1;
        for(int i=1;i<=n;i++){
            result = result*i;
        }
        System.out.println("The factorial of " + n + " is " + result);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check its factorial: ");
        int n = sc.nextInt();
        factorial fac = new factorial();
        fac.calculate(n);
    }
}
