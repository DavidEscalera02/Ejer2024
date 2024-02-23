import java.util.Scanner;

public class Ejercicio2_3 {
    public static void main(String[] args) {
        double A,B;
        System.out.println("ingrese la altura : ");
        Scanner sc1 = new Scanner(System.in);
        A = sc1.nextDouble();
        System.out.println("ingrese la base: ");
        Scanner sc2 = new Scanner(System.in);
        B = sc2.nextDouble();
        double C=B*A;
        System.out.println("el area del rectangulo es :"+C);
    }
}
