package EncontreMultiplo;

public class EncontraMultiplo {
    public static void main(String[] args) {
        // Não altere o trecho de código abaixo
        System.out.println(resolver(2, 1));  // Exemplo de teste
        // Não altere o trecho de código acima
    }

    public static int resolver(int a, int b) {
        // Calcula o MMC utilizando o método do Máximo Divisor Comum (MDC)
        return a * (b / mdc(a, b));
    }

    // Método para calcular o MDC (Máximo Divisor Comum) utilizando o Algoritmo de Euclides
    public static int mdc(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
