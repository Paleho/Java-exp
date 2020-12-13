
import java.lang.Math;

public class DiceRoll{

    public int diceRoll(){
        int a = (int) Math.round(Math.random() * 5 + 1);
        int b = (int) Math.round(Math.random() * 5 + 1);

        System.out.printf("a = %d, b = %d\n", a, b);
        if(a == b){
            int c = (int) Math.round(Math.random() * 5 + 1);
            int d = (int) Math.round(Math.random() * 5 + 1);
            System.out.printf("c = %d, d = %d\n", c, d);
            return a+b+c+d;
        }
        else{
            return a+b;
        }
    }

    public static void main(String[] args) {
        DiceRoll diceObj = new DiceRoll();
        System.out.printf("diceRoll = %d\n", diceObj.diceRoll());
    }
}
