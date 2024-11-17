import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=0;i<T;i++)
        {
            int N=sc.nextInt();
            int sum=0;
            while(N>0)
            {
                sum += N%10;
                N /= 10;
            }
            System.out.println(sum);
        }
    }
}
