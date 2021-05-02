package semana1;
import java.util.Scanner;

public class CaseWhile {
    public static void main(String[] args) {
        double nota1;
        double nota2;
        double media;
        int qtdeAprovado = 0;
        int qtdeReprovado = 0;
        String resposta = "sim";

        Scanner teclado = new Scanner(System.in);

    while(resposta.equals("sim")) { // utilizado o método .equals pois estamos comparando "sim" com  um atributo de um objeto
        System.out.print("Informe nota do aluno 1: ");
        nota1 = teclado.nextDouble();
        System.out.print("Informe nota do aluno 2: ");
        nota2 = teclado.nextDouble();

        media = (nota1 + nota2) / 2;

        if (media >= 7) {
            qtdeAprovado++;

        }else{
            qtdeReprovado++;
        }
        System.out.println("--\nExiste mais alunos [sim/não]: ");
        resposta = teclado.next();
    }
    System.out.println("--\nOs alunos aprovados são: " + qtdeAprovado);
    System.out.println("Os alunos reprovado são: " + qtdeReprovado);
    System.out.print("--\nFim do programa");
    }
}
