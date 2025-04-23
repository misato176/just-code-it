package ex030102;

//このプログラムをCalcという名前のクラスを公開して定義すると宣言している　外部からのアクセス可能　エントリーポイント
public class Calc {
    
    public static void main(String[] args) {// この行ではmainメソッドを置くことでここがプログラムのスタート地点であることを宣言している
        // この行で「今から計算する！」をコンソールに出現させている。
        System.out.println("今から計算する！");
        

        int a = 100;
        int b = 200;
        int c = a + b;
        System.out.println("結果は" + c + "です！");
    }
}
