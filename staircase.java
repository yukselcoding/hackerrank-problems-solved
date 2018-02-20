import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static void staircase(int n) {
        for(int i=0; i<n; i++) {
            for(int j=0; j<n-i-1; j++)
                System.out.print(" ");
            for(int k=0; k<i+1; k++)
                System.out.print("#");
            System.out.println();
        }

    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        staircase(n);
        in.close();
    }
}
