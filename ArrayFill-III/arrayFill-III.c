#include <stdio.h>
 
int main() {
    
    // Array para ler 1 número mas poder armazenar 100:
    double input[100];
    scanf("%lf", &input[1]);

    // Para ficar mais manejável no loop: 
    double calculo = input[1];

    // Loop para imprimir, atualizar e realizar o calculo: 
    for (int contador = 0; contador < 100; contador++)
    {
        printf("N[%d] = %.4lf\n", contador, calculo);
        calculo = calculo / 2;
    }
 
    return 0;
}