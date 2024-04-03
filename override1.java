import java.util.Scanner;
class Employee{
    int eid;
    String name;
    float salary;

    void getdData(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter id,name and salary");
        eid=sc.nextInt();
        name=sc.next();
        salary=sc.nextFloat();
    }
    void showData(){
        System.out.println("eid: "+eid);
        System.out.println("Name: "+name);
        System.out.println("salary: "+salary);
    }
}
public class override1 {
    
}
