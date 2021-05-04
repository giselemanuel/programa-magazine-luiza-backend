/*
Prática 01 - Crie uma classe para pessoa com as seguintes características:
● Atributos:
○ Nome, idade, CNH
● Metodos:
○ Dirigir,

Prática 02 - Desenvolva o seguinte relacionamento

+ Classe Pessoa:
● Atributos:
Nome, endereço, numero
● Metodos:
consultaEndereço(): Endereço
consultaNome(): String

+ Classe Endereço:
● Atributos:
logradouro, cidade, estado
● Metodos:
consultaLogradouro():String

Perceba que a classe Pessoa vai ter um objeto do tipo Endereço.
Lembre-se de criar os construtores parametrizados.

Prática 03 - Agora, continuando o exercício anterior, adicione as seguintes classes
no resultado da Prática anterior.

+ Classe Produto
● Atributos:
Código, nome
● Metodos:
consultaNome()

+ Classe Compra:
● Atributos:
pessoa:Pessoa
produto:Produto
● Metodos:
compra(pessoa:Pessoa, produto:Produto):void
verificarCompra():String

Prática 04 - Utilizando o algoritmo implementado na prática 03, agora desenvolva a classe Main:
● Inicialmente, a classe deve criar 2 objetos do tipo Produto (crie os objetos com as informações que desejar)
● O usuário faz um cadastro (criando um objeto do tipo Pessoa)
● Logo após, o usuário seleciona entre os 2 produtos cadastrados
anteriormente
● Dependendo da escolha, é acessado o método comprar da classe
Compra, e passado como parâmetro o objeto Pessoa que ele cadastrou
e o do Produto escolhido
● Logo após, é exibido no console ao usuário uma mensagem de
confirmação, exibindo o nome dele e do produto comprado (acesso ao método verificarCompra()) e finaliza a aplicação

 */

package semana2.pratica01_04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // instância objetos -------------------------------------------------------------------------------------------
        Scanner sc = new Scanner(System.in);
        Pessoa cliente1 = new Pessoa();
        Endereco endereco1 = new Endereco();
        Produto produto1 = new Produto();
        Produto produto2 = new Produto();
        Compra pedido = new Compra();

        //atributos endereço -------------------------------------------------------------------------------------------
        endereco1.setLogradouro("Avenida Brasil");
        endereco1.setCidade("Campinas");
        endereco1.setEstado("São Paulo");

        // atributos cliente -------------------------------------------------------------------------------------------
        cliente1.setNome("Gisele");
        cliente1.setNumero(206);
        cliente1.setEndereco(endereco1);

        // atributos de produto ----------------------------------------------------------------------------------------
        produto1.setCodigo(1);
        produto1.setNome("Notebook");
        produto2.setCodigo(2);
        produto2.setNome("Geladeira");

        // Menu --------------------------------------------------------------------------------------------------------
        String menu = "Escolha um produto\n" + "[1] " +
                       produto1.getNome() + "\n[2] " +
                       produto2.getNome() +
                       "\nInsira sua opção: ";

        System.out.print(menu);
        int opcao = sc.nextInt();

        switch (opcao){
            case 1:
                pedido.comprar(cliente1, produto1);
                pedido.verificarCompra();
                break;

            case 2:
                pedido.comprar(cliente1, produto2);
                pedido.verificarCompra();
                break;
        }
    }
}
