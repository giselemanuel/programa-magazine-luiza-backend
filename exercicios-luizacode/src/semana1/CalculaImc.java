package primeiroprograma;
import java.util.Scanner;

/*
Programa calcula IMC
1) Solicitar peso do usuário
2) Solicitar altura do usuário
3) Executar calculo do IMC através da fórmula
IMC = peso/ (altura x altura)
5) Exibir resultado do calculo de IMC calculado
6) Exibir classificação conforme o resultado do IMC
Tabela:
I  - Abaixo do peso < 19,1
II - no peso normal 19,1 a 25,8
II - marginalmente acima do peso 25,9 a 27,3
IV - acima do peso ideal 27,4 a 32,3
V - obeso > 32,4
 */

public class CalculaIMC {

    public static void main(String[] args) {
        // cabeçalho do programa -------------------------------------------------------------------------------------------
        System.out.println("\n******************************************");
        System.out.print("              CALCULA IMC\n");
        System.out.println("******************************************");

        // instancia do objeto teclado para receber o input do usuário -----------------------------------------------------
        Scanner teclado = new Scanner(System.in); // criação de um objeto

        // solicita nome, peso e altura do usuário -------------------------------------------------------------------------
        System.out.print("Informe seu nome: ");
        String nome = teclado.nextLine();
        System.out.print("Informe seu peso: ");
        float peso = teclado.nextFloat();
        System.out.print("Informe sua altura ");
        float altura = teclado.nextFloat();

        // calcula imc -----------------------------------------------------------------------------------------------------
        float imc = peso / (altura * altura);

        //exibe resultado do IMC -------------------------------------------------------------------------------------------
        System.out.format("--\nOlá %s,\nSeu IMC é %.2f", nome, imc);

        // estrutura condicional que verifica categoria do IMC -------------------------------------------------------------
        //abaixo do peso < 19,1
        if(imc < 19.1){
            System.out.format("\nVocê esta abaixo do peso.");

            //no peso normal 19,1 a 25,8
        }else if(imc >= 19.1 && imc <= 25.8){
            System.out.format("\nSeu peso esta normal.");

            //marginalmente acima do peso 25,9 a 27,3
        }else if(imc >= 25.9 && imc <= 27.3){
            System.out.format("\nVocê esta marginalmente acima do peso.");

            //acima do peso ideal 27,4 a 32,3
        }else if(imc >= 27.4 && imc <= 32.3){
            System.out.format("\nVocê esta acima do peso ideal.");

            //obeso > 32,4
        }else{
            System.out.format("\nVocê esta obeso.");
        }
    }
}
