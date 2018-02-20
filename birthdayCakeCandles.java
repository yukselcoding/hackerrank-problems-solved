import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int max(int n, int[] arr) {
        int mx = arr[0];
        for(int i=0; i<n; i++)
              if(arr[i] > mx)
                   mx = arr[i];
        return mx;
    }

    static int birthdayCakeCandles(int n, int[] ar) {
       int count = 0;
       int mx = max(n, ar);
       for(int i=0; i<n; i++)
           if(ar[i] == mx)
               count++;
       return count;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
    }
}
