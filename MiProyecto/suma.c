#include <stdio.h>
int main() {
// Declaración de variables
int num1, num2, suma;
// Solicitar al usuario que ingrese el primer número
printf("Ingrese el primer número: ");
scanf("%d", &num1);
// Solicitar al usuario que ingrese el segundo número
printf("Ingrese el segundo número: ");
scanf("%d", &num2);
// Calcular la suma
suma = num1 + num2;
// Mostrar el resultado
printf("La suma de %d y %d es: %d\n", num1, num2, suma);
return 0;
}