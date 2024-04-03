class box{
    int length,breadth,height,area,volume;

void setdata(int l,int b,int h){
length=l;
breadth=b;
height=h;
}
public int  calarea(){
    area=length*breadth;
    return area;
}
public int calvolume(){
    return volume=length*breadth*height;
}
}
public class lab8 {
    public static void main(String[] args) {
        box b= new box();
        b.setdata(2,3,4);
        System.out.println("Area is : "+ b.calarea());
        System.out.println("Volume is : "+ b.calvolume());
    }
}
