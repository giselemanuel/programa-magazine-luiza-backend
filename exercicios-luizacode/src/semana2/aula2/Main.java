package semana2.aula2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // criando um cliente
        Pessoa clienteTaina = new Pessoa("Taina",  "111.222.444.-55", "Rua jão batista");
        Pessoa clientePatricia = new Pessoa("Patricia", "222.333.111-11", "Rua da Silva");
        Pessoa clienteCaroline = new Pessoa("Caroline", "333.222.111.-77", "Rua  dos lirios");

        //Criando uma conta
        Conta contaTaina = new Conta(1234,"Tania", 100);
        Conta contaPatricia = new Conta(4574,"Patricia", 200);
        Conta contaCaroline = new Conta(5554,"Caroline", 300);

        //atribuir  contas aos clientes
        clienteCaroline.setConta(contaCaroline);
        clienteTaina.setConta(contaTaina);
        clientePatricia.setConta(contaPatricia);


//        // PessoaTaina realiza saque
//        boolean  tainaPodeSacar = clienteTaina.getConta().sacar(10);
//        if(tainaPodeSacar == true){
//            System.out.println("Saque realizado como sucesso.");
//        }else{
//            System.out.printf("Saldo indisponível.");
//        }
//
//        //Pessoa patricia transferir dinheiro para a pessoa carol
//        System.out.printf("Informe o valor da transferência: ");
//        double valor = teclado.nextDouble();
//        boolean patriciaPodeSacar = clientePatricia.getConta().sacar(valor);
//        if(patriciaPodeSacar == true){
//            System.out.println("Saque realizado como sucesso.");
//            clienteCaroline.getConta().tranferir(valor);
//        }else{
//            System.out.printf("Saldo indisponível.");
//        }
//



        // Pessoa carol

//        //imprimir os valores
//        if (podeSacar == true){
//            System.out.printf("A Cliente %s tem o cpf %s\n", cliente.getNome(), cliente.getCpf());
//            System.out.format("O saldo da conta é " + cliente.getConta().getSaldo());
//        }else{
//            System.out.println("iiiiiihh lascou , tá liso hein!");
//        }





    }
}
