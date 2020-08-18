import java.util.*;
public class Array {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int d = s.nextInt();

        int[] array = new int[n];
        for(int i=0; i<n;i++) {
            array[i] = s.nextInt();
        }
        int[] result = new int[n];
        for(int i=0; i<n;i++) {
            result[(i+n-d)%n]=array[i];
        } 
        
        for(int i=0;i<n;i++)
        System.out.print(result[i]+" ");
        

    }
}
