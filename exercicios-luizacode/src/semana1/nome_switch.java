package semana1;
import java.util.Scanner;

public class nome_switch {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe a inicial dos seu nome em minúsculo: ");
        String letra = teclado.nextLine();

        switch (letra){
            case "a":
                System.out.print("Arara");
                break;
            case "b":
                System.out.println("Fala seu nome: ");
                String nome = teclado.nextLine();
                System.out.printf("Olá %s, você esta na letra %s", nome, letra);
                break;
            case "c":
                System.out.print("Informe um número: ");
                int number = teclado.nextInt();
                if(number > 10){
                    System.out.println("Número maior que 10.");
                }else{
                    System.out.println("Número menor que 10");
                }
                break;
            default:
                System.out.println("Letra não cadastrada!");
        }
    }
}
