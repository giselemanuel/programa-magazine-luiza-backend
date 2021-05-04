package semana2.pratica01_04;

import semana2.pratica01_04.Endereco;

public class Pessoa {
    //atributo ---------------------------------------------------------------------------------------------------------

    private String nome;
    private int numero;
    private Endereco endereco;
    //private int idade;
    //private String cnh;


    //construtor -------------------------------------------------------------------------------------------------------

    public Pessoa(){

    }

    public Pessoa(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }

    //Getter -----------------------------------------------------------------------------------------------------------

    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    //Setter -----------------------------------------------------------------------------------------------------------

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    //Métodos ----------------------------------------------------------------------------------------------------------
    void dormindo(){
        System.out.println("\nEstou dormindo!!!\n zzZzzzZzzzZzzzZZZ");
    }

    public void dirigir(){
        System.out.println("\nEstou Dirigindo !!!");
    }

    void comer(){
        System.out.println("\nEstou comendo");
    }

    public Endereco consultaEndereco(){
        System.out.println(endereco.getLogradouro() + ", " +
                           numero + ", " +
                           endereco.getCidade() + ", " +
                           endereco.getEstado());
        return endereco;
    }

    public void consultaNome(){
        System.out.print("\nO seu nome é: " + nome);
    }

}
