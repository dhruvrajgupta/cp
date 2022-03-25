package CodeChef.Practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by dhruv on 16/05/17.
 */
public class Lapindromes {
    public static void main (String[] args) throws java.lang.Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t>0){
            String str = br.readLine();
            String s1;
            String s2;
            int l = str.length();
            s1 = str.substring(0,l/2);
            if(l%2==0){
                s2=str.substring(l/2,l);
            }else{
                s2=str.substring((l/2)+1,l);
            }

            int[] left = new int[26];
            int[] right = new int[26];

            // For left
            for(int i=0; i<s1.length(); i++){
                char c = s1.charAt(i);
                left[(int)c-97]++;
            }

            // For Right
            for(int i=0; i<s2.length(); i++){
                char c = s2.charAt(i);
                right[(int)c-97]++;
            }

            //printing left and right
	        /*for(int i=97; i<123; i++){
	            System.out.print((char)i+"\t");
	        }
	        System.out.println();
	        System.out.println("Left : ");
	        for(int i=0; i<26; i++){
	            System.out.print(left[i]+"\t");
	        }
	        System.out.println();
	        System.out.println("Right : ");
	        for(int i=0; i<26; i++){
	            System.out.print(right[i]+"\t");
	        }*/

            int flag=1; //YES
            for(int i=0; i<26; i++){
                if(left[i]!=right[i]){
                    flag=0; //NO
                    break;
                }
            }
            if(flag==0)
                System.out.println("NO");
            else
                System.out.println("YES");
            t--;
        }
    }
}
