package semana1;
import java.util.Scanner;

public class ExercicioCondicional {
    public static void main(String[] args) {
    // define a variável -----------------------------------------------------------------------------------------------
        int idade = 16;
        Scanner entrada = new Scanner(System.in);

    // verifica se usuário tem idade ou não para votar -----------------------------------------------------------------
        if (idade < 16) {
            System.out.format("Você não pode votar.");
        } else if (idade >= 16 && idade < 18) {
            System.out.println("Voto opcional.");
        } else {
            System.out.println("Voto obrigatório.");
        }
    }
}
