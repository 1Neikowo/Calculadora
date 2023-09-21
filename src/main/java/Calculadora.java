package org.example;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        ejecutar();
    }
    public static void ejecutar(){
        double a = 0;
        double b = 0;
        double c = 0;
        double discriminante = 0;
        double x1 = 0;
        double x2 = 0;
        a = ingresarA(a);
        b = ingresarB(b);
        c = ingresarC(c);
        discriminante = cuadratica(a, b, c);
        if(discriminante > 0){
            x1 = calcularCuadratica1(x1, a, b, c, discriminante);
            x2 = calcularCuadratica2(x2, a, b, c, discriminante);
            mostrarResultados(x1, x2);
        }
        else if(discriminante == 0){
            x1 = calcularCuadratica1(x1, a, b, c, discriminante);
            mostrarUnResultado(x1);
        }
    }

    public static double ingresarA(double a){
        try{Scanner A=new Scanner(System.in);
        System.out.println("Ingrese la variable a: ");
        a = Double.parseDouble(A.nextLine());
        while (a == 0){
            System.out.println("El valor de a no puede ser 0, ingrese otro valor: ");
            a = Double.parseDouble(A.nextLine());
        }
        return a;}
        catch (NumberFormatException e){
            System.out.println("El valor ingresado no es valido, ingrese otro valor: ");
            return ingresarA(a);
        }
    }
    public static double ingresarB(double b){
        try{Scanner B=new Scanner(System.in);
        System.out.println("Ingrese la variable b: ");
        b = Double.parseDouble(B.nextLine());
        return b;}
        catch (NumberFormatException e){
            System.out.println("El valor ingresado no es valido, ingrese otro valor: ");
            return ingresarB(b);
        }
    }
    public static double ingresarC(double c){
        try{Scanner C=new Scanner(System.in);
        System.out.println("Ingrese la variable c: ");
        c = Double.parseDouble(C.nextLine());
        return c;}
        catch (NumberFormatException e){
            System.out.println("El valor ingresado no es valido, ingrese otro valor: ");
            return ingresarC(c);
        }
    }
    public static double cuadratica(double a, double b, double c){
        double discriminante = b * b - 4 * a * c;
        if(discriminante < 0){
            System.out.println("El discriminante es menor que 0, por lo cual la ecuacion no tiene soluciones en los reales.");
        }
        else if(discriminante == 0){
            System.out.println("El discriminante es igual a 0, por lo cual la ecuacion tiene 1 solucion en los reales.");
        }
        else if(discriminante > 0){
            System.out.println("El discriminante es mayor que 0, por lo cual la ecuacion tiene 2 soluciones en los reales.");
        }
    return discriminante;

    }
    public static double calcularCuadratica1(double x1, double a, double b, double c, double discriminante){
        x1=(-b + Math.sqrt(discriminante)) / (2 * a);
        return x1;
    }
    public static double calcularCuadratica2(double x2, double a, double b, double c, double discriminante){
        x2=(-b - Math.sqrt(discriminante)) / (2 * a);
        return x2;
    }
    public static void mostrarResultados(double x1, double x2){
    System.out.println("La primera raiz de la ecuacion es: " + x1);
    System.out.println("La segunda raiz de la ecuacion es: " + x2);
    }
    public static void mostrarUnResultado(double x1){
        System.out.println("La unica raiz de la ecuacion es: " + x1);
    }

}

}
