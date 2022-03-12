/*
Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para
generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo
fuera de rango).
*/
package ejercicio_02;


public class Main {

    public static void main(String[] args) {
        int[] arr = new int[10];
        
        try{
            arr[11] = 3;
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error: " + e.getClass().getSimpleName());
        }
    }
    
}
