
package Test;

import Dominio.Empleado;
import java.util.ArrayList;
import java.util.Scanner;


public class ejecutae {

    
    public static void main(String[] args) {
         ArrayList<Empleado> emp;
        emp = new ArrayList();
        Scanner e = new Scanner(System.in);
        Empleado e1= new Empleado();
        int a,b,c,d;
        double s,j;
        String  n;
        do{
            System.out.println("1.-Añadir un nuevo empleado.");
            System.out.println("2.-Mostrar todos los empleados.");
            System.out.println("3.-Mostrar porcentaje de empleados que no reciben bono.");
            System.out.println("4.-Salir");
            b=e.nextInt();
            switch(b){
                case 1:
                    e.nextLine();
                    System.out.println("Ingrese el nombre:");
                    n=e.nextLine();
                    System.out.println("Escriba el anio en el que ingreso a la empresa:");
                    a=e.nextInt();
                    System.out.println("Ingrese el sueldo que va a recibir:");
                    s=e.nextDouble();
                    e1.setN(n);
                    e1.setA(a);
                    e1.setS(s);
                    emp.add(e1);
                    break;
                case 2:
                    for(int i=0;i<emp.size();i++){
                        d=2021-emp.get(i).getA();                       
                        if( d > 4){
                           j=emp.get(i).getS();
                           j=j+100;
                           emp.get(i).setS(j);
                        }
                        if(d > 9){
                            j=emp.get(i).getS();
                           j=j+150;
                           emp.get(i).setS(j);
                        }
                     }
                    for(int i=0;i<emp.size();i++){
                        emp.get(i).mostrar();
                    }
                    break;
                case 3:
                    c=0;
                     for(int i=0;i<emp.size();i++){
                        d=2021-emp.get(i).getA();                       
                        if( d < 4){
                          c++;
                        }
                     }
                     a=emp.size();
                     d=(c*100)/a;
                     System.out.println("EL porcentaje de emp: "+d);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opcion no valida.");
                    break;
            }
        }while(b!=4);
    }
    
}
