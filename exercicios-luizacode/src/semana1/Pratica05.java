/*
Faça um programa que receba um número digitado pelo usuário e mostre o menu para selecionar o
tipo de cálculo que deve ser realizado:
1. Raiz quadrada
2. A metade
3. 10% do número
4. O dobro
5. Sair
O algoritmo só deve terminar, se o usuário escolher a opção 5
 */
package semana1;
import java.util.Scanner;

public class Pratica05 {
    public static void main(String[] args) {

        // define variáveis --------------------------------------------------------------------------------------------
        double raiz;

        // instância do objeto para receber input do usuário -----------------------------------------------------------
        Scanner teclado = new Scanner(System.in);

        // solicita o número para o usuário ----------------------------------------------------------------------------
        System.out.print("Digite um valor: ");
        float numero = teclado.nextFloat();

        // menu de opções ----------------------------------------------------------------------------------------------
        System.out.print("[1] Raiz Quadrada\n" +
                         "[2] A metade\n" +
                         "[3] 10% do número\n" +
                         "[4] O dobro\n" +
                         "[5] Sair\n" +
                         "Digite a opção escolhida: ");
        int opcao = teclado.nextInt();

        // retorna o valor conforme selecionado no menu ----------------------------------------------------------------
        switch (opcao){
            case 1:
                raiz = Math.sqrt(numero);
                System.out.printf("--\nA raiz quadra de %.2f é %.2f", numero, raiz);
                break;

            case 2:
                System.out.printf("--\nA metade de %.2f é %.2f", numero, numero / 2);
                break;

            case 3:
                System.out.println("10% do numero é " + numero * 0.10);
                break;

            case 4:
                System.out.printf("--\nO dobro de %.2f é %.2f", numero, numero * 2);
                break;

            case 5:
                System.out.println("--\nPrograma encerrado.");
                break;
        }
    }

}
