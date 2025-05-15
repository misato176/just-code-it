package ex0311;

import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {
        int base = 0;
        int dividedNumber = 0;
        int result = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("元となる数字を入力してください。");
        base = scanner.nextInt();

        System.out.print("割る数を入力してください。");
            dividedNumber = scanner.nextInt();

        try {
            result = base/dividedNumber;
            System.out.println(result);

            
        } catch (ArithmeticException e) {
            System.out.print("0で割ることはできません。");

            


            // TODO: handle exception
        }

        

        

        



        
    }
}
//2つの整数を入力し、割り算を行うプログラムを作成してください。
//割る数が0だった場合は、エラーメッセージを表示してください。

// 実行結果例:

//割る数を入力してください: 0
//0で割ることはできません。

//実装のポイント
//ArithmeticExceptionをキャッチする
//ArithmeticException:算術計算で例外的条件が発生した場合にスローされます。 たとえば、整数を「ゼロで除算」するとこのクラスのインスタンスがスローされます。
//例外処理の種類を見分けることが大事。課題では例外処理の指定があるが、実際は使う例外処理を考える必要があるため、
//想定されるエラーからこれらの