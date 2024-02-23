import java.util.Scanner;

public class Ejerccio2_1 {
    public static void main(String[] args) {
        int A,B;
        System.out.println("Ingrese un valor:");
        Scanner num1 =new Scanner(System.in);
        A=num1.nextInt();
        System.out.println("Ingrese un valor:");
        Scanner num2 =new Scanner(System.in);
        B=num2.nextInt();
        int R=A+B;
        System.out.println("la suma total es : "+R);


    }
}

