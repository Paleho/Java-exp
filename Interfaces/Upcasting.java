
interface PrintOut{
    void PrintOut(String s);
}

class MyClass implements PrintOut{
    public void PrintOut(String s){
        System.out.printf("Calling through: %s\n", s);
    }
}

class Upcasting{
    public static void main(String[] args){
        MyClass mc = new MyClass();
        mc.PrintOut("object");
        PrintOut ifc = (PrintOut)mc;    //Upcasting
        ifc.PrintOut("interface");
    }
}
