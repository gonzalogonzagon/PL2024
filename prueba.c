//#include <stdio.h>

// Constantes
#define PI 3.14159
#define GRAVEDAD 9.8

// Función para calcular el área de un círculo
float calcularAreaCirculo(int radio) {
    return PI * radio * radio;
}

int main(int pepe) {
    int radio = 5.0;
    float area = calcularAreaCirculo(radio);

    printf("Radio del círculo: %.2f\n", radio);
    printf("Área del círculo: %.2f\n", area);

    return 0;
}