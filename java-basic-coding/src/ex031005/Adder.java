package ex031005;

public class Adder {
    public static int total(int num1, int num2) {
        int result = num1 + num2;
        return (result);
    }

    public static void main(String[] args) {
        System.out.print(total(3, 5) + "\n");
        System.out.print(total(10, 20) + "\n");
        System.out.print(total(7, 13) + "\n");
    }
}
