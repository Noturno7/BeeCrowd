import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        exibirSequencia();
    }

    static void exibirSequencia() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int soma = 0;
            int M = scanner.nextInt();
            int N = scanner.nextInt();

            // Verifica se ambos os valores são positivos
            if (M > 0 && N > 0) {

                // Organiza M e N de modo que N sempre seja menor ou igual a M
                if (M < N) {
                    int temp = M;
                    M = N;
                    N = temp;
                }

                // Calcula a soma e exibe a sequência
                for (int i = N; i <= M; i++) {
                    System.out.print(i + " ");
                    soma += i;
                }
                System.out.println("Sum=" + soma);
            } else {
                break;
            }
        }
    }
}