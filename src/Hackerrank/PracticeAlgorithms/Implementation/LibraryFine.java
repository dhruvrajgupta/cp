package Hackerrank.PracticeAlgorithms.Implementation;

import java.util.Scanner;

/**
 * Created by dhruv on 26/03/17.
 */
public class LibraryFine {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int returnedDate = in.nextInt();
        int returnedMonth = in.nextInt();
        int returnedYear = in.nextInt();
        int dueDate = in.nextInt();
        int dueMonth = in.nextInt();
        int dueYear = in.nextInt();
        int fine = 0;

        if(returnedYear-dueYear>0)
            fine = 10000;
        else if(returnedYear-dueYear==0){
            if(returnedMonth-dueMonth>0)
                fine=500*(returnedMonth-dueMonth);
            else if(returnedMonth-dueMonth==0){
                if(returnedDate-dueDate>0)
                    fine=15*(returnedDate-dueDate);
                else
                    fine=0;
            }else
                fine=0;
        }else
            fine=0;

        System.out.println(fine);
    }
}
