import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        int p=sc.nextInt();
        int q=sc.nextInt();
        int r=sc.nextInt();
        int s=sc.nextInt();
        int messi=(p*22)+(q*11);
        int ronaldo=(r*22)+(s*11);
        if(messi>ronaldo)
        {
            System.out.println("Messi");
        }
        else if(ronaldo>messi)
        {
            System.out.println("Ronaldo");
        }
        else
        {
            System.out.println("Equal");
        }
    }
}
