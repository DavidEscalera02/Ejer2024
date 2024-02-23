import java.util.Scanner;

public class Ejercicio2_2 {
    public static void main(String[] args) {
        double c1, c2, c3, c4;
        System.out.println("ingrese la primera calificacion: ");
        Scanner sc1 = new Scanner(System.in);
        c1 = sc1.nextDouble();
        System.out.println("ingrese la segunda calificacion: ");
        Scanner sc2 = new Scanner(System.in);
        c2 = sc2.nextDouble();
        System.out.println("ingrese la tercera calificacion: ");
        Scanner sc3 = new Scanner(System.in);
        c3 = sc3.nextDouble();
        System.out.println("ingrese la cuarta calificacion: ");
        Scanner sc4 = new Scanner(System.in);
        c4 = sc4.nextDouble();
        double S=c1+c2+c3+c4;
        System.out.println("La suma de las calificaciones es: "+S);
        double P=S/4;
        System.out.println("El promedio de las calificaciones es: "+P);
    }
}
