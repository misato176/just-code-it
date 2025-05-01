package ex030402;

import java.util.Scanner;

public class StringBananaPeach {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//トライウィズを確認する。

        System.out.printf("バナナの購入数を入力してください");
        int num1 = scanner.nextInt();

        System.out.printf("桃の購入数を入力してください");
        int num2 = scanner.nextInt();

        int BNN = 100;//小文字表記にする
        int PCH = 300;
        
        int result = ( BNN * num1 )+( PCH * num2 );

        System.out.printf( BNN + "円のバナナを"+ num1 + "個、" + PCH + "円の桃を" + num2 + "個買ったら, 合計" + result + "円になりました。");

        scanner.close();
    }
}
