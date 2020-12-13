class A{
    public void printString(String value){
        System.out.println("A.printString: " + value);
    }
}
class B extends A{
    public void printString(String value){
        System.out.println("B.printString: " + value);
    }

    public void bMeth(){
        System.out.println("this is a pipe");
    }
}

public class AB{
    public static void main(String[] args){
        A aobj = new A(); //Δημιουργία αντικειμένου της Α
        B bObj = new B(); //Δημιουργία αντικειμένου της Β
        A abObj = (A)bObj; //Δημιουργία αναφοράς Α σε αντικείμενο της Β

        aobj.printString("Hello"); //κανονική κλήση της μεθόδου της Α
        bObj.printString("Hello"); //Override! κλήση της μεθόδου της Β
        abObj.printString("Hello");//Override! κλήση της μεθόδου της B
        //abObj.bMeth();    //error: cannot find symbol, variable abObj of type A
    }
}
