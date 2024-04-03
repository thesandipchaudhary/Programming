class Overload{
    double length;
    int breadth;

Overload(double l,int b)
{
    length=l;
    breadth=b;
}
Overload(int l,int b)
{
    length=l;
    breadth=b;
}
double calarea(){
    return length*breadth;
}
}
public class methodover {
    public static void main(String[] args) {
        Overload a=new Overload(45,25);
        System.out.println("Area is: "+a.calarea());
    }
}
