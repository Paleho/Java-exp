class A {
    int a;
    public A(int a) {
        this.a = a;
    }
    public int TimesTwo() {
        return this.a * 2;
    }
}

class B extends A {
    int b;
    public B(int a, int b) {
        super(a);
        this.b = b;
    }
    public int TimesThree() {
        return this.b * 3;
    }
}

public class Up1 {
    static void PrintTimes(A objA) {
        System.out.println(objA.TimesTwo());
    }
    public static void main(String[] args) {
        A aObj = new A(2);
        B bObj = new B(3, 3);
        PrintTimes(aObj);
        PrintTimes(bObj);   //implicit upcasting
    }
}
