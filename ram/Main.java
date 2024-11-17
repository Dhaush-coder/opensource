import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int t=0;t<T;t++)
        {
            int x=sc.nextInt();
            int d1=(int)(0.10*x);
            int d2=100;int max=Math.max(d1, d2);
            System.out.println(max);
        }
    }
}
