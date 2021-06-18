
package Dominio;


public class Empleado {
    private int a;
    private String n;
    private double s;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public String getN() {
        return n;
    }

    public void setN(String n) {
        this.n = n;
    }

    public double getS() {
        return s;
    }

    public void setS(double s) {
        this.s = s;
    }
public void mostrar(){
        System.out.println("Nombre: "+this.n+"\nAño de ingreso:  "+this.a+"\nSueldo:  "+this.s);
    
}
}