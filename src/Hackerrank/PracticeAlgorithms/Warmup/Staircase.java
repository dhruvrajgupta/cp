package Hackerrank.PracticeAlgorithms.Warmup;

import java.util.Scanner;

/**
 * Created by dhruv on 12/03/17.
 */
public class Staircase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        for(int i=1; i<=n; i++){
            //Printing spaces
            for(int j=n-i; j>=1; j--)
                System.out.print(" ");
            //Printinh #
            for(int k=1; k<=i; k++)
                System.out.print("#");
            System.out.println();
        }
    }
}
