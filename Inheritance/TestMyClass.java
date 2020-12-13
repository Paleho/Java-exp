class MyClass{
    String hello = "Hello, Dear.";
    void printmsg(){
        System.out.println(hello);
    }
}

class TestMyClass{
    public static void main(String[] args) {
        MyClass mc = new MyClass();
        mc.printmsg();
    }
}
