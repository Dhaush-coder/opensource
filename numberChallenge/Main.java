import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=0;i<T;i++)
        {
            int a=sc.nextInt();
            if(a%2==0 && a%7==0)
            {
                System.out.println("Suresh");
            }
            else if(a%2!=0 && a%9==0)
            {
                System.out.println("Rajesh");
            }
            else
            {
                System.out.println("Ramesh");
            }
        }
    }
}
