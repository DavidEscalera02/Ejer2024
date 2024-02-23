import java.util.Scanner;

public class Ejercicio2_5 {
    public static void main(String[] args) {
        double A,B,C;
        System.out.println("ingrese la Base del triangulo y del rectangulo es : ");
        Scanner sc=new Scanner(System.in);
        B = sc.nextDouble();
        System.out.println("ingrese la Altura del triangulo y rectangulo unidos es:  ");
        Scanner sc1=new Scanner(System.in);
        A= sc1.nextDouble();
        System.out.println("ingrese la altura del recatangulo es :");
        Scanner sc2=new Scanner(System.in);
        C=sc2.nextDouble();
        double At=(B*(A-C))/2;
        System.out.println("El Area del triangulo es :"+At);
        double Ar=(B*A);
        System.out.println("el Area del recatangulo es :"+Ar);
        double Area=At+Ar;
        System.out.println("el Area de la figura es :"+Area);


    }
}
