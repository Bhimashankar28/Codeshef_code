/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        while(n-->0){
            int a=s.nextInt();
            int b=s.nextInt();
            int c=100*a;
            int d=10*b;
            if(c==d)
                System.out.println("Cloth");
            else if(c>d)
                System.out.println("Cloth");
            else
                System.out.println("Disposable");
        }
        // your code goes here
    }
}
