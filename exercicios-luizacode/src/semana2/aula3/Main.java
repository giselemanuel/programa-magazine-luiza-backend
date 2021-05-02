package semana2.aula3;

public class Main {

    public static void main(String[] args) {

        boolean foiAutenticado;

        //criando um funcionário

        Funcionario funcionarioLavinia = new Funcionario();
        Gerente gerenteBea = new Gerente();

        funcionarioLavinia.setNome("Lavinia");
        funcionarioLavinia.setCpf("12345");
        funcionarioLavinia.setSalario(10000);
        funcionarioLavinia.setSenha(5679);

        //imprimir informações de lavinia
        boolean laviniaAutorizada = funcionarioLavinia.autenticar(5679);
        if(laviniaAutorizada == true){
            funcionarioLavinia.verInformacoes();
        }

        gerenteBea.setNome("Bea");
        gerenteBea.setCpf("45678");
        gerenteBea.setSalario(2000);
        gerenteBea.setSenha(9999);
        gerenteBea.setNumeroDeFuncionariosGerenciados(200);

        boolean beaAutorizada = gerenteBea.autenticar(1111);
        if(beaAutorizada == true){
            gerenteBea.verInformacoes();
        }



    }
}
