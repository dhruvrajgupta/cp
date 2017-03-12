package Hackerrank.PracticeAlgorithms.Implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by dhruv on 13/03/17.
 */
public class AppleAndOrange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];

        for (int apple_i = 0; apple_i < m; apple_i++) {
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[n];
        for (int orange_i = 0; orange_i < n; orange_i++) {
            orange[orange_i] = in.nextInt();
        }

        long noOfApples = Arrays.stream(apple).filter(x -> x + a >= s && x + a <= t).count();
        long noOfOranges = Arrays.stream(orange).filter(x -> x + b >= s && x + b <= t).count();

        System.out.println(noOfApples);
        System.out.println(noOfOranges);
    }
}
