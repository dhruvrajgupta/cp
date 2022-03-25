package Hackerrank.PracticeAlgorithms.Implementation;


import java.util.Scanner;

/**
 * Created by dhruv on 16/03/17.
 */
public class BonAppetit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int noOfItems = scan.nextInt();
        int didNotEat = scan.nextInt();
        int anna =0;
        int brian=0;
        int total=0;
        int[] arr = new int[noOfItems];
        for(int i=0; i<noOfItems; i++) {
            arr[i]=scan.nextInt();
            total+=arr[i];
        }
        int charged=scan.nextInt();
        brian=total/2+arr[didNotEat]/2;
        anna=total/2-arr[didNotEat]/2;
        if (charged-anna==0)
            System.out.println("Bon Appetit");
        else
            System.out.println(charged-anna);
    }
}
