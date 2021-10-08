import java.util.Scanner ;

public class Ejercicio23 {
    public static void main(String[] args) {
        int contador = 0, numero;
        Scanner lector = new Scanner (System.in) ;

        System.out.println("Si quieres terminar el programa, escribe el número 0.") ;

        for (int i = 0; i < 10; ++i){

            System.out.println("Dame un número:") ;
            numero = lector.nextInt() ;

            if (numero==0){
                break ;
            }
            
            if (numero>=0){
                ++contador ;
            }
        }

        lector.close() ;

        System.out.println("Me has dado "+contador+" números positivos.") ;
    }   
}
