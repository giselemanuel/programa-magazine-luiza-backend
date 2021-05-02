package semana1;

import java.util.PriorityQueue;
import java.util.Queue;

public class CaseQueue {
    public static void main(String[] args) {

        Queue<String> nomes = new PriorityQueue<>(); // ordena os elementos da fila
        nomes.add("Zélia");
        nomes.add("Gisele");
        nomes.add("Caroline");
        nomes.add("Guilherme");

        System.out.println("A  fila é: " + nomes);
        System.out.println("O elemento da  vez é " + nomes.peek()); // ele exibe o elemento na posição 0
        System.out.println("--\nElemento que será removido é: " + nomes.poll()); // remove o elemento
        System.out.println("A  fila é: " + nomes);

    }
}
