import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Lê os dados iniciais
        int diaInicial = scanner.nextInt();
        int horaInicial = scanner.nextInt();
        int minutoInicial = scanner.nextInt();
        int segundoInicial = scanner.nextInt();

        // Lê os dados finais
        int diaFinal = scanner.nextInt();
        int horaFinal = scanner.nextInt();
        int minutoFinal = scanner.nextInt();
        int segundoFinal = scanner.nextInt();

        evento(diaInicial, horaInicial, minutoInicial, segundoInicial, diaFinal, horaFinal, minutoFinal, segundoFinal);
        scanner.close();
    }
    public static void evento(int diaInicial, int horaInicial, int minutoInicial, int segundoInicial, int diaFinal, int horaFinal, int minutoFinal, int segundoFinal) {
        // Calcula a diferença de segundos
        int segundosRestantes = segundoFinal - segundoInicial;
        if (segundosRestantes < 0) {
            segundosRestantes += 60;
            minutoFinal -= 1;
        }

        // Calcula a diferença de minutos
        int minutosRestantes = minutoFinal - minutoInicial;
        if (minutosRestantes < 0) {
            minutosRestantes += 60;
            horaFinal -= 1;
        }

        // Calcula a diferença de horas
        int horasRestantes = horaFinal - horaInicial;
        if (horasRestantes < 0) {
            horasRestantes += 24;
            diaFinal -= 1;
        }

        // Calcula a diferença de dias
        int diasRestantes = diaFinal - diaInicial;

        // Imprime o resultado
        System.out.println(diasRestantes + " dia(s)");
        System.out.println(horasRestantes + " hora(s)");
        System.out.println(minutosRestantes + " minuto(s)");
        System.out.println(segundosRestantes + " segundo(s)");
    }

}