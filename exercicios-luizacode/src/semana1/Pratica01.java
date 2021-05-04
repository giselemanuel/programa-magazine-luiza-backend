/*
Escreva um algoritmo que leia o peso e a altura de um usuário e
informe o seu Índice de Massa Corpórea (IMC). O cálculo é obtido
pela divisão entre o valor do seu peso e o quadrado do valor da sua altura.
 */

package semana1;

import java.util.Scanner;

public class Pratica01 {
    public static void main(String[] args) {
        // cabeçalho do programa ---------------------------------------------------------------------------------------
        System.out.println("\n******************************************");
        System.out.print("              CALCULA IMC\n");
        System.out.println("******************************************");

        // instancia do objeto teclado para receber o input do usuário -------------------------------------------------
        Scanner teclado = new Scanner(System.in); // criação de um objeto

        // solicita nome, peso e altura do usuário ---------------------------------------------------------------------
        System.out.print("Informe seu nome: ");
        String nome = teclado.nextLine();
        System.out.print("Informe seu peso: ");
        float peso = teclado.nextFloat();
        System.out.print("Informe sua altura ");
        float altura = teclado.nextFloat();

        // calcula imc -------------------------------------------------------------------------------------------------
        float imc = peso / (altura * altura);

        //exibe resultado do IMC ---------------------------------------------------------------------------------------
        System.out.format("--\nOlá %s,\nSeu IMC é %.2f", nome, imc);

    }
}