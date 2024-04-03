import java.util.Scanner;
public class temperature {
    public static void main(String args[]){
        float celsius, Fahrenheit;
        Scanner ob1 =new Scanner(System.in);
        System.out.println("Enter the degree in celcius: ");
        celsius=ob1.nextFloat();
        Fahrenheit=((celsius*9)/5)+32;
        System.out.println("Fahrenheit is: "+Fahrenheit);
    }
}
