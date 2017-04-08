package Hackerrank.PracticeAlgorithms.Implementation;

import com.sun.deploy.util.StringUtils;

import java.util.Arrays;
import java.util.BitSet;
import java.util.Scanner;

/**
 * Created by dhruv on 08/04/17.
 */
public class ACMICPCTeam {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        in.nextLine();
        BitSet[] set = new BitSet[n];
        for(int i=0; i<n; i++){
            set[i]=fromString(in.nextLine());
            //System.out.println(set[i].length());
        }

        int max = 0;
        int count=0;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                BitSet orValue = (BitSet) set[i].clone();
                orValue.or(set[j]);
                //System.out.println(noOfbits(orValue));
                if(noOfbits(orValue)>max){
                    max=noOfbits(orValue);
                    count=1;
                }

                else if(noOfbits(orValue)==max){
                    count++;
                }
            }
        }

        System.out.println(max);
        System.out.println(count);

    }

    public static BitSet fromString(final String s){
        BitSet bitSet = new BitSet(s.length());
        int len=s.length();
        for(int i=len-1; i>=0; i--){
            if(s.charAt(i)=='1'){
                bitSet.set(len-i-1);
            }
        }
        return bitSet;
    }

    public static int noOfbits(BitSet a){
        int count=0;
        for(int i=0; i<a.length(); i++){
            if(a.get(i))
                count++;
        }
        return count;
    }
}
