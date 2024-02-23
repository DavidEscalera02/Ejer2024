import java.util.Scanner;

public class Ejercicio2_6 {
    public static void main(String[] args) {
        double R,H;
        System.out.println("ingrese la base del triangulo rectangulo y radio :  ");
        Scanner sc =new Scanner(System.in);
        R= sc.nextDouble();
        System.out.println("ingrse la hipotenusa del triangulo rectangulo : ");
        Scanner sc1 =new Scanner(System.in);
        H=sc1.nextDouble();
        double C=Math.sqrt(H-R);
        System.out.println("cateto faltante "+C);
        double At=2*(R*C)/2;
        System.out.println("el area del triangulo es :"+At);
        double Ac=(3.1416*R*R)/2;
        System.out.println("El area circular es:"+Ac);
        double Area=At+Ac;
        System.out.println("el area total es :"+Area);

    }
}
