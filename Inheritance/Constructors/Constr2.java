class A {
    String a = "Hi";
    public A(){
        System.out.println("Constructor A_0 called");
    }
    public A(String a){
        System.out.println("Constructor A_1 called");
        this.a = a;
    }
    public A(String a, String b){
        System.out.println("Constructor A_2 called");
        this.a = a + b;
    }
}
class B extends A {
    String b;
    public B(){ // ΣΦΑΛΜΑ ΚΑΤΑ ΤΗ ΜΕΤΑΓΛΩΤΤΙΣΗ!
        System.out.println("Constructor B_0 called");
        b = "Yo";
    }
    public B(String b){ // ΣΦΑΛΜΑ ΚΑΤΑ ΤΗ ΜΕΤΑΓΛΩΤΤΙΣΗ!
        System.out.println("Constructor B_1 called");
        this.b = b;
    }
}
public class Constr2 {
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.a);
        System.out.println(b.b);
        B b2 = new B("new b");
        System.out.println(b2.a);
        System.out.println(b2.b);
    }
}
