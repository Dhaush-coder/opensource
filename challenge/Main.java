import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=0;i<T;i++)
        {
            int x=sc.nextInt();
            int y=sc.nextInt();
            int earn;
            if(y <= x)
            {
                earn = y;
            }
            else
            {
                earn=x+(y-x)*2;
            }
            System.out.println(earn);
        }
    }
}