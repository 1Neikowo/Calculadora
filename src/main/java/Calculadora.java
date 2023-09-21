import java.util.InputMismatchException;
import java.util.Scanner;
public class Calculadora {
    public static void main(String args[]) {
        ejecutar();
    }
    public static void ejecutar(){
        Scanner sc = new Scanner(System.in);
        double[] a = new double[2];
        double[] b = new double[2];
        boolean valorvalido = false;
        boolean valorvalido2=false;
        String respuesta;
        String entrada;
        do {
            System.out.println("Bienvenido/a a la Calculadora de Ecuaciones de Recta");
            try {

                System.out.println("Ingrese las coordenadas del primer punto");
                System.out.println("Ingrese la coordenada x: ");
                a[0] = sc.nextDouble();
                System.out.println("Ingrese la coordenada y: ");
                a[1] = sc.nextDouble();
                System.out.println("Ingrese las coordenadas del segundo punto");
                System.out.println("Ingrese la coordenada x: ");
                b[0] = sc.nextDouble();
                System.out.println("Ingrese la coordenada y: ");
                b[1] = sc.nextDouble();
                validacionpuntos( a,  b);
                valorvalido = true;
                ecuacionRecta(a, b);

            } catch (ArithmeticException e) {
                System.err.println(e.getMessage());
                sc.nextLine();
            } catch (InputMismatchException e) {
                System.err.println("Ingresa valores double para las coordenadas de los puntos");
                sc.nextLine();
            }

        }while (!valorvalido);
        valorvalido = false;
        do{
            try {
                System.out.println("¿Desea calcular otra ecuación de la recta? ");
                System.out.println("Ingrese si o no");
                respuesta = sc.next().toLowerCase();
                if (respuesta.equals("si")) {
                    main(args);
                } else if (respuesta.equals("no")) {
                    System.out.println("Hasta pronto!");
                    System.exit(0);
                } else {
                    throw new InputMismatchException("Ingresa una respuesta valida");
                }
                valorvalido2 = true;
            }catch (InputMismatchException e) {
                System.err.println(e.getMessage());
                sc.nextLine();
            }
        }while(!valorvalido2);
        valorvalido2 = false;


    }

    public static void ecuacionRecta ( double[] a, double[] b){
        double m = (b[1] - a[1]) / (b[0] - a[0]);
        double coeficiente = m * (-a[0]) + a[1];
        System.out.println("La ecuación de la recta es: Y = " + m + "x +" + coeficiente);

    }
    public static ArithmeticException validacionpuntos(double [] a, double[] b){
        if (a[0] == b[0]) {
            throw new ArithmeticException("Los puntos no pueden ser iguales");
        }
        return null;
    }
}

