import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner obj = new Scanner(System.in);
        int t=obj.nextInt();
        for(int k=0;k<t;k++)
        {
         String s=obj.next();
         int l=s.length();
        for(int i=0;i<l;i=i+2)
        {
            System.out.print(s.charAt(i));
        }
        System.out.print(" ");
        for(int i=1;i<l;i=i+2)
        {
            System.out.print(s.charAt(i));
        }
        System.out.println();
        }
    }
}