class animal{
    void eat(){
        System.out.println("EATING");
    }
}
class dog extends animal{
    void bark(){
    System.out.println("Barking");
}
}
class cat extends dog{
    void makesound(){
        System.out.println("Meowww meowww");
    }
}
public class multilevelinherit {
    public static void main(String[] args) {
        cat c=new cat();
        c.makesound();
        c.bark();
        c.eat();
    }
}
