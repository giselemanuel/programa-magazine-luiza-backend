package semana1;
/*
Programa mão da massa - Camparar valores
1) Crie uma váriavel P = 7 > 7
2) Crie uma variável Q = T == T
3) Crie uma variável  R = 2 + 10 != 3 + 7
4) Testar :
P e Q e R = ?
P ou Q e R = ?
P ou Q ou R = ?
 */
public class ExercicioBooleano {
    public static void main(String[] args) {
    // declaração das variaveis ----------------------------------------------------------------------------------------
        boolean p = 7 > 7;
        boolean q = "G" == "G";
        boolean r = 2 + 10 != 3 + 7;

    // declaração das variaveis ----------------------------------------------------------------------------------------
        boolean resultado1 = p && q && r;
        boolean resultado2 = p || q && r;
        boolean resultado3 = p || q || r;

    // imprime o resultado dos booleanos -------------------------------------------------------------------------------
        System.out.println(resultado1);
        System.out.println(resultado2);
        System.out.println(resultado3);

    }
}
