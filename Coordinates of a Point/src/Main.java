import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double primeiraCordenada = scanner.nextDouble();
        double segundaCordenada = scanner.nextDouble();

        planoCartesiano(primeiraCordenada, segundaCordenada);
    }

    private static void planoCartesiano(double primeiraCordenada, double segundaCordenada) {
        if (primeiraCordenada > 0 && segundaCordenada < 0){
            System.out.println("Q4");
        }
        else if(primeiraCordenada > 0 && segundaCordenada > 0){
            System.out.println("Q1");
        }
        else if(primeiraCordenada < 0 && segundaCordenada < 0){
            System.out.println("Q3");
        }
        else if(primeiraCordenada < 0 && segundaCordenada > 0){
            System.out.println("Q2");
        }
        else if(primeiraCordenada == segundaCordenada){
            System.out.println("Origem");
        }
        else if (primeiraCordenada == 0.0){
            System.out.println("Eixo Y");
        }
        else if (segundaCordenada == 0.0){
            System.out.println("Eixo X");
        }
    }
}