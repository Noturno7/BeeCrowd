#include <stdio.h>

int main(){
    // Fazendo as váriaveis de forma que possam ser auteradas pelo usuário a depender da situação.
    float input, intervalos[4];
    intervalos[0] = 0, intervalos[1] = 25, intervalos[2] = 50, intervalos[3] = 75, intervalos[4] = 100;
    
    // Recebendo o input do usuário.
    scanf("%f", &input);

    // Fazendo a condição para iterar sobre os valores e os intervalos.
    if (input >= intervalos[0] && input <= intervalos[1]){
        printf("Intervalo [%1.f,%1.f]\n", intervalos[0], intervalos[1]);
    }
    else if (input >= intervalos[1] && input <= intervalos [2]){
        printf("Intervalo (%1.f,%1.f]\n", intervalos[1], intervalos[2]);
    }
    else if (input >= intervalos[2] && input <= intervalos [3]){
        printf("Intervalo (%1.f,%1.f)\n", intervalos[2], intervalos[3]);
    }
    else if(input >= intervalos[3] && input <= intervalos [4]){
        printf("Intervalo (%1.f,%1.f]\n", intervalos[3], intervalos[4]);
    }
    else{
        printf("Fora de intervalo\n");
    }
}