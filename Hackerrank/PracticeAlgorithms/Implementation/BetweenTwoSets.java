package Hackerrank.PracticeAlgorithms.Implementation;

import java.util.Scanner;

/**
 * Created by dhruv on 15/03/17.
 */
public class BetweenTwoSets {

    public static int GCD(int n1, int n2){
        if(n2!=0){
            return GCD(n2,n1%n2);
        }else
            return n1;
    }

    public static int LCM(int n1, int n2){
        return n1*(n2/GCD(n1,n2));
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for(int b_i=0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
        }


        int lcm = a[0];
        for(int i=0; i<a.length; i++){
            lcm = LCM(lcm,a[i]);
        }

        int gcd = b[0];
        for(int i=0; i<b.length; i++){
            gcd = GCD(gcd,b[i]);
        }

        int count=0;
        int x=lcm;
        int i=1;
        while(x<=gcd){
            x=lcm*i;
            if(gcd%x==0)
                count++;
            i++;
        }
        System.out.println(count);
    }

    public static int solve(int lcm, int gcd){
        if(gcd%lcm==0)
            return gcd/lcm;
        else
            return 0;
    }

}
