package semana2.aula3;

public class Gerente extends Funcionario {
    private  int numeroDeFuncionariosGerenciados;


    public int getNumeroDeFuncionariosGerenciados() {
        return numeroDeFuncionariosGerenciados;
    }

    public void setNumeroDeFuncionariosGerenciados(int numeroDeFuncionariosGerenciados) {
        this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
    }

    public void verInformacoes(){
        super.verInformacoes();
        System.out.println("número de funcionario gerencidos é: " + this.numeroDeFuncionariosGerenciados);
    }
}
