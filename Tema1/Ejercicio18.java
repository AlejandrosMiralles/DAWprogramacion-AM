/*Programa que coge una hora, un minuto y un segundo, y devuelve la misma hora, pero con un segundo más*/

import java.util.Scanner ;

public class Ejercicio18 {
    public static void main(String[] args) {
        byte hora, minuto, segundo ;
        Scanner lector = new Scanner(System.in) ;

        hora= lector.nextByte() ;
        minuto = lector.nextByte() ;
        segundo = lector.nextByte() ;

        segundo = segundo + 1 ;

        if (segundo == 60){
            segundo = 0 ;
            minuto = minuto + 1 ;

            if (minuto == 60){
                minuto = 0 ;
                hora= hora + 1 ;
            }
        }




    }
    
}
