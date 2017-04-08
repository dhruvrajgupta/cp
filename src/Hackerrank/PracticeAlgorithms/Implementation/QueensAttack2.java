package Hackerrank.PracticeAlgorithms.Implementation;

import java.util.Scanner;

/**
 * Created by dhruv on 08/04/17.
 */
public class QueensAttack2 {
    public static int checkUp(int qx,int qy,int n,int ox,int oy){
        if(qy==oy)
        {
            return oy-qy-1;
        }else{
            return n-qy-1;
        }
    }

    public static int checkDown(int qx,int qy,int n,int ox,int oy){
        if(qy==oy){
            return qy-oy-1;
        }else{
            return qy-1;
        }
    }

    public static int checkRight(int qx,int qy,int n,int ox,int oy){
        if(qx==ox){
            return ox-qx-1;
        }else{
            return qx-1;
        }
    }

    public static int checkLeft(int qx,int qy,int n,int ox,int oy){
        if(qx==ox){
            return qx-ox-1;
        }else{
            return qx-1;
        }
    }

    public static int checkDiagRightUp(int qx,int qy,int n,int ox,int oy){
        int count=0;
        int row=qx-1;
        int col=qy+1;
        while(row!=1 && col!=n){
            if(row==ox && col==oy)
                break;
            count++;
            row--;
            col++;
        }
        return count;
    }

    public static int checkDiagRightDown(int qx,int qy,int n,int ox,int oy){
        int count=0;
        int row=qx+1;
        int col=qy+1;
        while(row!=n && col!=n){
            if(row==ox && col==oy)
                break;
            count++;
            row++;
            col++;
        }
        return count;
    }

    public static int checkDiagLeftUp(int qx,int qy,int n,int ox,int oy){
        int count=0;
        int row=qx-1;
        int col=qy-1;
        while(row!=1 && col!=1){
            if(row==ox && col==oy)
                break;
            count++;
            row--;
            col--;
        }
        return count;
    }

    public static int checkDiagLeftDown(int qx,int qy,int n,int ox,int oy){
        int count=0;
        int row=qx+1;
        int col=qy-1;
        while(row!=n && col!=1){
            if(row==ox && col==oy)
                break;
            count++;
            row++;
            col--;
        }
        return count;
    }

    public static int getCount(int qx,int qy,int n,int ox,int oy){
        int count1=checkUp(qx,qy,n,ox,oy);
        int count2=checkDown(qx,qy,n,ox,oy);
        int count3=checkLeft(qx,qy,n,ox,oy);
        int count4=checkRight(qx,qy,n,ox,oy);
        int count5=checkDiagRightUp(qx,qy,n,ox,oy);
        int count6=checkDiagRightDown(qx,qy,n,ox,oy);
        int count7=checkDiagLeftUp(qx,qy,n,ox,oy);
        int count8=checkDiagLeftDown(qx,qy,n,ox,oy);
        return count1+count2+count3+count4+count5+count6+count7+count8;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int rQueen = in.nextInt();
        int cQueen = in.nextInt();
        int count=0;
        for(int a0 = 0; a0 < k; a0++){
            int rObstacle = in.nextInt();
            int cObstacle = in.nextInt();
            count+=getCount(rQueen,cQueen,n,rObstacle,cObstacle);
        }
        System.out.println(count);
    }
}
