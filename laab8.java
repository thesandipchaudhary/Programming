class Box{
    private int length,breadth,height;
public Box(){
    length=0;
    breadth=0;
}
public Box(int l,int b){
    length=l;
    breadth=b;
    height=0;
}
public Box(int l,int b,int h){
length=l;
breadth=b;
height=h;
}
 int  findarea(){
    return length*breadth;
}
    int findvolume(){
    return length*breadth*height;
}
}
public class laab8 {
    public static void main(String[] args) {
        Box b= new Box(2,5,6);
       
        System.out.println("Area is : "+ b.findarea());
        System.out.println("Volume is : "+ b.findvolume());
    }
}

