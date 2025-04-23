package ex030203;

public class Swapping {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        int temp = a;//ToDO 入れ替え処理 ←このように記載するのはこの部分がまだ仮置き状態であることをメンバに示すため
        a = b;
        b = temp;
        System.out.println("After swapping: a = " + a + ", b = " + b);

    }

}
