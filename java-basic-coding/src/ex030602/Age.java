package ex030602;

import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in,"UTF-8");
        System.out.println("あなたの年齢を教えてください");
        int age = scanner.nextInt();

        if ( age < 0 ) {
            System.out.println("生まれていません");  
            
        }
        if( age >= 0 && age <=6 ){
            System.out.println("園児");

        }
        if( age >= 7 && age <= 12 ){
            System.out.println("小学生");

        }
        if ( age >= 13 && age <= 15 ) {
            System.out.println("中学生");
            
        }
        if ( age >= 16 && age <= 18 ){
            System.out.println("高校生");
        }
        if ( age >= 19 && age <= 22 ) {
            System.out.println("大学生");
            
        }
        if ( age >= 23 ) {
            System.out.println("社会人");
            
        }
        scanner.close();
    }
}