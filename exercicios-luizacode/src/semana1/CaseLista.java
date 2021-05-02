package semana1;
import java.util.*;

public class CaseLista {
    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();
        List<String> apelidos = new ArrayList<>();

        nomes.add("Zélia");
        nomes.add("Gisele");
        nomes.add("Caroline");
        nomes.add("Guilherme");

        apelidos.add("Gi");
        apelidos.add("Carol");
        apelidos.add("Gui");


        for(Object nome: nomes){
            System.out.println("O valor da vez é: " + nome);
        }

        System.out.println("\nLISTA ORDENADA");

        Collections.sort(nomes);

        for(Object nome: nomes){
            System.out.println("O valor da vez é: " + nome);
        }


        nomes.addAll(apelidos);

        System.out.println("\nNOVA LISTA");
        for(Object apelido: apelidos){
            System.out.println("O valor da vez é: " + apelido);
        }

        int indice = Collections.binarySearch(nomes, "Zélia");
        System.out.println("O indice foi " + indice);

    }
}
