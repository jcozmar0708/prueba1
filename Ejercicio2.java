import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la temperatura en grados C");
        double gradosC = sc.nextDouble();
        System.out.println("A que lo quieres convertir, Fahrenheit (F) o Kelvin (K)");
        String conversion = sc.next();
        System.out.println(conversion.equals("F") ? gradosC * 9/5 + 32 : gradosC + 273.15);
    }
}
