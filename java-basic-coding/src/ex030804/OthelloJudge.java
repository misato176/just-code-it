package ex030804;

public class OthelloJudge {
    public static void main(String[] args) {


        //配列の初期値を設定
        String[][] othello = {
            {"○","○","○","○","○",},
            {null,null,"●","○",null,},
            {null,"●","○","●","●",},
            {null,"●",null,"●",null,},
            {null,null,null,null,"●",},


        };

        
        int white=0;
        int black=0;

        //配列の中に値があるか、その値が白丸か黒丸かを判定する？
        for(String [] x : othello ){            //ocello配列のある行についてその行の要素分だけ下記の処理を繰り返す
            if ( x != null ){                    //空の要素にはif文でチェックする　if (names[i] != null)
                for ( String Circle : x ){

                    if( Circle == "○" ){         //白丸だった場合はこちらでカウント
                        white += 1;

                    }
                    if( Circle == "●" ){                       //黒丸だった場合はこちらでカウント
                        black += 1;
                    }
                         
                }
                
                
            }
            
        };
        
        System.out.println( "○：" + white );//白丸、黒丸それぞれの数を出現させる
        System.out.println( "●：" + black );

        if( white == black ){               //白丸、黒丸それぞれの数が同じだった場合に「引き分け」を出現させる。
            System.out.println( "引き分け" );
        }


    }


// String a="c";
// String b="c";
// a.equals(b);

// int c=1;
// int d=1;
// if(c==d){
//     System.out.println(true);
// };
    
}
