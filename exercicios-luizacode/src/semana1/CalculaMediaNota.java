package semana1;
import java.util.Scanner;

/*
Programa calacula média de notas
1) Solicita para o usuário as notas de 3 provas
2) Calcule a média das três notas
3) Exibir o resultado para o usuário
 */

public class CalculaMediaNota {

    public static void main(String[] args){
        //cabeçalho do programa --------------------------------------------------------------------------------------------
        System.out.println("\n******************************************");
        System.out.print("          CALCULA MÉDIA DE NOTAS\n");
        System.out.println("******************************************");

        //definição das variáveis -----------------------------------------------------------------------------------------
        String nome;
        float nota1;
        float nota2;
        float nota3;

        //solicita nome e as notas para os alunos --------------------------------------------------------------------------
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe seu nome: ");
        nome = teclado.nextLine();
        System.out.print("Informe a nota da primeira prova: ");
        nota1 = teclado.nextFloat();
        System.out.print("Informe a nota da segunda prova: ");
        nota2 = teclado.nextFloat();
        System.out.print("Informe a nota de terceira prova: ");
        nota3 = teclado.nextFloat();

        //calcula média das notas informadas -------------------------------------------------------------------------------
        float media  = (nota1 + nota2 + nota3) / 3;

        //exibe  média final do aluno --------------------------------------------------------------------------------------
        System.out.format("--\n%s, sua média final é %.2f", nome,  media);

    }
}
