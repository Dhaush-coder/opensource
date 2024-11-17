import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=0;i<T;i++)
        {
            int a =sc.nextInt();
            int b= sc.nextInt();
            int sum=a%b;
            System.out.println(sum);
        }
    }
}
