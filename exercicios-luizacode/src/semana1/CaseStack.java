package semana1;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class CaseStack {
    public static void main(String[] args) {

        Stack<String> nomes = new Stack<>(); // ordena os elementos da pilha
        nomes.push("Zélia");
        nomes.push("Gisele");
        nomes.push("Caroline");
        nomes.push("Guilherme");

        System.out.println("A Pilha é: " + nomes);
        System.out.println("--\nElemento que será removido é: " + nomes.pop());
        System.out.println("A Pilha é: " + nomes);



    }

}
