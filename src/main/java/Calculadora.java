import java.util.Scanner;

import static java.lang.Math.sqrt;
public class Calculadora {
    public static void main(String[] args) {
        menu();
    }

    public static double perimetroCuadrado(double lado) {
        return lado * 4;
    }

    public static double areaCuadrado(double lado) {
        return lado * lado;
    }

    public static double perimetroRectangulo(double base, double altura) {
        return base * 2 + altura * 2;
    }

    public static double areaRectangulo(double base, double altura) {
        return base * altura;
    }

    public static double circunferenciaCirculo(double radio) {
        return 2 * Math.PI * radio;
    }

    public static double areaCirculo(double radio) {
        return Math.PI * radio * radio;
    }

    public static double areaEsfera(double radio) {
        return 4 * Math.PI * radio * radio;
    }

    public static double volumenEsfera(double radio) {
        return Math.PI * Math.pow(radio, 3) * (double) 4 / 3;
    }

    public static double areaCubo(double lado) {
        return 6 * lado * lado;
    }

    public static double volumenCubo(double lado) {
        return lado * lado * lado;
    }

    public static double areaCono(double radio, double altura) {
        return Math.PI * radio * (radio + (sqrt(radio * radio + altura * altura)));
    }

    public static double volumenCono(double radio, double altura) {
        return (Math.PI * altura * radio * radio) / 3;
    }

    public static int pedirInt() {
        Scanner teclado = new Scanner(System.in);

        try {
            int ans= teclado.nextInt();
            if (ans <= 0) {
                System.out.println("Ingrese un valor mayor a cero");
                return pedirInt();
            }else {
                return ans;
            }
        }catch (Exception e) {
            System.out.println("Ingrese un número válido");
            return pedirInt();
        }
    }
    public static double pedirDouble() {
        Scanner teclado = new Scanner(System.in);
        try {
            double ans = teclado.nextDouble();
            if (ans <= 0) {
                System.out.println("Ingrese un valor mayor a cero");
                return pedirDouble();
            }else {
                return ans;
            }
        }catch (Exception e) {
            System.out.println("Ingrese un número válido");
            return pedirDouble();
        }
    }

    public static void menu() {
        System.out.println("1. Calcular el perimetro de un cuadrado");
        System.out.println("2. Calcular el area de un cuadrado");
        System.out.println("3. Calcular el perimetro de un rectángulo");
        System.out.println("4. Calcular el area de un rectángulo");
        System.out.println("5. Calcular el perimetro de un círculo");
        System.out.println("6. Calcular el area de un círculo");
        System.out.println("7. Calcular el area de una esfera");
        System.out.println("8. Calcular el volumen de una esfera");
        System.out.println("9. Calcular el area de un cubo");
        System.out.println("10. Calcular el volumen de un cubo");
        System.out.println("11. Calcular el area de un cono");
        System.out.println("12. Calcular el volumen de un cono");
        System.out.println("13. Salir");
        System.out.println("\nIngrese una opcion: ");
        int ans = pedirInt();
        llamarMetodos(ans);
        menu();
    }
    public static void llamarMetodos(int opcion) {
        double lado , base, altura, radio;
        switch (opcion) {
            case 1:
                System.out.println("Ingrese el lado del cuadrado: ");
                lado = pedirDouble();
                System.out.println("El perimetro del cuadrado es: " + perimetroCuadrado(lado));
                break;
            case 2:
                System.out.println("Ingrese el lado del cuadrado: ");
                lado = pedirDouble();
                System.out.println("El area del cuadrado es: " + areaCuadrado(lado));
                break;
            case 3:
                System.out.println("Ingrese la base del rectángulo: ");
                base = pedirDouble();
                System.out.println("Ingrese la altura del rectángulo: ");
                altura = pedirDouble();
                System.out.println("El perimetro del rectángulo es: " + perimetroRectangulo(base, altura));
                break;
            case 4:
                System.out.println("Ingrese la base del rectángulo: ");
                base = pedirDouble();
                System.out.println("Ingrese la altura del rectángulo: ");
                altura = pedirDouble();
                System.out.println("El area del rectángulo es: " + areaRectangulo(base, altura));
                break;
            case 5:
                System.out.println("Ingrese el radio del círculo: ");
                radio = pedirDouble();
                System.out.println("La circunferencia del círculo es: " + circunferenciaCirculo(radio));
                break;
            case 6:
                System.out.println("Ingrese el radio del círculo: ");
                radio = pedirDouble();
                System.out.println("El area del círculo es: " + areaCirculo(radio));
                break;
            case 7:
                System.out.println("Ingrese el radio de la esfera: ");
                radio = pedirDouble();
                System.out.println("El area de la esfera es: " + areaEsfera(radio));
                break;
            case 8:
                System.out.println("Ingrese el radio de la esfera: ");
                radio = pedirDouble();
                System.out.println("El volumen de la  esfera es: " + volumenEsfera(radio));
                break;
            case 9:
                System.out.println("Ingrese el lado del cubo: ");
                lado = pedirDouble();
                System.out.println("El area del cubo es: " + areaCubo(lado));
                break;
            case 10:
                System.out.println("Ingrese el lado del cubo: ");
                lado = pedirDouble();
                System.out.println("El volumen del cubo es: " + volumenCubo(lado));
                break;
            case 11:
                System.out.println("Ingrese el radio del cono: ");
                radio = pedirDouble();
                System.out.println("Ingrese la altura del cono");
                altura = pedirDouble();
                System.out.println("El area del cono es: " + areaCono(radio, altura));
                break;
            case 12:
                System.out.println("Ingrese el radio del cono: ");
                radio = pedirDouble();
                System.out.println("Ingrese la altura del cono");
                altura = pedirDouble();
                System.out.println("El volumen del cono es: " + volumenCono(radio, altura));
                break;
            case 13:
                System.out.println("Saliendo...");
                System.exit(0);
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }

    }
}
