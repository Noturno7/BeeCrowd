import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        tempoDeJogo();
    }

    static void tempoDeJogo() {
        Scanner scanner = new Scanner(System.in);

        int horaInicial, minutoInicial, horaFinal, minutoFinal;

        // Lendo as entradas
        horaInicial = scanner.nextInt();
        minutoInicial = scanner.nextInt();
        horaFinal = scanner.nextInt();
        minutoFinal = scanner.nextInt();

        // Calculando o tempo total em minutos
        int inicioEmMinutos = horaInicial * 60 + minutoInicial;
        int finalEmMinutos = horaFinal * 60 + minutoFinal;

        int duracaoEmMinutos;

        // Caso o jogo termine no dia seguinte ou no mesmo dia
        if (inicioEmMinutos <= finalEmMinutos) {
            duracaoEmMinutos = finalEmMinutos - inicioEmMinutos;
        } else {
            duracaoEmMinutos = (24 * 60 - inicioEmMinutos) + finalEmMinutos;
        }

        // Convertendo a duração de minutos para horas e minutos
        int horasDeJogo = duracaoEmMinutos / 60;
        int minutosDeJogo = duracaoEmMinutos % 60;

        // Se a duração for exatamente 0 horas e 0 minutos, consideramos 24 horas
        if (horasDeJogo == 0 && minutosDeJogo == 0) {
            horasDeJogo = 24;
        }

        System.out.println("O JOGO DUROU " + horasDeJogo + " HORA(S) E " + minutosDeJogo + " MINUTO(S)");
    }
}
