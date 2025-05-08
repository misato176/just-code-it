package ex031004;

public class EvenOrOddChecker {
    public static boolean evenOrOddCheck(int number) {
        //if文で数値が偶数（0 = number%2）か奇数（0 < number%2）かを確認する。
        
        int over;

        over = number % 2;

        if( over == 0 ){  //偶数の場合はtrueを返す。
            return true;

           
        } else{
            return false; //奇数の場合はfalseを返す。

        }
            
    }

        
    public static void main(String[] args) {
        boolean result0 = evenOrOddCheck(4);
        System.out.print( result0 + "\n" );
        boolean result1 = evenOrOddCheck(7);
        System.out.print( result1 + "\n" );
        boolean result2 = evenOrOddCheck(10);
        System.out.print( result2 + "\n" );
        boolean result3 = evenOrOddCheck(13);
        System.out.print( result3 + "\n" );

        // System.out.print();
        // System.out.print(evenOrOddCheck(7));
        // System.out.print(evenOrOddCheck(10));
        // System.out.print(evenOrOddCheck(13));

        // int [] argment = new int[4]; //配列の箱の数を定義
        // argment[0] = 4;
        // argment[1] = 7;
        // argment[2] = 10;
        // argment[3] = 13;               チェッカーの引数がint型のため配列の使用はできない。

        // boolean result;

        // for( int i = 0; i < 4; i++ ){
        //     int target = argment[i];
        //     result = evenOrOddCheck( target );//argmentを０からevenOrOddCheckにかける
            
        //     System.out.print( result );//戻り値をSystem.out.print（）で表示する。
        // }


    }



}
