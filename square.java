//1.	Print square of numbers from 1 to 5.

public class square {
    public static void main (String args[]){
        int n = 5;
        System.out.println("The square numbers from 1 to 5 is: ");
        for (int i = 1; i<=n; i++) {
            int square = i*i;
            System.out.println(square);
        }
    }    
}
