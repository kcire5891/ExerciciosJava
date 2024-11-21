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
//        String invertida = "";

        ArrayList<String> partes = new ArrayList<>();

//        while (partes.size() <= 1) { partes.add("");}


//        partes.set(1, str.substring(0, Math.min(str.length(), 0 + tamanhoSubStr)));
//
//        partes.remove(0);


//        System.out.println(Arrays.toString(partes.stream().map(entrada -> entrada + ": " + entrada.getValue())



        for (int i = 0; i < str.length(); i += tamanhoSubStr) {
//

                String parteStr = str.substring(i, Math.min(str.length(), i + tamanhoSubStr));
                partes.add(parteStr);

        }
        System.out.println(Arrays.toString(partes.toArray()));
        for (int k = 0; k < partes.size(); k ++) {
//
//            String parteStr = str.substring(i, Math.min(str.length(), i));

            System.out.println("i normal: " + k);
//            System.out.println("i + tamanho: " + (i + tamanhoSubStr));
            System.out.println( (k % 2 == 0));
//            partes.set(i, parteStr);
//            partes.add(parteStr);
            System.out.println("p: "+partes.get(k));
            if ((k + 1) % 2 == 0){

                String invertida = new StringBuilder(partes.get(k)).reverse().toString();;
                partes.set(k, invertida);
            }

        }

//        String[] partesComIndices = new String[partes.size()]; for (int i = 1; i < partes.size(); i++) { partesComIndices[i] = "Índice " + i + ": " + partes.get(i); }
//        System.out.println(Arrays.toString(partesComIndices));
//        System.out.println(partes);

//        for (int i = 1; i < str.length(); i += tamanhoSubStr) {



//            String parteStr = str.substring(i, Math.min(str.length(), i + tamanhoSubStr));

//            if (i % 2 == 0){
//                String invertida = new StringBuilder(parteStr).reverse().toString();
//                partes.add(invertida);
//            } else {
//                partes.add(parteStr);
//            }


//        }

//        int i = 1;
//
//        while (i < str.length()){
//
//            String parteStr = str.substring(i, Math.min(str.length(), i + tamanhoSubStr));
//
//            if (i % 2 == 0){
//                String invertida = new StringBuilder(parteStr).reverse().toString();
//                partes.add(invertida);
//            } else {
//                partes.add(parteStr);
//            }
//
//            i += tamanhoSubStr;
//
//        }



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
