package field;

import com.sun.deploy.net.proxy.StaticProxyManager;

public class Field {
    private char [][] field = new char [FIELD_SIZE_MAX][FIELD_SIZE_MAX];
    private static final int FIELD_SIZE_MAX = 3;
    private static final char DEFFAULT_CELL_VALUE = ' ' ;
    private final char x1 = 'x' ;
    private final char o1 = 'o' ;

    public void eraseField (){
        for(int i = 0 ; i < FIELD_SIZE_MAX ; i ++) {
            eraseLine(i);
            }
        }
        public void showField () {
        for(int i = 0  ; i < FIELD_SIZE_MAX ; i++) {
         showLine(i) ;
            }
        }
    private void showLine(int lineNumber) {
        for (int i = 0 ; i < FIELD_SIZE_MAX ; i++)  {
            ShowCell(i , lineNumber );

        }    System.out.println();
    }
    private void eraseLine (int lineNumber) {
           for (int i = 0; i < FIELD_SIZE_MAX ; i++) {
               field[i][lineNumber] = DEFFAULT_CELL_VALUE  ;
           }
    }
    private void ShowCell (int x , int y){
        System.out.print("["+ field[x][y] +"]");

    }
   public int qwe = 10 ;
   public int setI()
   {
       return qwe ;
   }

   public void writeXOrYInField(char i ,int  y , int z) {
       if (i == x1 || i == o1) {
            field[y][z] =  i ;
            showField();
       }
       else {
           System.out.println("ERROR");
       }
       }




 }

