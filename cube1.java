// WAP to model a cube having data members ,length,breath,height.use member
// functions of your own interest;
class Cube{
    double length,breadth,height,volume;
    public Cube(int l,int b,int h){
length=l;
breadth=b;
height=h;
}
public double cubevolume(){
    volume=length*breadth*height;
    return volume;
}
}
public class cube1 {
  public static void main(String[] args) {
    Cube c1=new Cube(2, 5, 10);
    System.out.println("Volume of cube is : "+c1.cubevolume());
    
  }  
}
