/*
06 - Escreva um programa que adote um ArrayList como estrutura padrão de armazenamento
de dados. O programa deverá cadastrar (sem interação da pessoa usuária), 10 valores de
qualquer tipo dentro da lista (String, int, char, double, etc). Ao final, o programa
deverá mostrar os valores cadastrados.
 */

package semana1;
import java.util.ArrayList;
import java.util.List;

public class Pratica06 {
    public static void main(String[] args) {

        // instância objeto do tipo lista ------------------------------------------------------------------------------
        List<String> nomes = new ArrayList<>();

        // adiciona elementos dentro da lista --------------------------------------------------------------------------
        nomes.add("Zélia");
        nomes.add("Gisele");
        nomes.add("Caroline");
        nomes.add("Guilherme");
        nomes.add("Campinas");
        nomes.add("São Paulo");
        nomes.add("Azul");
        nomes.add("Amarelo");
        nomes.add("Verde");
        nomes.add("Preto");

        // exibe a lista -----------------------------------------------------------------------------------------------
        System.out.println(nomes);
    }
}
