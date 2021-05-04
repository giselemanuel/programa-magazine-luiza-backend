/*
Prática 08 - Escreva um programa que contenha uma lista com 5 nomes pré-cadastrados.
O programa deverá dar à pessoa usuária a opção de excluir um único nome da lista ,
com valores entre 1 e 5, exemplo abaixo.
Qual dos nomes abaixo você deseja excluir da lista?
1. Tainá
2. Stellinha
3. Tequillina
4. Pituzinho
5. <Seu Nome>
 */
package semana1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pratica08 {
    public static void main(String[] args) {

        List<String> lista = new ArrayList<>();

        lista.add("Tainá");
        lista.add("Stellinha");
        lista.add("Tequilinha");
        lista.add("Pituzinho");
        lista.add("Gisele");


        Scanner sc = new Scanner(System.in);
        System.out.print("\nDo Menu abaixo, quem você deseja excluir\n" +
                "[1] Tainá\n" +
                "[2] Stelinha\n" +
                "[3] Tequilinha\n" +
                "[4} Pituzzinho\n" +
                "[5] Gisele\n" +
                "Insira a sua opção: ");
        int opcao = sc.nextInt();

        switch (opcao){
            case 1:
                System.out.print("--\nLista cadastrada: " + lista);
                System.out.println("\nVocê escolheu remover: " + lista.remove(0));
                System.out.print("Lista atualizada: " +  lista);
                break;

            case 2:
                System.out.print("--\nLista cadastrada: " + lista);
                System.out.println("\nVocê escolheu remover: " + lista.remove(1));
                System.out.print("Lista atualizada: " +  lista);
                break;

            case 3:
                System.out.print("--\nLista cadastrada: " + lista);
                System.out.println("\nVocê escolheu remover: " + lista.remove(2));
                System.out.print("Lista atualizada: " +  lista);
                break;

            case 4:
                System.out.print("--\nLista cadastrada: " + lista);
                System.out.println("\nVocê escolheu remover: " + lista.remove(3));
                System.out.print("Lista atualizada: " +  lista);
                break;

            case 5:
                System.out.print("--\nLista cadastrada: " + lista);
                System.out.println("\nVocê escolheu remover: " + lista.remove(4));
                System.out.print("Lista atualizada: " +  lista);
                break;
        }

    }
}
