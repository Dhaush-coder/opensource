import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum = a+b;
        String result1 = sum + "1";
        int result2 = Integer.parseInt(result1);
        System.out.println(result2);
    }
}
