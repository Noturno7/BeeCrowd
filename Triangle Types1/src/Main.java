import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        detectarTriangulo();
    }
    static void detectarTriangulo(){
        Scanner scanner = new Scanner(System.in);
        double A,B,C;
        A = scanner.nextDouble();
        B = scanner.nextDouble();
        C = scanner.nextDouble();

        // Ordenando o lado maior.
        double temp;
        if (A < B){
            temp = A;
            A = B;
            B = temp;
        }
        if (A < C){
            temp = A;
            A = C;
            C = temp;
        }
        if (B < C){
            temp = B;
            B = C;
            C = temp;
        }

        // Verificando os lados e imprimindo.
        if ( A >= B + C){
            System.out.println("NAO FORMA TRIANGULO");
            return;
        }
        if ((A * A) == (B * B) + (C * C)){
            System.out.println("TRIANGULO RETANGULO");
        }
        if ((A * A) > (B * B) + (C * C)){
            System.out.println("TRIANGULO OBTUSANGULO");
        }
        if ((A * A) < (B * B) + (C * C)){
            System.out.println("TRIANGULO ACUTANGULO");
        }
        if (A == B && B == C){
            System.out.println("TRIANGULO EQUILATERO");
        }
        if (A == B && A != C || B == C && B != A || A == C && A != B){
            System.out.println("TRIANGULO ISOSCELES");
        }
    }

}