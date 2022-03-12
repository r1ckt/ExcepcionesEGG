/*
Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para
leer dos números en forma de cadena. A continuación, utilice el método parseInt() de la
clase Integer, para convertir las cadenas al tipo int y guardarlas en dos variables de tipo
int. Por ultimo realizar una división con los dos numeros y mostrar el resultado.
 */
package ejercicio_03;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        DivisionNumero division = new DivisionNumero();
        boolean continuar = true;
        double resultado;
        
        do{
        try {
            System.out.println("Ingrese el primer numero: ");
            String numStr = scan.next();
            System.out.println("Ingrese el segundo numero: ");
            String numStr2 = scan.next();
            
            int num = Integer.valueOf(numStr);
            int num2 = Integer.valueOf(numStr2);

            division.setA(num);
            division.setB(num2);
            
            System.out.println(division.toString());

            continuar = false;

        } catch (NumberFormatException | ArithmeticException e) {
           
            System.out.println("Error: " + e.getClass().getSimpleName());
        } 
        }while(continuar);
    }

}
