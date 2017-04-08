package Hackerrank.PracticeAlgorithms.Implementation;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by dhruv on 17/03/17.
 */
public class PickingNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }

        long max_num=0;
        for(int z : a){
            long temp = Arrays.stream(a).filter(x-> x==z).count()+Arrays.stream(a).filter(x-> x==z+1).count();
            if(temp>max_num)
                max_num=temp;
        }
        System.out.println(max_num);
    }
}
