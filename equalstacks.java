import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the equalStacks function below.
     */
    static int equalStacks(int[] h1, int[] h2, int[] h3) {
        /*
         * Write your code here.
         */
         int ttlh1=0,ttlh2=0,ttlh3=0,maxval=0;
         int h1len = h1.length;
         int h2len = h2.length;
         int h3len = h3.length;
         maxval = Math.max(Math.max(h1len,h2len),h3len);

         for(int i=0;i<maxval;i++)
         {
             if(h1len>i)
             {
                 ttlh1 += h1[i];
             }
             if(h2len>i)
             {
                 ttlh2 += h2[i];
             }
             if(h3len>i)
             {
                 ttlh3 += h3[i];
             }
         }

         int min = 0,temp = 1;
         int i=0,j=0,k=0;
         
         while(temp==1)
         {
             min = Math.min(Math.min(ttlh1,ttlh2),ttlh3);
             if(ttlh1 == min && ttlh2 == min && ttlh3 == min)
            {
                temp=0;
                break;
            }else{
             if(ttlh1>min)
             {
                 ttlh1 -= h1[i++];
             }
             if(ttlh2>min)
             {
                 ttlh2 -= h2[j++];
             }
             if(ttlh3>min)
             {
                 ttlh3 -= h3[k++];
             }
            }
         }
    return ttlh1;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] n1N2N3 = scanner.nextLine().split(" ");

        int n1 = Integer.parseInt(n1N2N3[0].trim());

        int n2 = Integer.parseInt(n1N2N3[1].trim());

        int n3 = Integer.parseInt(n1N2N3[2].trim());

        int[] h1 = new int[n1];

        String[] h1Items = scanner.nextLine().split(" ");

        for (int h1Itr = 0; h1Itr < n1; h1Itr++) {
            int h1Item = Integer.parseInt(h1Items[h1Itr].trim());
            h1[h1Itr] = h1Item;
        }

        int[] h2 = new int[n2];

        String[] h2Items = scanner.nextLine().split(" ");

        for (int h2Itr = 0; h2Itr < n2; h2Itr++) {
            int h2Item = Integer.parseInt(h2Items[h2Itr].trim());
            h2[h2Itr] = h2Item;
        }

        int[] h3 = new int[n3];

        String[] h3Items = scanner.nextLine().split(" ");

        for (int h3Itr = 0; h3Itr < n3; h3Itr++) {
            int h3Item = Integer.parseInt(h3Items[h3Itr].trim());
            h3[h3Itr] = h3Item;
        }

        int result = equalStacks(h1, h2, h3);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}
