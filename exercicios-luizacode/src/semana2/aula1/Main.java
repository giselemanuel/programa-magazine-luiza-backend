package semana2.aula1;

public class Main {
    public static void main(String[] args) {

        //instânciando/criando um objeto do tipo carro
        Carro meuPrimeiroCarro = new Carro();

        //Instanciar uma pessoa
        Pessoa pessoa = new Pessoa("Tania", 33, "j345");

        //atribuir valores aos atributos do objeto
        meuPrimeiroCarro.setTipo("Hatch");
        meuPrimeiroCarro.setCor("prata");
        meuPrimeiroCarro.setPlaca("GGJ5452");
        meuPrimeiroCarro.setNumeroDePortas(4);
        meuPrimeiroCarro.setDona(pessoa);

        //acessando os valores
        System.out.println("--\nTipo é " + meuPrimeiroCarro.getTipo());
        System.out.println("A cor é  " + meuPrimeiroCarro.getCor());
        System.out.println("A placa é " + meuPrimeiroCarro.getPlaca());
        System.out.println("Total de portas são " + meuPrimeiroCarro.getNumeroDePortas());
        System.out.println("A dona desse carro é " + meuPrimeiroCarro.getDona().getNome());

        //instânciando/criando um objeto do tipo carro
//        Carro meuSegundoCarro = new Carro("Conversível", "Laranja", "GGJ4534", 4);

        //acessando os valores
//        System.out.println("---\nTipo é " + meuSegundoCarro.getTipo());
//        System.out.println("A cor é  " + meuSegundoCarro.getCor());
//        System.out.println("A placa é " + meuSegundoCarro.getPlaca());
//        System.out.println("Total de portas são " + meuSegundoCarro.getNumeroDePortas());
//        System.out.println("A dona desse carro é " + meuPrimeiroCarro.getDona().getNome());

        System.out.println("---\n");


//        Pessoa Pessoa1 = new Pessoa("Gisele", 32,"D");
//        System.out.println("--\nO nome é " + Pessoa1.getNome());
//        System.out.println("A idade é " + Pessoa1.getIdade() + " anos");
//        System.out.println("CNH é " + Pessoa1.getCnh());

        //chamando um método do objeto ---------------------------------------------------------------------------------
        meuPrimeiroCarro.ligar();
        meuPrimeiroCarro.desligar();
    }
}
