import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
   Scanner sc = new Scanner(System.in);
   int max = 1000010;
   int[] frontarr = new int[max];
   int[] reararr = new int[max];

   int front = -1;
   int rear = -1;
   int query = sc.nextInt();

   for(int i=0;i<query;i++)
   {
       int choice = sc.nextInt();

       if(choice == 1)
       {
           int number = sc.nextInt();
            rear = rear+1;
            reararr[rear] = number;       
        }else 
        {
            if(front == -1)
            {
                while(rear != -1)
                {
                    front = front+1;
                    frontarr[front] = reararr[rear];
                    rear = rear - 1;
                }
            }
            if(front != -1)
            {
                if(choice == 2)
                {
                    front = front-1;
                }else if(choice == 3)
                {
                    System.out.println(frontarr[front]);
                }
            }
        }

    }
}
}
