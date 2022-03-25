package CodeChef.Practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by dhruv on 16/05/17.
 */
public class SplittingCandies {
    public static void main (String[] args) throws java.lang.Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t>0){
            String[] in = br.readLine().split(" ");
            long candies = Long.parseLong(in[0]);
            long students = Long.parseLong(in[1]);

            long noOfCandiesEachStudentGets;
            long noOfCandiesTeacherGets;
            if(students==0){
                noOfCandiesEachStudentGets=0;
                noOfCandiesTeacherGets = candies;
            }else{
                noOfCandiesEachStudentGets = (long)candies/students;
                noOfCandiesTeacherGets = candies%students;
            }
            System.out.println(noOfCandiesEachStudentGets+" "+noOfCandiesTeacherGets);
            t--;
        }
    }
}
