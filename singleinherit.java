class vehicle{
    void color(){
        System.out.println("RED");
    }
}
    class bus extends vehicle{
        void model(){
          System.out.println("M2020X");  
        }
    }

    public class singleinherit {
    public static void main(String[] args) {
        bus b=new bus();
        b.model();
        b.color();
    }
}
