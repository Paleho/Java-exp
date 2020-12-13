class Mammal{
    Mammal() {
        System.out.println("Four");
    }
    public void ears() {
        System.out.println("Two");
    }
}
class Dog extends Mammal{
    Dog() {
        super.ears();
        System.out.println("Three");
    }
}
public class Constr3 extends Dog{
    public static void main (String args[ ]){
        System.out.println("One");
        Constr3 d = new Constr3();
    }
}
