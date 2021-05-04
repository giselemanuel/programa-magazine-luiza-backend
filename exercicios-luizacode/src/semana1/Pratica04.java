/*
Prática 04 - Faça um algoritmo que mostre os números que são divisíveis
de um número digitado pela pessoa usuária. Além desse número, o usuário
deve indicar também o número inicial e final da busca.
Exemplo:
Número divisíveis: 9
De 30 até 238
 */
package semana1;
import java.util.Scanner;

public class Pratica04 {

    public static void main(String[] args) {
        // declação da variável ----------------------------------------------------------------------------------------
        int count;

        // instância do objeto para receber input do usuário -----------------------------------------------------------
        Scanner teclado = new Scanner(System.in);

        // solicita números para o usuários ----------------------------------------------------------------------------
        System.out.print("Insira o número para divisão: ");
        int numero = teclado.nextInt();
        System.out.print("Insira o número inicial: ");
        int inicio = teclado.nextInt();
        System.out.print("Insira o número final: ");
        int fim = teclado.nextInt();

        // exibe os número divisíveis pelo número e dentro da faixa informada ------------------------------------------
        for(count = inicio; count<= fim; count++) {
          if (count % numero == 0) {
              System.out.printf("O número %d é divisível por %d.\n", count, numero);
          }
        }
    }

}
