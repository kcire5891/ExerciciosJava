# Desafio

### Dado um número inteiro positivo x e um array de números inteiros positivos ordenados em ordem crescente, sem repetição, determine dois números do array nums que multiplicados resultem no número x e cuja soma seja o menor possível.

Exemplos:

```
array "nums" = [2, 5, 8, 10, 16, 40]
target x = 80

Saída: [8,10]
```

Casos de Exceção

- Se não houver números que multiplicados cheguem ao número "x", retornar [0,0]
- Se o array estiver vazio ou o tamanho for menor que 2 elementos, retornar [0,0]
- Só serão aceitos retornos em formato array, ou seja [n1,n2]