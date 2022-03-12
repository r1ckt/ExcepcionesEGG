/*
Todas estas operaciones puede tirar excepciones a manejar, el ingreso por teclado
puede causar una excepción de tipo InputMismatchException, el método
Integer.parseInt() si la cadena no puede convertirse a entero, arroja una
NumberFormatException y además, al dividir un número por cero surge una
ArithmeticException. Manipule todas las posibles excepciones utilizando bloques
try/catch para las distintas excepciones
 */
package ejercicio_04;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        
        System.out.println("Primer bloque try/catch");
        try {
            System.out.println("Ingrese dos numeros enteros para realizar una division: ");
            int a = scan.nextInt();
            int b = scan.nextInt();
            double resultado = a / b;

        } catch (ArithmeticException | InputMismatchException e) {
            System.out.println("Error: " + e.getClass().getSimpleName());
        }
        System.out.println();
        
        System.out.println("Segundo bloque try/catch");
        String letra = "b";
        try {
            int c = Integer.parseInt(letra);
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.getClass().getSimpleName());

        }
    }

}
