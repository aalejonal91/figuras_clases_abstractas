import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String color ;
        double lado;
        /*Scanner c= new Scanner(System.in);
        System.out.println("por favor digite el color del cuadrado: ");
        color=c.next();
        System.out.println("por favor digite el valor del lado del cuadrado: ");
        lado=c.nextDouble();
        Cuadrado cuadrado_1= new Cuadrado(color,lado);
        System.out.println(cuadrado_1);
        System.out.println("el area del cuadrado 1 es: "+cuadrado_1.calcularArea());
        Cuadrado cuadrado_2= new Cuadrado("azul",2.5);
        System.out.println(cuadrado_2);
        System.out.println("el area del cuadrado 1 es: "+cuadrado_2.calcularArea());*/

        Triangulo tr=new Triangulo("verde",10,5);
        System.out.println("el area del triangulo es; "+tr.calcularArea());
    }
}
