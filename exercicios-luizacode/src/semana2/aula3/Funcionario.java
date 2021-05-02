package semana2.aula3;

import jdk.swing.interop.SwingInterOpUtils;

public class Funcionario {
    protected String nome;
    protected String cpf;
    protected double salario;
    protected int senha;


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

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean autenticar(int senha){
        if(this.senha == senha){
            System.out.print("Acesso permitido!");
            return true;
        }else{
            System.out.print("Acesso negado.");
        }
        return false;
    }

    public void verInformacoes(){
        System.out.println("\n------------INFORMAÇÕES DO FUNCIONARIO --------------");
        System.out.println("O nome do funciorio é " + this.nome);
        System.out.println("O CPF  é " + this.cpf);
        System.out.println("O salário R$  " + this.salario);
        System.out.println("-----------------------------------------------------");

    }

}
