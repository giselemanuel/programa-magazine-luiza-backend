package semana1;
import java.util.HashSet;
import java.util.Set;

public class CaseSet {
    public static void main(String[] args) {
        Set<String> nomes = new HashSet<>();

        nomes.add("Zélia");
        nomes.add("Gisele");
        nomes.add("Caroline");
        nomes.add("Guilherme");

        for(Object nome: nomes){
            System.out.println("O valor da vez é: " + nome);
        }
    }
}
