package semana1;

public class CompararDados {
    public static void main(String[] args) {
    // define as variáveis ---------------------------------------------------------------------------------------------
        String nome1 = "Andrea";
        String nome2 = "Andrea";

    // operador ternário para comparar strings nome1 e nome2 -----------------------------------------------------------
        String resultado1 = nome1 == nome2 ? "iguais" : "diferentes";

    // instância do objeto nome3 ---------------------------------------------------------------------------------------
        String nome3 = new String("Andrea");

    // operador ternário para comparar a string nome1 com objeto nome3 -------------------------------------------------
        String resultado2 = nome1 == nome3 ? "iguais" : "diferentes";

    // operador ternário para comparar a string nome1 com objeto nome3 -------------------------------------------------
        String resultado3 = nome3.equals(nome1) ? "iguais" : "diferentes";

    // saida do resultado exibido para o usuário  ----------------------------------------------------------------------
        System.out.println("Resultado 1: " + resultado1);
        System.out.println("Resultado 2: " + resultado2);
        System.out.println("Resultado 3: " + resultado3);
    }
}
