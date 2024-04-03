import java.util.*;
// package Exceptionhandlling;

public class Throwdemo {
    void validate(int age)
    {
        try{
            if(age<18)
                throw Exception("Invalid age");
            
            else
            System.out.println("He can vote");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        Throwdemo t=new Throwdemo();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter age");
        int a=sc.nextInt;
        t.validate();
    }
    
}
