package CodeChef.Practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by dhruv on 12/05/17.
 */
public class BuyingSweets {
    public static void main (String[] args) throws java.lang.Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t>0){
            String[] firstLine = br.readLine().split(" ");
            int bankNotes = Integer.parseInt(firstLine[0]);
            int costOfEachSweet = Integer.parseInt(firstLine[1]);
            String[] secondLine = br.readLine().split(" ");
            System.out.println(sol(costOfEachSweet,secondLine));
            t--;
        }
    }
    public static int sol(int costOfEachSweet,String[] arr){
        int sum=0;
        int min=99999;
        for(int i=0; i<arr.length; i++){
            if(Integer.parseInt(arr[i])<min){
                min=Integer.parseInt(arr[i]);
            }
            sum+=Integer.parseInt(arr[i]);
        }
        if((sum-min)/costOfEachSweet == sum/costOfEachSweet){
            return -1;
        }else{
            return sum/costOfEachSweet;
        }
    }
}
