package ex030603;

import java.util.Scanner;

public class CompareString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scanner.nextLine();
        if ( "Alice" .equals(name) ) {//Aliceを左にnameを右に　エラーが出にくい
            System.out.println("Hello,Alice!");
            
        }else { 
            System.out.println("You are not Alice.");
        }
        scanner.close();
    }
}
