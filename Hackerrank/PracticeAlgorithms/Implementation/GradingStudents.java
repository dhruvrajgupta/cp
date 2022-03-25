package Hackerrank.PracticeAlgorithms.Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by dhruv on 13/03/17.
 */
public class GradingStudents {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        GradingStudents gs = new GradingStudents();
        int t = Integer.parseInt(br.readLine());
        while(t>0){
            int grade = Integer.parseInt(br.readLine());
            System.out.println(gs.solve(grade));
            t--;
        }

    }

    public int solve(int grade){
        int nextGrade = ((int)Math.floor((float)grade/5)+1)*5;
        if(nextGrade<40)
            return grade;
        else {
            return ((nextGrade - grade) < 3) ? nextGrade : grade;
        }
    }
}
