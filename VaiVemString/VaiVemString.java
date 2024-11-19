package VaiVemString;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class VaiVemString {

    public static void main(String[] args) {
        // ****************************************
        // Não alterar o trecho de código abaixo
        // ****************************************

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int x = scanner.nextInt();

        System.out.println(resolver(str, x));

        // ****************************************
        // Não alterar o trecho de código acima
        // ****************************************
    }

    static String resolver(String str, int x) {

        int tamanhoSubStr = (int) Math.floor(str.length() / x);
        StringBuilder finalStr = new StringBuilder();

        List<String> partes = new ArrayList<>();

        for (int i = 0; i < str.length(); i += tamanhoSubStr) {
            partes.add(str.substring(i, Math.min(str.length(), i + tamanhoSubStr)));
        }

        for (String parte : partes) {
            finalStr.append(parte);
            System.out.println(parte);
        }

        System.out.println(finalStr);

        String solucao = String.valueOf(finalStr);

        // ****************************************
        // Para DEBUGAR utilize o System.err.println()
        // ****************************************

        System.err.println("My debug messages");

        return solucao;

    }
}
