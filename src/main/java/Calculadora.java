
import java.sql.SQLOutput;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        System.out.println("Ingrese los valores de las variables de un sistema de ecuacion de la forma ax+by=c y dx+ey=f:");
        ejecutar();
    }
    public static void ejecutar(){
        double a = 0;
        double b = 0;
        double c = 0;
        double d = 0;
        double e = 0;
        double f = 0;
        double determinante = 0;
        double x = 0;
        double y = 0;
        a = ingresarA(a);
        b = ingresarB(b);
        c = ingresarC(c);
        d = ingresarD(d);
        e = ingresarE(e);
        f = ingresarF(f);
        determinante = calculoDeterminante(a, b, c, d, e, f, determinante);
        if(determinante != 0){
            x = calculoSolucion1(b, c, e, f, determinante);
            y = calculoSolucion2(a, f, c, d, determinante);
            mostrar(x, y);
        }
    }

    public static double ingresarA(double a){
        try{
        Scanner A=new Scanner(System.in);
        System.out.println("Ingrese la variable a: ");
        a = Double.parseDouble(A.nextLine());
        return a;}
        catch (NumberFormatException e){
            System.out.println("El valor ingresado no es valido, ingrese otro valor: ");
            return ingresarA(a);
        }
    }
    public static double ingresarB(double b){
        try{
        Scanner A=new Scanner(System.in);
        System.out.println("Ingrese la variable b: ");
        b = Double.parseDouble(A.nextLine());
        return b;}
        catch (NumberFormatException e){
            System.out.println("El valor ingresado no es valido, ingrese otro valor: ");
            return ingresarB(b);
        }
    }
    public static double ingresarC(double c){
        try{
        Scanner A=new Scanner(System.in);
        System.out.println("Ingrese la variable c: ");
        c = Double.parseDouble(A.nextLine());
        return c;}
        catch (NumberFormatException e){
            System.out.println("El valor ingresado no es valido, ingrese otro valor: ");
            return ingresarC(c);
        }
    }
    public static double ingresarD(double d){
        try{
        Scanner D=new Scanner(System.in);
        System.out.println("Ingrese la variable d: ");
        d = Double.parseDouble(D.nextLine());
        return d;}
        catch (NumberFormatException e){
            System.out.println("El valor ingresado no es valido, ingrese otro valor: ");
            return ingresarD(d);
        }
        }

    public static double ingresarE(double e) {
        try {
            Scanner E = new Scanner(System.in);
            System.out.println("Ingrese la variable e: ");
            e = Double.parseDouble(E.nextLine());
            return e;
        } catch (NumberFormatException ex) {
            System.out.println("El valor ingresado no es valido, ingrese otro valor: ");
            return ingresarE(e);
        }
    }

    public static double ingresarF(double f){
        try{
        Scanner F=new Scanner(System.in);
        System.out.println("Ingrese la variable f: ");
        f = Double.parseDouble(F.nextLine());
        return f;}
        catch (NumberFormatException e){
            System.out.println("El valor ingresado no es valido, ingrese otro valor: ");
            return ingresarF(f);
        }
    }
    public static double calculoDeterminante(double a, double b, double c, double d, double e, double f, double determinante){
        determinante = a * e - b * d;
        if (determinante != 0) {
            return determinante;
        }
        else {
            System.out.println("El sistema de ecuaciones no tiene solución única.");
        }


        return determinante;
    }
    public static double calculoSolucion1(double b, double c, double e, double f, double determinante){
        double x = (c * e - b * f) / determinante;

        return x;

    }
    public static double calculoSolucion2(double a, double f, double c, double d, double determinante){
        double y = (a * f - c * d) / determinante;
        return y;
    }

    public static void mostrar(double x, double y){
        System.out.println("x= "+x);
        System.out.println("y= "+y);
    }
}


