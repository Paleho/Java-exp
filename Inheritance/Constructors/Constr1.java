class A {
    String a = "Hi";
}
class B extends A {
    String b;
    public B(){
        b = "Yo";
    }
    public B(String b){
        this.b = b;
    }
}
public class Constr1{
    public static void main(String[] args){
        B b = new B();
        System.out.println(b.a);
        System.out.println(b.b);
        B b2 = new B("Hello");
        System.out.println(b2.a);
        System.out.println(b2.b);
    }
}
