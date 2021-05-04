/*
Escreva um programa que cadastre em uma lista numérica de valores inteiros 10 números
inteiros aleatórios entre 10 e 100. Ao final, o programa deverá detectar na lista qual
o maior número inteiro sorteado e mostrá-lo ao usuário.
*/

package semana1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Pratica09 {

    public static void main(String[] args) {

        // declaração de variável
        int i;
        int maior;
        List<Integer> numeros = new ArrayList<>();

        //instância de um objeto da classe Random usando o construtor padrão
        Random gerador = new Random();

        // gera 10 número aletórios inteiros de 10 a 100
        for(i = 1; i <= 10; i++) {
            numeros.add(gerador.nextInt((100 - 10) + 1) + 10);
            //System.out.println(numeros.get(i));
        }

        maior = numeros.get(0);
        for(i = 1; i <= 10; i++){
            if(maior < numeros.get(i)){

                maior = numeros.get(i);
            }
        }

        System.out.print("Lista gerada: " + numeros);
        System.out.print("\nMaior número da lista: ");
    }
}
