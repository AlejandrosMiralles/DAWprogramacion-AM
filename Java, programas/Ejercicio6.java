import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        
        double radius ;
        double length ;
        double area ;

        Scanner inputValue ; 
        inputValue = new Scanner(System.in);
        
        System.out.println("Enter the radius:") ;
        radius = inputValue.nextFloat() ;
        final double pi = 3.14159 ;

        inputValue.close() ;

        length = 2 * pi * radius;
        area = pi * radius * radius ;

        System.out.println("lenght: "+ length);
        System.out.println("Area:"+ area) ;
    }
}
