interface Drawable{
    void draw();
}
class Rectangle implements Drawable{
    public void draw(){
        System.out.println("Drawing rectangle");
    }
}
class Circle implements Drawable{
    public void draw(){
        System.out.println("Drawing Circle");
    }
}
public class interface1 {
   public static void main(String[] args) {
        Drawable v;
        v=new Rectangle();
        v.draw();
        v=new Circle();
        v.draw();
   } 
}
