package CodeChef.Practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by dhruv on 16/05/17.
 */
public class TheBallAndCups {
    public static void main (String[] args) throws java.lang.Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t>0){
            String[] firstLine = br.readLine().split(" ");
            long n = Long.parseLong(firstLine[0]);
            long c = Long.parseLong(firstLine[1]);
            long q = Long.parseLong(firstLine[2]);
            while(q>0){
                String[] query = br.readLine().split(" ");
                long l= Long.parseLong(query[0]);
                long r= Long.parseLong(query[1]);
                if(l<=c && c<=r){
                    c = l+r-c;
                }
                q--;
            }
            System.out.println(c);
            t--;
        }
    }
}
