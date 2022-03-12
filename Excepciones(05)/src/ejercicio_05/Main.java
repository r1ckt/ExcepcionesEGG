/*
Escribir un programa en Java que juegue con el usuario a adivinar un número. La
computadora debe generar un número aleatorio entre 1 y 500, y el usuario tiene que
intentar adivinarlo. Para ello, cada vez que el usuario introduce un valor, la computadora
debe decirle al usuario si el número que tiene que adivinar es mayor o menor que el que
ha introducido el usuario. Cuando consiga adivinarlo, debe indicárselo e imprimir en
pantalla el número de veces que el usuario ha intentado adivinar el número. Si el usuario
introduce algo que no es un número, se debe controlar esa excepción e indicarlo por
pantalla. En este último caso también se debe contar el carácter fallido como un intento
 */
package ejercicio_05;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        int random = (int) (Math.random() * 500) + 1;
        int cont = 0;
        // System.out.println(random);

        System.out.println("Adivine el número entre 1 y 500: ");

        while (true) {
            try {
                int input = scan.nextInt();

                if (input == random) {
                    System.out.println("Correcto!!!");
                    break;
                }
                if (input != random) {
                    if (random > input) {
                        System.out.println("El numero es mayor que el ingresado!");
                    } else {
                        System.out.println("El numero es menor que el ingresado!");
                    }
                }
                cont++;
            } catch (InputMismatchException e) {
                System.out.println("Error: debe ingresar un numero entero");
            }
        }
        System.out.println("Numero de veces intentados: " + cont);

    }

}
