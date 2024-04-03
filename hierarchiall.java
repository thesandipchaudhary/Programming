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
class cat extends animal{
    void makesound(){
        System.out.println("Meowww meowww");
    }
}

    public class hierarchiall {
        public static void main(String[] args) {
            dog d=new dog();
            d.bark();
            d.eat();
            cat c=new cat();
            c.makesound();
            c.eat();
        }
    }
    
// WAP to implement heirachial inheritance.
