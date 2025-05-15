package ex0311;

public class ArrayAccess {

    public static void main(String[] args) {

        int[] number = { 2, 4, 4, 5 };
        
        try {

            System.out.println(number[number.length+1]);

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.printf(number.length+1 + "番目の要素は存在しません。"); // TODO: handle exception
            // System.out.println(e);
        }

    }

}
