package ex030402;

import java.util.Scanner;

public class StringBananaPeach {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//トライウィズを確認する。

        System.out.printf("バナナの購入数を入力してください");
        int bnnCount = scanner.nextInt();

        System.out.printf("桃の購入数を入力してください");
        int pchCount = scanner.nextInt();

        int bnnPrice = 100;//小文字表記にする
        int pchPrice = 300;
        
        int result = ( bnnPrice * bnnCount )+( pchPrice * pchCount );

        System.out.printf( bnnPrice + "円のバナナを"+ bnnCount + "個、" + pchPrice + "円の桃を" + pchCount + "個買ったら, 合計" + result + "円になりました。");

        scanner.close();
    }
}
