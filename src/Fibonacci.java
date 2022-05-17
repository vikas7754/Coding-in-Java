import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int i, n1=0, n2=1,n3;
        Scanner x = new Scanner(System.in);
        int n = x.nextInt();
        System.out.print(n1+" "+n2);
        for (i=0; i<n; i++){
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
    }
}
