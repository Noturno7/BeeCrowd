import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroDeTestes = scanner.nextInt();

        if (numeroDeTestes >= 1 && numeroDeTestes <= 3000) {
            for (int contador = 0; contador < numeroDeTestes; contador++) {
                int populacao1 = scanner.nextInt();
                int populacao2 = scanner.nextInt();
                double G1 = scanner.nextDouble();
                double G2 = scanner.nextDouble();

                int anosNecessarios = 0;

                    while (populacao1 <= populacao2 && anosNecessarios <= 100) {
                        populacao1 = (int) (populacao1 * (G1 / 100));
                        populacao2 = (int) (populacao2 * (G2 / 100));
                        anosNecessarios++;

                        if (anosNecessarios > 100) {
                            System.out.println("Mais de 1 seculo.");
                        } else {
                            System.out.println(anosNecessarios + " anos.");
                        }
                    }
            }
        }
        scanner.close();
    }
}
