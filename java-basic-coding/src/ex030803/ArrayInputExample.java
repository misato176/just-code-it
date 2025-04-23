package ex030803;

import java. util. Scanner;

public class ArrayInputExample {
    public static void main(String[] args) {
       String[] lists = new String[5];
       Scanner scanner = new Scanner(System.in);//スキャナーを出現させる
       

       for(int i = 0 ; i < 5; i++){
          int box = (i + 1);
          System.out.println( box + "人目の名前を入力してください:");
          String name = scanner.nextLine();
          

          lists[i] = name;
          System.out.println(name);
          
        }

        System.out.println("入力された名前一覧");

          for(String name : lists){
            System.out.println( name );
          }

          scanner.close();

    }
}
