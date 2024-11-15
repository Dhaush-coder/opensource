import java.io.*;
import java.util.*;

public class Solution {
private static int findMaxPassingMark(int[] scores, int N, int X)
{
    Arrays.sort(scores);
    int maxPassingMark=(X == N) ? 0 : scores[N-X]-1;
    return maxPassingMark;
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0)
        {
            int N=sc.nextInt();
            int X=sc.nextInt();
            int[] scores=new int[N];
            for(int i=0;i<N;i++)
            {
                scores[i]=sc.nextInt();
            }
            int result=findMaxPassingMark(scores, N, X);
            System.out.println(result);
        }
    }
}
