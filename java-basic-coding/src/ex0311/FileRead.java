package ex0311;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.File;

public class FileRead {
    public static void main(String[] args) {
        File file = new File("arimosinai.txt");

        try {
            FileReader reader = new FileReader(file);
            System.out.printf("ファイルが見つかりました。");

        } catch (FileNotFoundException e) {
            System.out.printf("ファイルが見つかりませんでした。");

            // TODO: handle exception
        }

        // if(Files.exists(faile)){
        // System.out.printf(faile + "を呼び出します。");

        // }

        // スキャナーを使用してファイルを呼び出す。
        //File file ＝ new File ("ファイル名と形式")
        // try(){}catch(IOException e){};

        // ファイルクラスに指定パスを入れて探してもらう。
        // System.IO.File.Existsメソッド:ファイルが存在するかを確認できるメソッド

        // FileReaderはJavaの標準ライブラリに含まれるクラスで、
        // テキストファイルを読み込むために使用される。テキストファイルの文字データを読み取る。
        // 文字を読み込むメソッドとしては1文字ずつ読み込むreadメソッドのみとなる。

    }
}
