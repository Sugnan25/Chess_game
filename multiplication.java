import java.util.*;

public class multiplication {
    public void calculate(int n){
        for(int i=1;i<=10;i++){
            int tab = n*i;
            System.out.println(n + "*" + i + "=" + tab);
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number to print its table");
        int n = sc.nextInt();
        multiplication mul = new multiplication();
        mul.calculate(n);
    }
}
