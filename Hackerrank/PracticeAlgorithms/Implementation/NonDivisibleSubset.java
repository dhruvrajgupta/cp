package Hackerrank.PracticeAlgorithms.Implementation;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by dhruv on 26/03/17.
 */
public class NonDivisibleSubset {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] a = new int[k];
        for(int i=0; i<n; i++){
            int rem = (int)in.nextLong()%k;
            a[rem]++;
        }

        //When remainder is 0 we can take atmost of one
        int ans = Math.min(1,a[0]);

        for(int i=1; i<k/2+k%2; i++){
            ans+=Math.max(a[i],a[k-i]);
        }

        //When even eg: 8 -> 4+4 at most one value can be taken
        if(k%2==0)
            ans+=Math.min(1,a[k/2]);

        System.out.println(ans);
    }
}
