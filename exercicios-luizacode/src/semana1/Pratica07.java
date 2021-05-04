/*
Prática 07 - Escreva um programa que receba cinco nomes diferentes da pessoa usuária.
Todos os nomes deverão ser armazenados em um ArrayList tipado para Strings. O programa
deverá mostrar os nomes cadastrados em ordem inversa a qual foram cadastrados, ou seja,
do último para o primeiro.
 */
package semana1;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pratica07 {

    public static void main(String[] args) {
        // declaração das variaveis
        int count;
        List<String> lista = new ArrayList<>();
        List<String> invertida = new ArrayList<>();

        //instância de um objeto para armazenar os nomes inseridos
        Scanner teclado = new Scanner(System.in);

        // solicita o nome para o usuário e insere na lista chamada lista
        for (count = 1; count <= 5; count++) {
            System.out.printf("%d) Digite um nome: ", count);
            String nome = teclado.nextLine();
            lista.add(nome);
        }

        // inverte as possições dos nomes inseridos na lista e armazena na lista chamada invertida
        for (count = 4; count >= 0; count--) {

            invertida.add(lista.get(count));
        }

        // exibe a lista inserida e lista invertida
        System.out.println("--\nLista inserida: " + lista);
        System.out.println("Lista invertida: " + invertida);

    }
}
