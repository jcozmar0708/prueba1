import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce a");
        int a = sc.nextInt();
        System.out.println("Introduce b");
        int b = sc.nextInt();
        System.out.println("Introduce c");
        int c = sc.nextInt();

        System.out.print("El resultado del apartado a es: ");
        System.out.println(a*b + c*(3-a)/2*b);
        System.out.print("El resutlado del apartado b es: ");
        System.out.println(((2+a*b)/4)^(c+2));
        System.out.print("El resultado del apartado c es: ");
        System.out.println(-b + ((b^2 - 4*a*c)^1/2)/(2*a));
    }
}
