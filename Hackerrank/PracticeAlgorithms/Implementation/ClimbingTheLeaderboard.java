package Hackerrank.PracticeAlgorithms.Implementation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by dhruv on 17/03/17.
 */
public class ClimbingTheLeaderboard {
    public int getRank(ArrayList<Long> arr,long score){
        //System.out.println(arr);
        int rank = Collections.binarySearch(arr,score,Collections.reverseOrder());
        return (rank<0)?Math.abs(rank):rank+1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Long> scores = new ArrayList<>();
        long prev = -1;
        for(int scores_i=0; scores_i < n; scores_i++){
            Long score = in.nextLong();
            if(score!=prev)
                scores.add(score);
            prev = score;

        }
        //System.out.println(scores);
        ClimbingTheLeaderboard sol = new ClimbingTheLeaderboard();
        int m = in.nextInt();
        while(m-->0){
            long aScore = in.nextLong();
            System.out.println(sol.getRank(scores,aScore));
            //System.out.println();
        }
    }
}
