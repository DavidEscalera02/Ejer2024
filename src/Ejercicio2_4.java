import java.util.Scanner;

public class Ejercicio2_4 {
    public static void main(String[] args) {
        double R;
        System.out.println("ingrese el radio de la circunferencia : ");
        Scanner sc=new Scanner(System.in);
        R= sc.nextDouble();
        double Pi=3.1416;
        double A=Pi*R*R;
        System.out.println("el area de la circunferencia: "+A);
    }
}
