/*
Faça um algoritmo que mostre os números que são divisíveis de um número
digitado pelo usuário. Além desse número, o usuário deve indicar também
o número inicial e final da busca.
Exemplo:
Número divisíveis: 9 De 30 até 238
 */

package semana1;

import java.util.Scanner;

public class Pratica03 {
    public static void main(String[] args) {
        // define variável ---------------------------------------------------------------------------------------------
        int count;

        // instancia do objeto teclado para receber o input do usuário -------------------------------------------------
        Scanner teclado = new Scanner(System.in);

        // solicita e recebe números do usuário  -----------------------------------------------------------------------
        System.out.print("Informe um número positivo inteiro para o ínicio: ");
        int numero1 = teclado.nextInt();
        System.out.print("Informe um número positivo inteiro para o final: ");
        int numero2 = teclado.nextInt();
        System.out.print("Informe o número para divisão: ");
        int numero3 = teclado.nextInt();

        // exibe resultado do divisor e seus  divisores-----------------------------------------------------------------
        System.out.printf("---\nNúmeros divisiveis por %d\nSão: ", numero3);

        for(count = numero1; count<=numero2; count++){ //iteração para localizar o número divisíveis
            if(count % numero3 == 0) {
                System.out.print(count + " ");
            }
        }
    }
}



