class Adder{  

static int add(int a,int b){
    return a+b;
}  
static int add(int a,int b,int c)
{
    return a+b-c;
}  
}  
class methodov{  
public static void main(String[] args){  
System.out.println(Adder.add(7,3));  
System.out.println(Adder.add(11,10,2));  
}}  
