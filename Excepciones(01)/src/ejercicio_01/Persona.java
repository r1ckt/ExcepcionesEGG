package ejercicio_01;

import java.util.Locale;
import java.util.Scanner;

public class Persona {

    private String nombre;
    private int edad;
    private String sexo;
    private double peso;
    private double altura;

    public Persona() {

    }

    public Persona(String nombre, int edad, String sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void crearPersona(int num) {
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        
        System.out.printf("\nIngrese nombre de la persona %d\n", num);
        nombre = read.next();
        System.out.printf("Ingrese edad de la persona %d\n", num);
        edad = read.nextInt();
        System.out.printf("Ingrese sexo de la persona %d\n", num);
        sexo = read.next().toUpperCase();
        
        while (!(sexo.equals("M") || sexo.equals("F") || sexo.equals("O"))) {
            System.out.println("Error! Sexo mal ingresado, vuelva a hacerlo (M , F, O)");
            sexo = read.next().toUpperCase();
        }
        
        System.out.printf("Ingrese el peso de la persona %d\n", num);
        peso = read.nextDouble();
        System.out.printf("Ingrese altura de la persona %d\n", num);
        altura = read.nextDouble();
    }

    public int calcularImc() {
        double imc = this.peso / Math.pow(this.altura, 2);
        
        if (imc < 20) {
            return -1;
        } else if (imc >= 20 && imc <= 25) {
            return 0;
        } else {
            return 1;
        }

    }

    public boolean mayorDeEdad() {
        return this.edad >= 18;
    }
}