public class IncDec{
    public static void main(String[] args) {
        int value = 3, sum = 6 + -- value;
        System.out.printf("%d %d\n", value, sum);

        int data = --value + ++value / sum++ * value++ + ++sum % value--;
        System.out.printf("%d\n", data);

        data = 2 / 8 * 4;
        System.out.printf("%d\n", data);

        data = 2 * 4 / 8;
        System.out.printf("%d\n", data);
    }
}
