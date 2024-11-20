#include <stdio.h>

int main() {
    int N;

    // Lê o valor de entrada
    scanf("%d", &N);

    // Garante que N está no intervalo permitido
    if (N <= 0 || N >= 46) {
        return 1; // Saída com erro, mas não necessário para o problema
    }

    int sequenciaF[46];

    // Inicializa os dois primeiros valores da sequência Fibonacci
    sequenciaF[0] = 0;
    sequenciaF[1] = 1;

    // Calcula a sequência de Fibonacci até o N-ésimo número
    for (int i = 2; i < N; i++) {
        sequenciaF[i] = sequenciaF[i - 1] + sequenciaF[i - 2];
    }

    // Imprime os números da sequência com controle de espaço
    for (int i = 0; i < N; i++) {
        if (i > 0) {
            printf(" ");
        }
        printf("%d", sequenciaF[i]);
    }
    printf("\n"); // Finaliza a linha após os números

    return 0;
}
