package Hackerrank.PracticeAlgorithms.Warmup;

import java.util.Scanner;

/**
 * Created by dhruv on 12/03/17.
 */
public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] arr = new int[n][n];

        //Taking inputs
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = scan.nextInt();
            }
        }

        //Solving
        int diag1 = 0;
        int diag2=0;
        int row;
        for(row=0; row<n; row++){
            diag1+=arr[row][row];
            diag2+=arr[row][(n-1)-row];
        }

        System.out.println(Math.abs(diag1-diag2));
    }
}
