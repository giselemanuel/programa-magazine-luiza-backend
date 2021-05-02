package semana1;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        int count = 4;
        Scanner teclado = new Scanner(System.in);
        do{
            System.out.print("--\n[1] Bebida\n[2] Comida\n[3] Sobremesa\n[4] Sair\nInforme sua opção:");
            int opcao = teclado.nextInt();
            count ++;
        }while (count < 4);

    }
}
