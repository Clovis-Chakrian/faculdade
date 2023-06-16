#include <stdio.h>
#include <stdbool.h>
#define bool _Bool
#define MAX 50

typedef int TIPOCHAVE;
typedef struct
{
  TIPOCHAVE chave;

} REGISTRO;

typedef struct
{
  REGISTRO A[MAX];
  int nroElem;
} LISTA;

void iniciarLista(LISTA *l)
{
  l->nroElem = 0;
};

int tamanho(LISTA *l)
{
  return l->nroElem;
};

void exibirLista(LISTA *l)
{
  int i;
  printf("Lista: \"");
  for (i = 0; i < l->nroElem; i++)
  {
    printf("%i", l->A[i].chave);
  };

  printf("\"\n");
};

int buscaSequencial(LISTA *l, TIPOCHAVE ch)
{
  int i = 0;
  while (i < l->nroElem)
  {
    if (ch == l->A[i].chave)
      return i;
    else
      i++;
  }
  return -1;
};

bool inserirElemento(LISTA* l, REGISTRO reg, int i)
{
  return true;
};