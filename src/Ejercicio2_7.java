import java.util.Scanner;

public class Ejercicio2_7 {
    public static void main(String[] args) {
        int L;
        System.out.println("la cantidad de litros que se produce es: ");
        Scanner sc = new Scanner(System.in);
        L = sc.nextInt();
        double PG;
        System.out.println("El precio del galon es:");
        Scanner sc1 = new Scanner(System.in);
        PG = sc1.nextDouble();
        double TG=(L/3.785);
        System.out.println("La cantidad de galones que se produce es:"+TG);
        double GA=PG*TG;
        System.out.println("la ganacia por la entrega de la leche es :"+GA);
    }
}
