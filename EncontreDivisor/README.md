# Descrição do Problema
O problema descreve a necessidade de encontrar o maior divisor comum (MDC) de um array de números inteiros positivos. Dado um conjunto/array "nums" de inteiros positivos no intervalo de 1 a 100, determine o maior inteiro positivo que divide simultaneamente (divisão exata) todos os elementos do array.

Exemplo:

```
Entrada: {15, 25, 35}
Saída: 5
```

Código Fornecido

```
import java.util.*;

public class EncontraDivisor {
// Não altere o trecho de código abaixo
public static List<Integer> primosAteCem = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97);

    public static void main(String[] args) {
        System.out.println(resolve(new int[]{10, 20, 30}));
    }

    // Não altere o trecho de código acima

    public static int resolve(int[] nums) {
        // Digite seu código aqui
        int solucao = 0;

        // Para DEBUG utilize o System.err.println
        System.err.println("My debug message!");

        return solucao;
    }
}
```