import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int t=0;t<T;t++)
        {
            int x=sc.nextInt();
            int y=0;
            for(int i=0;i<x;i++)
            {
                int z=sc.nextInt();
                if(z>y)
                {
                    y=z;
                }
            }
            System.out.println(y);
        }
    }
}
