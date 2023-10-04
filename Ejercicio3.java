import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantas pizzas han pedido");
        int pizzas = sc.nextInt();
        System.out.println("Cuantos amigos son");
        int amigos = sc.nextInt();
        System.out.println("En cuanto se dividen las pizzas");
        int porciones = sc.nextInt();
        int numeroPorciones = pizzas * porciones;
        System.out.print("Cada amigo toca a: ");
        System.out.println(numeroPorciones/amigos);
        System.out.print("Sobran: ");
        System.out.println(numeroPorciones%amigos);

    }
}
