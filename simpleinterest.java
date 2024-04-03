import java.util.Scanner;
public class simpleinterest{
    public static void main(String args[]){
        double p,r,SI;
        int t;
        Scanner reader =new Scanner(System.in);
        System.out.println("Enter the principle: ");
        p=reader.nextDouble();
        System.out.println("Enter the time : ");
        t=reader.nextInt();
        System.out.println("Enter the rate : ");
        r=reader.nextDouble();
        SI=(p*t*r)/100;
        System.out.println("Simple Interest is : "+SI);
        
    }
}