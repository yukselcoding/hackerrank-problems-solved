import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static long minimum(long arr[]) {
        long min = arr[0];
        for(int i=1; i<5; i++)
            if(arr[i] < min)
                min = arr[i];
        return min;
    }

    static long maximum(long arr[]) {
        long max = arr[0];
        for(int i=1; i<5; i++)
            if(arr[i] > max)
                max = arr[i];
       return max;
    }

    static long sum(long[] arr) {
        long sm = 0;
        for(int i=0; i<5; i++)
           sm += arr[i];
        return sm;
    }

    static void miniMaxSum(long[] arr) {
        long sm = sum(arr);
        long min = minimum(arr);
        long max = maximum(arr);
        long min_ = sm - max;
        long max_ = sm - min;
        System.out.println(min_ + " " + max_);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long[] arr = new long[5];
        for(int arr_i = 0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextLong();
        }
        miniMaxSum(arr);
        in.close();
    }
}
