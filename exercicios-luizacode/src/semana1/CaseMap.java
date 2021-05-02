package semana1;
import java.util.Scanner;

import java.util.HashMap;
import java.util.Map;

public class CaseMap {
    public static void main(String[] args) {
        Map<String, String> nomes = new HashMap<>();
//      Map<String, String> nomes = new LinkedHashMap<>(); obedece a ordem que foi  inserido

        nomes.put("Zélia", "Silva");
        nomes.put("Gisele", "Rodrigues");
        nomes.put("Caroline", "Daniel");
        nomes.put("Guilherme", "Manuel");

        System.out.println("\nImprime o a chave do MAP");
        for (String key : nomes.keySet()) {
            System.out.println("O valor da vez é: " + key);
        }

        System.out.println("\nImprime o valor do MAP");
        for (String values : nomes.values()) {
            System.out.println("O valor da vez é: " + values);
        }

//        for(Map.Entry<String, String>: nomes.entrySet()){
//            System.out.println("A chave e valor da vez é: " + entry.getKey)
//       }
    }
}
