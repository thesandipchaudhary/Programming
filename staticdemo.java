class Student{
    String name;
    int roll;
    String program;
    static int count;
    Student(String n,int r,String p){
        name=n;
        roll=r;
        program=p;
        count++;
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Roll: "+roll);
        System.out.println("Program: "+program);
        System.out.println(); 
    }
    static void displaycount(){
       System.out.println("Number of students "+count); 

      
    }
}
public class staticdemo {
public static void main(String[] args) {
     Student s1=new Student("Stone",12,"BIM");
       Student s2=new Student("Stone tamang",12,"BCM");
       Student s3=new Student("Stone bhai",12,"Bsc csit");
       System.out.println("Student created"); 
     s1.display();
    s2.display();
    s3.display();
    Student.displaycount();
    }
}
