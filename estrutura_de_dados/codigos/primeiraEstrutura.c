#include <stdio.h>
#define alturaMaxima 225

typedef struct {
  int peso;
  int altura;
} PesoAltura;

int main() {
  PesoAltura pessoa1;
  pessoa1.peso = 80;
  pessoa1.altura = 165;
  printf("O peso do ser humaninho 1 é: %i e a altura dele é: %i\n", pessoa1.peso, pessoa1.altura);
  if (pessoa1.altura > alturaMaxima) printf("Altura acima da máxima\n");
  else printf("Altura abaixo da máxima\n");
  printf("Fim do programa!\n");
  return 0;
};