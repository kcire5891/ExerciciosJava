package Anagrama;

import com.google.gson.*;

import java.util.*;

public class JsonAnagrama {

    public static void main(String[] args) {
        // Não altere o trecho de código abaixo
        Scanner scanner = new Scanner(System.in);
        Gson gson = new Gson();
        JsonArray jsonArray = gson.fromJson(scanner.nextLine(), JsonArray.class);
        System.out.println(resolve(jsonArray));
    }

    static JsonArray resolve(JsonArray jsonArr) {
        JsonArray arr = null;

        Map<String, List<String>> anagramasMap = new LinkedHashMap<>();
        Gson gson = new Gson();
        for (JsonElement elemento : jsonArr) {
            String str = elemento.getAsJsonObject().get("str").getAsString();
            String chave = sortString(str);
            if (!anagramasMap.containsKey(chave)) {
                anagramasMap.put(chave, new ArrayList<>());
            }
            anagramasMap.get(chave).add(str);
        }
        JsonArray resultado = new JsonArray();
        for (List<String> anagramas : anagramasMap.values()) {
            if (anagramas.size() > 1) {
                JsonObject grupo = new JsonObject();
                grupo.add("anagramas", gson.toJsonTree(anagramas));
                resultado.add(grupo);
            }
        }


        // Não remova a linha abaixo
        System.err.println("My debug message");

        return arr = resultado;

    }

    static String sortString(String str) { char[] caracteres = str.toCharArray(); Arrays.sort(caracteres); return new String(caracteres);}

}