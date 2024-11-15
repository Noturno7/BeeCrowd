#include <stdio.h>

unsigned long long int fibonacci(int n) {
    if (n == 0) return 0;
    if (n == 1) return 1;

    unsigned long long int a = 0, b = 1, result = 0;

    for (int i = 2; i <= n; i++) {
        result = a + b;
        a = b;
        b = result;
    }

    return result;
}

int main() {
    int n;
    printf("Enter a number to find the corresponding Fibonacci number: ");
    scanf("%d", &n);

    unsigned long long int fib_number = fibonacci(n);
    printf("Fibonacci number at position %d is %llu\n", n, fib_number);

    return 0;
}
