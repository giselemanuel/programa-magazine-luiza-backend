package semana2.aula2_pratica1;

public class Pessoa {
    // define os atributos
    private String nome;
    private String cpf;
    private String endereco;
    private Conta conta;

    // construtor

    public Pessoa(String nome, String cpf, String endereco, Conta conta) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.conta = conta;
    }

    // getter e setter

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    // método adicionar conta

    public void adicionarConta(Conta conta){
        this.conta = conta;
    }
}
