/*
Print the following pattern in Java

1
* *
2 3 4
* * * *
5 6 7 8 9

*/

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args){
        int i,j,k=1;
        Scanner x = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = x.nextInt();
        for(i=1; i<=n; i++){
            for(j=0; j<=i; j++){
                if (i%2!=0){
                    System.out.print(k+" ");
                    k++;
                }else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
