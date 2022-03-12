package ejercicio_03;

public class DivisionNumero {
    private int a;
    private int b;

    public DivisionNumero() {
    }

    public DivisionNumero(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
    
    public double resultado() throws ArithmeticException {
        return a/b;
    }

    @Override
    public String toString() {
        return "a = " + a + ", b = " + b + "\nResultado de la division = " + resultado();
    }
    
    
    
}
