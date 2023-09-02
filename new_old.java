/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class new_old
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int s=sc.nextInt();
        if(t<s)
        {
            System.out.println("old");
        }
        else if(t==s)
        {
            System.out.println("Same");
        }
        else
        {
            System.out.println("New");
        }
    }
}
