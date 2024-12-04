#include <stdio.h>
 
 // Função para calcular o mdc.
int calcular_mdc(int a, int b) 
    {
        while (b!= 0)
        {
            int resto = a % b;
            a = b;
            b = resto;
        }
        return a;
    }

// Trazendo a função de mdc para as questões do desafio.
int main() {
    int loop = 0, contador, ricardo = 0, vicente = 0;
    // Recebendo quantos casos terão o teste.
    scanf("%d", &loop);
    // Etinerando sobre todos os casos e imprimindo quantas pilhas de figurinhas poderão ser formadas.
    for (contador = 0; contador < loop; contador++){
        scanf("%d  %d", &ricardo, &vicente);

        int mdc = calcular_mdc(ricardo, vicente);
        printf("%d\n", mdc);
        
    }

    return 0;


}