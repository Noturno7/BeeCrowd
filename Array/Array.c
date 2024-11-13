/*
    In this problem, your task is to read an array A[100]. 
    At the end, print all array positions that store a number less or equal to 10 
    and the number stored in that position.
*/

#include <stdio.h>

int main() {
    float A[100];
    for (int contador = 0; contador < 100; contador++) {
        scanf("%f", &A[contador]);  
        
        if (A[contador] <= 10) {
            printf("A[%i] = %.1f\n", contador, A[contador]);
        }
    }

    return 0;
}
