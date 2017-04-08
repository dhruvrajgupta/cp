package Hackerrank.PracticeAlgorithms.Warmup;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by dhruv on 07/04/17.
 */
public class BirthdayCakeCandles {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long height[] = new long[n];
        for(int height_i=0; height_i < n; height_i++){
            height[height_i] = in.nextLong();
        }
        long max = Arrays.stream(height).max().getAsLong();
        long count = Arrays.stream(height).filter(x-> x == max).count();
        System.out.println(count);
    }
}
