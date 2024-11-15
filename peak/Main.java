import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] heights=new int[n];
        for(int i=0;i<n;i++)
        {
          heights[i]=sc.nextInt();
        }
            int[] result=new int[n];
            Arrays.fill(result, -1);
            Stack<Integer> stack=new Stack<>();
        for(int i=0;i<n;i++)
        {
            while(!stack.isEmpty() && heights[i]>heights[stack.peek()])
            {
                result[stack.pop()]=heights[i];
            }
        stack.push(i);
        }
            for(int value : result)
            {
                System.out.print(value +" ");
            
        }
    }
}
