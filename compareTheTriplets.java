import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int[] solve(int[] a, int[] b){
        // Complete this function
        int result[] = new int[2];
        for(int i=0; i<2; i++)
               result[i] = 0;

        for(int i=0; i<3; i++) {
             if(a[i] > b[i])
                   result[0]++;
             else if(a[i] < b[i])
                   result[1]++;
        }
        return result;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a[] = new int[3];
        int b[] = new int[3];
        for(int i=0; i<3; i++)
            a[i] = in.nextInt();
        for(int i=0; i<3; i++)
            b[i] = in.nextInt();
        int[] result = solve(a, b);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


    }
}
