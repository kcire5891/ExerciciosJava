package EncontreDivisor;

import java.util.*;

public class EncontraDivisor {
    // Não altere o trecho de código abaixo
    public static List<Integer> predefined = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97);

    public static void main(String[] args) {
        System.out.println(resolve(new int[]{15, 25, 35})); // Exemplo de teste
    }

    // Não altere o trecho de código acima

    public static int resolve(int... nums) {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("O array deve conter pelo menos um elemento.");
        }

        int mdc = nums[0];
        for (int i = 1; i < nums.length; i++) {
            mdc = calcularMDC(mdc, nums[i]);
        }

        return mdc;
    }

    // Método auxiliar para calcular o MDC (Máximo Divisor Comum) utilizando o Algoritmo de Euclides
    public static int calcularMDC(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
