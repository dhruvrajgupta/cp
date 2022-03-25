package Hackerrank.PracticeAlgorithms.Implementation;

import java.util.Scanner;

/**
 * Created by dhruv on 25/03/17.
 */
public class CircularArrayRotation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int q = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        //System.out.println("Length : "+a.length);
        for(int a0 = 0; a0 < q; a0++){
            int m = in.nextInt();
            //System.out.println("m : "+m+"\tk : "+k);
            int pos = m-(k%a.length);
            //System.out.println("first : "+pos);
            if(pos<0){
                pos = a.length+pos;
                //System.out.println("second : "+pos);
            }
            System.out.println(a[pos]);
        }
    }
}

