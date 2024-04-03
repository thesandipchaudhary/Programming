package Exceptionhandlling;

import java.io.FileInputStream;

public class Test {
    public static void main(String[] args) {
       try{
        int a=5;
       int b=5;
       int c=a/b;
       System.out.println(c);
       }
       catch(Exception e)
       {
        System.out.println("You cannot divide with zero");
       }
       finally{
        System.out.println("We are in finally block");
       }
    }
}
