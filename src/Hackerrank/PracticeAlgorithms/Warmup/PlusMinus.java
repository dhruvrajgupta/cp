package Hackerrank.PracticeAlgorithms.Warmup;

import java.util.Scanner;

/**
 * Created by dhruv on 12/03/17.
 */
public class PlusMinus {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int pos=0;
        int neg=0;
        int zer=0;
        for(int i=0; i<n; i++){
            int a = scan.nextInt();
            if(a==0)
                zer++;
            if(a>0)
                pos++;
            if(a<0)
                neg++;
        }
        System.out.println(String.format("%.6f",(double)pos/n));
        System.out.println(String.format("%.6f",(double)neg/n));
        System.out.println(String.format("%.6f",(double)zer/n));
    }
}
