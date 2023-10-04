import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce a");
        double a = sc.nextDouble();
        System.out.println("Introduce b");
        double b = sc.nextDouble();
        System.out.println("Introduce c");
        double c = sc.nextDouble();

        System.out.print("El resultado del apartado a es: ");
        System.out.println(a*b + c*(3-a)/2*b);
        System.out.print("El resutlado del apartado b es: ");
        System.out.println(Math.pow((2+ a*b)/4,c+2));
        System.out.print("El resultado del apartado c es: ");
        System.out.println((-b + Math.sqrt(Math.pow(b,2) - 4*a*c))/(2*a));
    }
}
