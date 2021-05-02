package semana1;

public class CalculaMedia {
    public static void main(String[] args) {
    // definição de variáveis ------------------------------------------------------------------------------------------
        float n1 = 10;
        float n2 = 9;
    // calcula média  --------------------------------------------------------------------------------------------------
        float media = (n1 + n2) / 2;

    // operador ternário -----------------------------------------------------------------------------------------------
        String resultado = media > 6 ? "aprovado!" : "reprovado!"; // esta linha representa um operador ternário

   // saída do usuário -------------------------------------------------------------------------------------------------
        System.out.println("A situação do aluno foi " + resultado);
    }
}
