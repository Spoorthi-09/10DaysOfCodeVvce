import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int max = 10000010;
        int front = -1;
        int rear = -1;
        int count = 0;
        int[] arr = new int[max];

        int query = sc.nextInt();

        for(int i=0;i<query;i++)
        {
            int choice = sc.nextInt();

            if(choice == 1)
            {
                if (front == -1) 
                front = 0;

                int number = sc.nextInt();
                rear = rear + 1;
                arr[rear] = number;
                count++;
            }else if(choice == 2)
            {
                if(count==0)
                {
                    System.out.println("Underflow");
                    i++;
                }else{
                front = (front+1);
                count--; 
                }
            }else if(choice == 3)
            {
                if(count==0){
                    System.out.println("Underflow");
                }
                System.out.println(arr[front]);
            }
            
            
            
            
        }
        
    }
}
